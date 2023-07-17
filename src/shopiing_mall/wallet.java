package shopiing_mall;

import java.util.Scanner;

public class wallet extends ShoppingCart{
    double wallet_balance=95.00;
    public static void balance(){
        double balance =0.0;
        System.out.println(" your current balance is " +balance);

    }
    public void recharge(double amount)
    {
        wallet_balance=wallet_balance+amount;
        System.out.println("thanks for recharge : ) ");
        System.out.println("your Current balance is "+wallet_balance);
    }
    public void updateBalance(double item_price)
    {
        wallet_balance = wallet_balance-item_price;
        System.out.println("your upadated balance is "+wallet_balance);

    }

    public void bill(double item_price) {
        if (item_price < wallet_balance) {
            System.out.println("thanks for purchasing");
            updateBalance(item_price);
        } else if (item_price > wallet_balance) {
            System.out.println(" Low Balance :: ");
            double recarge_amt = item_price - wallet_balance;
            System.out.println("Please recharge your wallet with " + recarge_amt);
            Scanner sc = new Scanner(System.in);
            System.out.println(" Please enter the amount you want to recharge your wallet with :");
            double amount = sc.nextInt();
            recharge(amount);

        }
    }
    }

