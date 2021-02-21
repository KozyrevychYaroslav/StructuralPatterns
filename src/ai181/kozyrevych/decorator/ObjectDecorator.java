package ai181.kozyrevych.decorator;

public abstract class ObjectDecorator implements JavaObject {
    private JavaObject obj;

    public ObjectDecorator(JavaObject obj) {
        this.obj = obj;
    }

    @Override
    public String getInfo() {
        return obj.getInfo();
    }
}
