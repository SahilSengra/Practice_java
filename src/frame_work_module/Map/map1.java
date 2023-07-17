package frame_work_module.Map;

import java.util.HashMap;
import java.util.Map;

public class map1 {
    public static void main(String[] args) {
        Map<String,String > prepinsta = new HashMap<>();

        prepinsta.put("Manish","cofounder");
        prepinsta.put("Atualya","founder");
        prepinsta.put("Vaibhav","CDM");
        prepinsta.put("Sahil","Boss");
        prepinsta.put("aadi","cp");


//        for (String key : prepinsta.keySet()){
//            System.out.println(key + "-"+ prepinsta.get(key));
//        }
//        prepinsta.remove("sahil");

        System.out.println(prepinsta.replace("Sahil","xx"));
        for (String key : prepinsta.keySet()){
            System.out.println(key + "-"+ prepinsta.get(key));
        }
    }
}
