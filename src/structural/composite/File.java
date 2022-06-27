package structural.composite;

public class File implements FileSystemObject {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print() {
        System.out.println(fileName);
    }
}
