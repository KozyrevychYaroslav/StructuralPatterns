package ai181.kozyrevych.decorator;

import java.io.FileInputStream;

public class BigObject extends ObjectDecorator {
    public BigObject(JavaObject obj) {
        super(obj);
    }

    public String getBigObjectInfo() {
        return "Many methods. ";
    }

    @Override
    public String getInfo() {
        return obj.getInfo() + getBigObjectInfo();
    }
}
