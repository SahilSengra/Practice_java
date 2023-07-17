public class ques_time {
    public static String getDurationString(int min,int sec) {
        if (min < 0 || sec < 0 || sec > 59)
            return "Invalid value";

            long hour = min/60;
            long remain =min%60;
            return +hour + "h"+ min + "m" ;

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
    }

}
