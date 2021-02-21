package ai181.kozyrevych.test;

import ai181.kozyrevych.adapter.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    CalendarDate calendar = new FrameworkN2();
    NormalDate date = new FrameworkN1();

    @Test
    @DisplayName("Checking date from frameworks")
    public void adapterDateTest() {
        assertNotEquals(date.getDate().toString(), calendar.getCalendarDate().toString(), "Same date");
    }

    @Test
    @DisplayName("Checking adapter work")
    public void adapterWorkTest() {
        NormalDate adapter = new FrameworkAdapter(calendar);
        Date d = date.getDate();
        assertEquals(d.toString(), adapter.getDate().toString(), "Not same date");

        //set new data and check results
        d.setTime(1000);
        assertNotEquals(d.toString(), adapter.getDate().toString(), "same date");
    }
}
