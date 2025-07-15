class TextNode {
    String content;
    TextNode prev, next;
    TextNode(String content) {
        this.content = content;
    }
}

public class TextEditorUndoRedo {
    TextNode head = null, current = null;

    void type(String newText) {
        TextNode node = new TextNode(newText);
        if (current != null) {
            node.prev = current;
            current.next = node;
        } else head = node;
        current = node;
    }

    void undo() {
        if (current != null && current.prev != null) current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null) current = current.next;
    }

    void show() {
        if (current != null) System.out.println("Current Text: " + current.content);
        else System.out.println("Empty");
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();
        editor.type("Hello");
        editor.type("World");
        editor.show();
        editor.undo();
        editor.show();
        editor.redo();
        editor.show();
    }
}