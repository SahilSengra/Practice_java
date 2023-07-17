package shopiing_mall;
public class ShoppingCart extends ShoppingList {
    public static double price(String item_name){
        double price =0;
        if(item_name=="fruits")
        {
            price= 40;
        } else if (item_name == "vegi") {
            price=62;

        } else if (item_name== "Drinks") {
            price=45;
        } else if (item_name=="Spices") {
            price =63;
        } else if (item_name=="Oils") {
            price = 75;

        }
        return price;
    }

}
