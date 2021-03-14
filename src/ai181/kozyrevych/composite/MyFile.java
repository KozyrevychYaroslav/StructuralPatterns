package ai181.kozyrevych.composite;

public interface MyFile {

    void printFileName();
    void addFile(MyFile f);
    void removeFile(MyFile f);
}
