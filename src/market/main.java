package market;

public class main {
    public static void main(String[] args) {
        dukan ham_hai_bhai = new dukan();
        ham_hai_bhai.setAddress("jehanabad");
        ham_hai_bhai.setAccBal(1000);
        ham_hai_bhai.setCustId("don");
        ham_hai_bhai.setCustName("Sahil Sengra");
        ham_hai_bhai.setCustPhone(19292837);

        ham_hai_bhai.shop(999);
        ham_hai_bhai.shop(100);

    }
}
