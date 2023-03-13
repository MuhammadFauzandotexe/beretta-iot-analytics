package Emailer;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.smallrye.mutiny.Uni;
import ojan.org.GreetingResource;

import javax.inject.Inject;

public class MailTest {
    @Inject
    static
    Mailer mailer;

    public static void main(String[] args) {
        mailer.send(Mail.withText("to@acme.org", "A simple email from quarkus", "This is my body."));
    }
}
