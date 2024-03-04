// Path: CommandDP/src/main/java/Document.java
public class Document {
    public void copy(int x, int y, String text) {
        // Copy the text to the clipboard
        System.out.println("Copied text: " + text + " at position (" + x + ", " + y + ")");
    }

    public void paste(int x, int y, String text) {
        // Paste the text to the document
        System.out.println("Pasted text: " + text + " at position (" + x + ", " + y + ")");
    }
}
