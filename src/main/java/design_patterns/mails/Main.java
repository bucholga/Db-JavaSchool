package design_patterns.mails;

import lombok.SneakyThrows;
import com.github.javafaker.Faker;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType(RandomUtil.between(1, 2))
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);

        }
    }
}
