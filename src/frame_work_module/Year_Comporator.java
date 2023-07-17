package frame_work_module;

import java.util.Comparator;

public class Year_Comporator implements Comparator<movie> {

    public int compare(movie M1, movie M2) {
        if(M1.getYear()<M2.getYear()) return -1;
        if(M1.getYear()>M2.getYear()) return -1;
        else  return 0;
    }
}
