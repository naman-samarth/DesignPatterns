package structural.composite;

public class Runner {
    public static void main(String[] args) {
        FileSystemObject file1 = new File("model-v1.bin");
        FileSystemObject file2 = new File("model-v2.bin");
        FileSystemObject file3 = new File("dataset.csv");
        Folder folder1 = new Folder("/ml");
        Folder folder2 = new Folder("/dataset");
        Folder folder3 = new Folder("/models");

        folder2.add(file3);
        folder3.add(file1);
        folder3.add(file2);
        folder1.add(folder2);
        folder1.add(folder3);

        folder1.print();



    }
}
