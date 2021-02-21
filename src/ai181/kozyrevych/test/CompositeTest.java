package ai181.kozyrevych.test;

import ai181.kozyrevych.composite.DirectoryComposite;
import ai181.kozyrevych.composite.MyFile;
import ai181.kozyrevych.composite.SomeFile;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private MyFile file1;
    private MyFile file2;
    private MyFile file3;
    private MyFile file4;
    private MyFile file5;
    private DirectoryComposite composite1;
    private DirectoryComposite composite2;

    @BeforeEach
    void configureBefore() {
        System.setOut(new PrintStream(outputStreamCaptor));
        file1 = new SomeFile("file1");
        file2 = new SomeFile("file2");
        file3 = new SomeFile("file3");
        file4 = new SomeFile("file4");
        file5 = new SomeFile("file5");

        composite1 = new DirectoryComposite();
        composite2 = new DirectoryComposite();

        composite2.addFile(file3);
        composite2.addFile(file4);

        composite1.addFile(file1);
        composite1.addFile(file2);
        composite1.addFile(composite2);
        composite1.addFile(file5);

    }

    @AfterEach
    void configureAfter() {
        outputStreamCaptor.reset();
    }

    @AfterClass
    public static void defaultSetting() {
        System.setOut(System.out);
    }


    @DisplayName("Get all files from composite")
    @Test
    public void getFiles() {

        composite1.printFileName();

        assertEquals("File [name: file1]\r\n" +
                "File [name: file2]\r\n" +
                "File [name: file3]\r\n" +
                "File [name: file4]\r\n" +
                "File [name: file5]", outputStreamCaptor.toString().trim());
    }

    @DisplayName("Testing deletion")
    @Test
    public void deleteFiles() {
        composite1.removeFile(file1);

        composite1.printFileName();

        assertEquals("File [name: file2]\r\n" +
                "File [name: file3]\r\n" +
                "File [name: file4]\r\n" +
                "File [name: file5]", outputStreamCaptor.toString().trim());

        composite1.removeFile(composite2);
        outputStreamCaptor.reset();
        composite1.printFileName();

        assertEquals("File [name: file2]\r\n" +
                "File [name: file5]", outputStreamCaptor.toString().trim());

    }

    @DisplayName("Testing adding files")
    @Test
    public void addFiles() {
        composite1.addFile(new SomeFile("new_file"));

        composite1.printFileName();

        assertEquals("File [name: file1]\r\n" +
                "File [name: file2]\r\n" +
                "File [name: file3]\r\n" +
                "File [name: file4]\r\n" +
                "File [name: file5]\r\n" +
                "File [name: new_file]", outputStreamCaptor.toString().trim());

    }
}
