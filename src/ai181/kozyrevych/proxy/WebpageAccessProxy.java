package ai181.kozyrevych.proxy;


public class WebpageAccessProxy implements WebpageAccess {
    private MainWebpageAccess mainWebpageAccess;
    private String name;
    private boolean access;

    public WebpageAccessProxy(String name) {
        this.name = name;
    }

    @Override
    public void grantWebpageAcess() {
        if (access) {
            mainWebpageAccess = new MainWebpageAccess(name);
            mainWebpageAccess.grantWebpageAcess();
        } else {
            System.out.println("Access is not granted for user: " + name);
            setAccess();
        }
    }

    private void setAccess() {
        access = true;
    }
}
