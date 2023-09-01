

	//Erencan Acıoğlu 150122056

	//A Fruit object represents a real-life fruit.
	//Fruit class extends Food class and implements Vegan and Washable interfaces.
public class Fruit extends Food implements Vegan, Washable {
    
    public Fruit() {
        this(6.0);
        
    }
    
    public Fruit(double basePrice) {        
        setBasePrice(basePrice);
    }
    
    
    public double calculatePrice() {
        double taxedPrice = (getBasePrice() * (getVat()+1));
        //20% profit
        double retailPrice =(taxedPrice * 1.2);
        return retailPrice;
    }
    
   
    public void howToWash() {
        System.out.println("Wash Fruit with cold water.");
    }
    
    
    public void madeOf() {
        System.out.println("It is made only of fruits.");
    }



}


