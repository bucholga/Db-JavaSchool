package design_patterns.mails;

public class MailSender {

    public void send(MailInfo mailInfo) {
        //todo refactor this to beautiful code
        MailType.handle(mailInfo);

    }
}