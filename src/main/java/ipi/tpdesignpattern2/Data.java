package ipi.tpdesignpattern2;

public class Data {
    private String format;
    private String content;

    public Data(String format, String content) {
        this.format = format;
        this.content = content;
    }

    public String getFormat() {
        return format;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Format: " + format + ", Content: " + content;
    }
}
