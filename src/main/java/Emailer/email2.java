package Emailer;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;

public class email2 {
    @Inject
    static
    ReactiveMailer reactiveMailer;
    public static void main(String[] args) {
        //mailer.send(Mail.withText("ariniahlasalsabila@gmail.com", "A simple email from quarkus", "This is my body."));
        Uni<Void> stage = reactiveMailer.send(Mail.withText("ariniahlasalsabila@gmail.com", "A reactive email from quarkus", "This is my body."));
    }
}
