package Emailer;
import javax.inject.Inject;
public class pakaiMain {
    @Inject
    static
    mainResource mainrest;
    public static void main(String[] args) {
        mainrest.sendEmail();
    }
}
