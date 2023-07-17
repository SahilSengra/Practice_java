package frame_work_module;

import java.util.Comparator;

public class movie  implements Comparator<movie> {
    private  double rating;
    private  String  name;
    private  int year;

    public movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compare(movie o1, movie o2) {
        return o1.year - o2.year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }




}
