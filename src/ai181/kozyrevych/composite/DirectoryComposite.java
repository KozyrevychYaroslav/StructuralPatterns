package ai181.kozyrevych.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements MyFile {

    private List<MyFile> fileComposites = new ArrayList<>();

    public void addFile(MyFile f) {
        fileComposites.add(f);
    }

    public void removeFile(MyFile f) {
        fileComposites.remove(f);
    }

    @Override
    public void printFileName() {
        fileComposites.forEach(MyFile::printFileName);
    }
}
