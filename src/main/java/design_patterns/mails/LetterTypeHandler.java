package design_patterns.mails;

public class LetterTypeHandler implements TypeHandler{
    public void handle(String type, String content) {
        System.out.println(type + " mail was sent. " + content);
    }
}
