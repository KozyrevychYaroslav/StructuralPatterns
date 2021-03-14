package ai181.kozyrevych.composite;

public class SomeFile implements MyFile {

    private String name = "";

    public SomeFile(String name) {
        this.name = "File [name: " + name + ']';
    }

    @Override
    public void printFileName() {
        System.out.println(name);
    }

    @Override
    public void addFile(MyFile f) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFile(MyFile f) {
        throw new UnsupportedOperationException();
    }

}
