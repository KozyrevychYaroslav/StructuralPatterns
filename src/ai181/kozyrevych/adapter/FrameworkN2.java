package ai181.kozyrevych.adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FrameworkN2 implements CalendarDate {

    Calendar calendar = new GregorianCalendar();

    @Override
    public Calendar getCalendarDate() {
        return calendar;
    }

    @Override
    public void setCalendarDate(Calendar calendar) {
        this.calendar = calendar;
    }
}
