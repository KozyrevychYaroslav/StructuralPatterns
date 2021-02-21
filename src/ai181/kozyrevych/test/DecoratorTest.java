package ai181.kozyrevych.test;

import ai181.kozyrevych.decorator.BigObject;
import ai181.kozyrevych.decorator.GodObject;
import ai181.kozyrevych.decorator.JavaObject;
import ai181.kozyrevych.decorator.UsualObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    @DisplayName("Testing big object with using decorator")
    public void bigObectTest() {
        JavaObject jObj = new BigObject(new UsualObject());
        assertEquals("Usual Object. Many methods. ", jObj.getInfo(), "Incorrect work");
    }

    @Test
    @DisplayName("Testing God object with using decorator")
    public void godObectTest() {
        JavaObject jObj = new GodObject(new BigObject(new UsualObject()));
        assertEquals("Usual Object. Many methods. Too many methods", jObj.getInfo(), "Incorrect work");
    }

}
