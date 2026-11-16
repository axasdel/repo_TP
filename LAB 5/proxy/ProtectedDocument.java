package proxy;

class ProtectedDocument implements Document {
    private RealDocument real;
    private String role;

    ProtectedDocument(String content, String role) {
        this.real = new RealDocument(content);
        this.role = role;
    }

    public String read() {
        if ("editor".equals(role)) {
            return real.read();
        } else if ("guest".equals(role)) {
            return "[только заголовок] " + real.read().split("\n")[0];
        }
        return "доступ запрещён";
    }
}