// Path: CommandDP/src/main/java/PasteCommand.java
public class PasteCommand implements Command {
    private Document document;
    private int x;
    private int y;
    private String text;

    public PasteCommand(Document document, int x, int y, String text) {
        this.document = document;
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void execute() {
        document.paste(x, y, text);
    }
}
