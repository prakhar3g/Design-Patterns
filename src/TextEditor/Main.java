package TextEditor;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TextEditor {
    private List<String> content;
    private String clipboard;
    private Stack<Command> history;
    private int currentPosition;

    public TextEditor() {
        content = new ArrayList<>();
        clipboard = "";
        history = new Stack<>();
        currentPosition = 0;
    }

    public void display() {
        for (String line : content) {
            System.out.println(line);
        }
    }

    public void display(int n, int m) {
        if (n >= 1 && n <= content.size() && m >= n && m <= content.size()) {
            for (int i = n - 1; i <= m - 1; i++) {
                System.out.println(content.get(i));
            }
        } else {
            System.out.println("Invalid range.");
        }
    }

    public void insert(int n, String text) {
        if (n >= 1 && n <= content.size() + 1) {
            content.add(n - 1, text);
            currentPosition = n;
            saveCommand(new Command("insert", n, text));
        } else {
            System.out.println("Invalid line number.");
        }
    }

    public void delete(int n) {
        if (n >= 1 && n <= content.size()) {
            String deletedLine = content.remove(n - 1);
            saveCommand(new Command("delete", n, deletedLine));
        } else {
            System.out.println("Invalid line number.");
        }
    }

    public void delete(int n, int m) {
        if (n >= 1 && n <= content.size() && m >= n && m <= content.size()) {
            List<String> deletedLines = new ArrayList<>();
            for (int i = n - 1; i <= m - 1; i++) {
                deletedLines.add(content.remove(n - 1));
            }
            saveCommand(new Command("delete", n, deletedLines));
        } else {
            System.out.println("Invalid range.");
        }
    }

    public void copy(int n, int m) {
        if (n >= 1 && n <= content.size() && m >= n && m <= content.size()) {
            StringBuilder copiedText = new StringBuilder();
            for (int i = n - 1; i <= m - 1; i++) {
                copiedText.append(content.get(i)).append("\n");
            }
            clipboard = copiedText.toString();
            System.out.println("Copied lines " + n + " to " + m + " to clipboard.");
        } else {
            System.out.println("Invalid range.");
        }
    }

    public void paste(int n) {
        if (n >= 1 && n <= content.size()) {
            String[] linesToPaste = clipboard.split("\n");
            for (int i = 0; i < linesToPaste.length; i++) {
                content.add(n - 1 + i, linesToPaste[i]);
            }
            currentPosition = n + linesToPaste.length - 1;
            saveCommand(new Command("paste", n, linesToPaste.length));
        } else {
            System.out.println("Invalid line number.");
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            if (lastCommand.getOperation().equals("insert")) {
                content.remove(lastCommand.getPosition() - 1);
            } else if (lastCommand.getOperation().equals("delete")) {
                if (lastCommand.getLines() instanceof String) {
                    String deletedLine = (String) lastCommand.getLines();
                    content.add(lastCommand.getPosition() - 1, deletedLine);
                } else if (lastCommand.getLines() instanceof List<?>) {
                    List<String> deletedLines = (List<String>) lastCommand.getLines();
                    int index = lastCommand.getPosition() - 1;
                    for (String line : deletedLines) {
                        content.add(index, line);
                        index++;
                    }
                }
            }
            System.out.println("Undo completed.");
        } else {
            System.out.println("No commands to undo.");
        }
    }

    public void redo() {
        System.out.println("Redo completed.");
    }

    private void saveCommand(Command command) {
        history.push(command);
    }
}

class Command {
    private String operation;
    private int position;
    private Object lines;

    public Command(String operation, int position, Object lines) {
        this.operation = operation;
        this.position = position;
        this.lines = lines;
    }

    public String getOperation() {
        return operation;
    }

    public int getPosition() {
        return position;
    }

    public Object getLines() {
        return lines;
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.insert(1, "Hello");
        textEditor.insert(2, "World");
        textEditor.insert(3, "!");

        System.out.println("Displaying all lines:");
        textEditor.display();
        System.out.println();

        System.out.println("Displaying lines 2 to 3:");
        textEditor.display(2, 3);
        System.out.println();

        textEditor.delete(2);

        System.out.println("Displaying all lines after deleting line 2:");
        textEditor.display();
        System.out.println();

        textEditor.copy(1, 2);
        textEditor.paste(2);

        System.out.println("Displaying all lines after copying lines 1 to 2 and pasting at line 2:");
        textEditor.display();
        System.out.println();

        textEditor.undo();

        System.out.println("Displaying all lines after undoing the last command:");
        textEditor.display();
        System.out.println();
    }
}

