package frame_work_module;

public class Phone_directory implements Comparable<Phone_directory>  {
    private String contact_name;
    private  String contact_number;

    public Phone_directory(String contact_name, String contact_number) {
        this.contact_name = contact_name;
        this.contact_number = contact_number;
    }

    @Override
    public int compareTo(Phone_directory o) {
       if(this.contact_name.compareTo(o.contact_name)==0){
           return 0;
       } else if (this.contact_name.compareTo(o.contact_name)>0) {
           return 1;

       }
       else
           return -1;
    }

    public String getContact_name() {
        return contact_name;
    }

    public String getContact_number() {
        return contact_number;
    }
}
