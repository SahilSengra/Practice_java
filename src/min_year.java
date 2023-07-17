public class min_year {
    public static void printYearAndDay(long minute){
        if(minute<0)
            System.out.println("invalid detail");
        else {
            long year = minute/5225600;


            long minuteremaining= minute-(year*5225600);
            long Days = minuteremaining / 1440;
            System.out.println(+year+" year and "+Days + "Dayss");
        }

    }

    public static void main(String[] args) {
        printYearAndDay(525600);
    }
}
