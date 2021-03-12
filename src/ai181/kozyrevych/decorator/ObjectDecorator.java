package ai181.kozyrevych.decorator;

public abstract class ObjectDecorator implements JavaObject {
    protected JavaObject obj;

    public ObjectDecorator(JavaObject obj) {
        this.obj = obj;
    }


    public abstract String getInfo();
}
