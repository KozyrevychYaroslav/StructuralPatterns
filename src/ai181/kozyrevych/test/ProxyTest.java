package ai181.kozyrevych.test;

import ai181.kozyrevych.proxy.MainWebpageAccess;
import ai181.kozyrevych.proxy.WebpageAccess;
import ai181.kozyrevych.proxy.WebpageAccessProxy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {

    @Test
    @DisplayName("Testing WebpageAccessProxy")
    public void testProxy() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        WebpageAccess webpageAccess = new MainWebpageAccess("username");
        webpageAccess.grantWebpageAcess();
        assertEquals("Access is granted for user: username", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        webpageAccess = new WebpageAccessProxy("username");
        webpageAccess.grantWebpageAcess();
        assertEquals("Access is not granted for user: username", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        webpageAccess.grantWebpageAcess();
        assertEquals("Access is granted for user: username", outputStreamCaptor.toString().trim());
        System.setOut(System.out);
    }
}
