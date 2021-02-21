package ai181.kozyrevych.proxy;

public class MainWebpageAccess implements WebpageAccess {
    private String name;

    public MainWebpageAccess(String name) {
        this.name = name;
    }

    @Override
    public void grantWebpageAcess() {
        System.out.println("Access is granted for user: " + name);
    }
}
