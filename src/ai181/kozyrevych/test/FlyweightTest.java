package ai181.kozyrevych.test;

import ai181.kozyrevych.flyweight.Animal;
import ai181.kozyrevych.flyweight.AnimalFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {

    @Test
    @DisplayName("Testing AnimalFactory")
    public void animalFactory() {
        List<Animal> animals = new ArrayList<>();
        AnimalFactory factory = new AnimalFactory();

        animals.add(factory.getAnimalByType("cat"));
        animals.add(factory.getAnimalByType("cat"));

        assertEquals(2, animals.size());

        for (Animal a : animals) {
            assertEquals(a.getAnimalName(), "It's cat");
        }

        animals.add(factory.getAnimalByType("dog"));
        animals.add(factory.getAnimalByType("dog"));

        assertEquals(4, animals.size());

        assertAll(() -> assertEquals("It's cat", animals.get(0).getAnimalName()),
                () -> assertEquals("It's cat", animals.get(1).getAnimalName()),
                () -> assertEquals("It's dog", animals.get(2).getAnimalName()),
                () -> assertEquals("It's dog", animals.get(3).getAnimalName()));
        assertThrows(IllegalArgumentException.class, () -> factory.getAnimalByType("new type"), "No exception");
    }

}
