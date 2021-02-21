package ai181.kozyrevych.test;


import ai181.kozyrevych.bridge.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BridgeTest {

    Animal[] animals = {new Cat(new RunMoveMode()), new Fish(new SwimMoveMode()), new Animal(){}};

    @Test
    @DisplayName("Testing bridge pattern")
    public void bridgeTest() {

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        animals[0].moveMode();
        assertEquals("Run move mode",outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        animals[1].moveMode();
        assertEquals("Swim move mode",outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        animals[2].moveMode();
        assertEquals("Animal move mode",outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        System.setOut(System.out);
    }

}
