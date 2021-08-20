package design_patterns.mails;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MailType {
    WELCOME(1,"Welcome", new LetterTypeHandler()), BIRTHDAY(2,"Happy Birthday", new LetterTypeHandler());
    private final int type;
    private final String text;
    private final TypeHandler typeHandler;
    public static void handle(MailInfo mailInfo) {

        for (MailType mailType : values()) {
            if (mailInfo.getMailType() == mailType.type) {
                mailType.typeHandler.handle(mailType.text, mailInfo.getContext());
                return;
            }
        }
        throw new UnsupportedOperationException(mailInfo.getMailType() + " unsupported");

    }
}
