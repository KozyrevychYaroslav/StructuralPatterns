package ai181.kozyrevych.decorator;

public class BigObject extends ObjectDecorator {
    public BigObject(JavaObject obj) {
        super(obj);
    }

    public String getBigObjectInfo() {
        return "Many methods. ";
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getBigObjectInfo();
    }
}
