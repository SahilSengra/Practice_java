import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DateItem{
    String date;
    DateItem(String date) {
        this.date=date;

    }
}
class SortItem implements Comparator<DateItem>{
    @Override
    public int compare(DateItem a, DateItem b) {
        return a.date.compareTo(b.date);
    }
}
public class saransh {
    public static void main(String[] args) {
        ArrayList<DateItem> dateList = new ArrayList<>();
        dateList.add(new DateItem("2020-03-25"));
        dateList.add(new DateItem("2019-01-27"));
        dateList.add(new DateItem("1998-01-27"));
        dateList.add(new DateItem("1998-02-26"));

        Collections.sort(dateList,new SortItem());

        System.out.println("Sorted in Ascending Order");

        for (DateItem d : dateList){
            System.out.println(d.date);
        }

    }
}
