package nuc.ss.day05;

/**
 * @ClassName TestDate
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/26 19:45
 **/
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//日期类
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());//获取1970年到现在的毫秒数
        System.out.println(date.toLocaleString());//获取当前时间的字符串

        System.out.println("*************************************************************");
        java.sql.Date date1 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date1);//只有年月日
        String t="2022-3-8";
        java.sql.Date date2 = java.sql.Date.valueOf(t);//将字符串转化为日期
        System.out.println(date2);

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));//获取年月日
        System.out.println(calendar.get(Calendar.MARCH));//月是从0开始的
        System.out.println(calendar.get(Calendar.DATE));

        System.out.println(calendar.getActualMaximum(Calendar.DATE));//获取当前月最大天数

        //日期类和日历类相互转化
        Date time = calendar.getTime();//日历类转日期类
        Calendar calendar1 = new GregorianCalendar();
        calendar1.setTime(time);//日期类转日历类

    }
}


