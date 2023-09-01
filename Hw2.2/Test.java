

	//Erencan Acıoğlu 150122056
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        //ShoppingMall object
        ShoppingMall shoppingMall = new ShoppingMall();

        //default items
        shoppingMall.addDairy();
        shoppingMall.addFruit();
        shoppingMall.addTop();
        shoppingMall.addTrousers();
        shoppingMall.addUnderware();
        shoppingMall.addVegetable();

        //Top object with basePrice = 100
        Item topObject = new Top(100.0);
        
        //Adding object with addArbitarity method
        shoppingMall.addArbitrary(topObject);

        
        printContent(shoppingMall);

       
        printWashingInstructions(shoppingMall);

       
        System.out.println("Total bill is: " + shoppingMall.bill());
    }

    public static void printContent(ShoppingMall shoppingMall) {
    	
        ArrayList<Item> items = shoppingMall.getItems();
        
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item instanceof Vegan) {
            	//invokes madeOf
                ((Vegan) item).madeOf();
            }
        }
    }

    public static void printWashingInstructions(ShoppingMall shoppingMall) {
    	
        ArrayList<Item> items = shoppingMall.getItems();
        
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item instanceof Washable) {
            	//invokes howToWash
                ((Washable) item).howToWash();
            }
        }
    }

}

