package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemObject {

    private String folderPath;
    private List<FileSystemObject> children;

    public Folder(String folderPath) {
        this.folderPath = folderPath;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemObject fileSystemObject) {
        children.add(fileSystemObject);
    }

    @Override
    public void print() {
        System.out.println(folderPath);
        for (FileSystemObject fileSystemObject : children) {
            fileSystemObject.print();
        }
    }
}
