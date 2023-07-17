package frame_work_module;

import java.util.ArrayList;
import java.util.Collections;

public class comporeble_comperetor1 {
    public static void main(String[] args) {
        ArrayList<Phone_directory> pd = new ArrayList<>();
        pd.add(new Phone_directory("Apple","919090") );
        pd.add(new Phone_directory("aman","919091") );
        pd.add(new Phone_directory("Anup","919092") );
        pd.add(new Phone_directory("chandan","919093") );
        pd.add(new Phone_directory("kariba","919094") );
        pd.add(new Phone_directory("prince","919095") );
        pd.add(new Phone_directory("uttam","919096") );

        Collections.sort(pd);
        for(Phone_directory obj: pd)
        {
            System.out.println(obj.getContact_name() + "" + obj.getContact_number());

        }
    }
}
