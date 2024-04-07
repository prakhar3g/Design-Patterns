package FlyweightDesignPattern.WordProcessor;

public class DocumentLetter implements ILetter{
    private char character;
    private String fontType;
    private int size;

    public DocumentLetter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int row, int col) {

    }
}
