package frame_work_module;

import java.util.Comparator;

public class Name_compare implements Comparator<movie> {
    @Override
    public int compare(movie M1, movie M2) {
        return M1.getName().compareTo(M2.getName());


    }
}
