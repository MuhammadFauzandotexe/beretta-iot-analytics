package Emailer;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;

public class Emailer2 {
    public static void main(String[] args) {
        ReactiveMailer reactiveMailer = null;
        Uni<Void> stage = reactiveMailer.send(Mail.withText("ariniahlasalsabila@gmail.com", "A reactive email from quarkus", "This is my body."));
    }
}
