package composite;

public class compositeApplication {
    public static void main(String[] args) {
        FileComponent file1 = new File("file1.txt");
        FileComponent file2 = new File("file2.doc");
        FileComponent file3 = new File("file3.pdf");

        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        System.out.println("Details of dir2:");
        dir2.showDetails();
    }
}
