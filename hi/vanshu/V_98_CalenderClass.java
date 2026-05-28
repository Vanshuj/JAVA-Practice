package hi.vanshu;
import java.util.Calendar;
public class V_98_CalenderClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));

    }
}
