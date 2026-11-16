package proxy;

public class Main {
    public static void main(String[] args) {
        String content = "заголовок документа\nполный текст документа";

        Document editor = new ProtectedDocument(content, "editor");
        Document guest = new ProtectedDocument(content, "guest");
        Document unknown = new ProtectedDocument(content, "unknown");

        System.out.println("[editor] " + editor.read());
        System.out.println("[guest] " + guest.read());
        System.out.println("[unknown] " + unknown.read());
    }
}