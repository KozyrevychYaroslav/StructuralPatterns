package ai181.kozyrevych.adapter;

import java.util.Date;

public class FrameworkN1 implements NormalDate {

    private Date date = new Date();

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }


}
