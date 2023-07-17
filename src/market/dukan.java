package market;

public class dukan {
    private String CustName;
    private String CustId;
    private int CustPhone;
    private double AccBal;
    private  String Address;

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String custId) {
        CustId = custId;
    }

    public int getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(int custPhone) {
        CustPhone = custPhone;
    }

    public double getAccBal() {
        return AccBal;
    }

    public void setAccBal(double accBal) {
        AccBal = accBal;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public  void shop(double amount){
        if(AccBal >= amount)
        {
            double AvBal= AccBal-amount;
            System.out.println(" Thank you for Shopping ... your Avialable amount is "+AvBal);
            AccBal=AvBal;
        }
        else

            System.out.println("Paisa kam hai bhai Recharge kr le account me etna hi hau : "+AccBal);
    }

    public  void recharge(double paisa){
        AccBal= AccBal+paisa;
        System.out.println(" Recharge ho gelau bhai thik hau av udauu jetna udabe ke hai lekin "+AccBal+ " hi hau bhaiiba");

    }
}
