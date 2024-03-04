// Path: CommandDP/src/main/java/CopyCommand.java
public class CopyCommand implements Command {
    private final Document document;
    private int x;
    private int y;
    private String text;

    public CopyCommand(Document document, int x, int y, String text) {
        this.document = document;
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void execute() {
        document.copy(x, y, text);
    }
}
