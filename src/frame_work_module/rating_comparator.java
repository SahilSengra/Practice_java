package frame_work_module;

import java.util.Comparator;

public class rating_comparator implements Comparator<movie> {
    @Override
    public int compare(movie M1, movie M2) {
        if(M1.getRating()<M2.getRating()) return -1;
        if(M1.getRating()>M2.getRating()) return -1;
        else  return 0;
    }
}
