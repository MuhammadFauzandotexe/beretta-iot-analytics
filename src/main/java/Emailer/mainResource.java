package Emailer;//https://myaccount.google.com/apppasswords?utm_source=google-account&utm_medium=myaccountsecurity&utm_campaign=tsv-settings&rapt=AEjHL4OCt6_FVvpHA5KNdYwsOg9e9Fp6zvLXJuc6YXGDq_t-WWNvTpQAVRcRg337EnpomdycY_EKtMTrgIURseMrTtzYewQxLg
//      https://quarkus.io/guides/mailer-reference#attachments
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.quarkus.scheduler.Scheduled;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
@Path("/mail")
public class mainResource {
    @Inject Mailer mailer;
    //@Scheduled(every = "10s")
    @GET
    @Blocking
    public void sendEmail() {
        mailer.send(
                Mail.withText("ariniahlasalsabila@gmail.com",
                        "Ahoy from Quarkus",
                        "A simple email sent from a Quarkus application."
                )
        );
    }
    @Inject
    ReactiveMailer reactiveMailer;
    @POST
    @Path("/reactive/")
    public Uni<Void> sendEmailUsingReactiveMailer(JsonObject body) {
        String email = body.getString("email");
        String message = body.getString("message");
        return reactiveMailer.send(
                Mail.withText(email,
                        "Ahoy from Quarkus",
                        message
                )
        );
    }
}
