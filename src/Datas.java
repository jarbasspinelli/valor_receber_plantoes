import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Datas {
    private Date CheckIn;
    private Date CheckOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Datas(Date CheckIn, Date CheckOut) {
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
    }

    public Date getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(Date checkIn) {
        this.CheckIn = checkIn;
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Date checkOut) {
        this.CheckOut = checkOut;
    }

    public long duracao() {
        long diff = CheckOut.getTime() - CheckIn.getTime();
        return TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
    }

    Calendar cal = Calendar.getInstance();
    int hora = cal.get(Calendar.HOUR);
}
