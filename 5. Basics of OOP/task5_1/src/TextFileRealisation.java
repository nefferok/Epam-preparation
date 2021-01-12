import java.io.IOException;

public class TextFileRealisation {
    public static void main(String[] args) throws IOException {
        FileDirectory path = new FileDirectory("src/directory");
        FileName name = new FileName("Text.txt");
        TextFile newText = new TextFile (name, path);
        newText.createNewTextFile();

        FileName newName = new FileName("New Name.txt");
        newText.rename(newName);

        newText.addNewInformation("This is a new information\n");
        newText.addNewInformation("This is a new information\n");
        newText.addNewInformation("This is a new information\n");

        newText.output();

        newText.deleteFail();


    }
}
