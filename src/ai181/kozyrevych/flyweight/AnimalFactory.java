package ai181.kozyrevych.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
    private static final Map<String, Animal> animals = new HashMap<>();

    public Animal getAnimalByType(String type) {
        Animal animal = animals.get(type);

        if (animal == null) {
            if (type.equals("cat")) {
                animal = new Cat();
            } else if (type.equals("dog")) {
                animal = new Dog();
            } else {
                throw new IllegalArgumentException("Incorrect input type");
            }
            animals.put(type, animal);
        }
        return animal;
    }
}
