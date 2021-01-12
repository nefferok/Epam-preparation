import java.io.*;

public class TextFile {
    FileName file;
    FileDirectory directory;

    public TextFile(FileName file, FileDirectory directory) {
        this.file = file;
        this.directory = directory;
    }

    public void createNewTextFile(){
        new File(this.directory.getPath()).mkdir();
        File file = new File(this.directory.getPath()+"/"+this.file.getName());
        try {
            file.createNewFile();
            System.out.println("New file: "+this.file.getName()+" was created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rename(FileName newName){
        File file = new File(this.directory.getPath()+"/"+this.file.getName());
        this.file.setName(newName.getName());
        if(file.exists()){
            file.renameTo(new File(this.directory.getPath()+"/"+this.file.getName()));
            System.out.println("File: "+this.file.getName()+" was renamed");

        }
        else{
            System.out.println("File not found!");
        }
    }

    public void addNewInformation (String newText) throws IOException {
        File file = new File(this.directory.getPath()+"/"+this.file.getName());
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile(),true));
        writer.write(newText);
        writer.close();
    }

    public void output() throws IOException {
        File file = new File(this.directory.getPath()+"/"+this.file.getName());
        BufferedReader reader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
        String text = "";
        while((text = reader.readLine()) != null) {
            System.out.println(text);
        }
        reader.close();
    }

    public void deleteFail() {
        File file = new File(this.directory.getPath() + "/" + this.file.getName());
        String path = this.directory.getPath() + "/" + this.file.getName();
        if (file.delete()) {
            System.out.println(path + " file was deleted");
        } else System.out.println(path + " wasn't found");
    }
}
