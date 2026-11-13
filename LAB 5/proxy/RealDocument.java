package proxy;

class RealDocument implements Document {
    private String content;
    RealDocument(String content) { this.content = content; }
    public String read() { return content; }
}