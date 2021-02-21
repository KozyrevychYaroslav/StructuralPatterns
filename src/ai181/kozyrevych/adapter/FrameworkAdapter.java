package ai181.kozyrevych.adapter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FrameworkAdapter implements NormalDate {

    private CalendarDate calendar;

    //не обязательно использовать агрегацию, можно и композицию
    public FrameworkAdapter(CalendarDate calendar) {
        this.calendar = calendar;
    }

    @Override
    public Date getDate() {
        return calendar.getCalendarDate().getTime();
    }

    @Override
    public void setDate(Date date) {
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        calendar.setCalendarDate(c);
    }
}
