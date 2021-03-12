package ai181.kozyrevych.decorator;

public class GodObject extends ObjectDecorator {
    public GodObject(JavaObject obj) {
        super(obj);
    }

    @Override
    public String getInfo() {
        return obj.getInfo() + getGodObjectInfo();
    }

    private String getGodObjectInfo() {
        return "Too many methods";
    }
}
