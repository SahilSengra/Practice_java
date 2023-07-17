package School_detail;

public class School {
    String StudenName;
    String RollNo;
    String Section;
    String Standered;

    public String getStudenName() {
        return StudenName;
    }

    public String getRollNo() {
        return RollNo;
    }

    public String getSection() {
        return Section;
    }

    public String getStandered() {
        return Standered;
    }

    public School(String studenName, String rollNo) {
        this(studenName,rollNo,"A","IX");

    }

    public School(){
        this("defname","3B","A","IX");
    }

    public School(String studenName, String rollNo, String section, String standered) {
        StudenName = studenName;
        RollNo = rollNo;
        Section = section;
        Standered = standered;
    }


}
