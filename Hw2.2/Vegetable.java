

	//Erencan Acıoğlu 150122056

	//A Vegetable object represents a real-life vegetable.
	//Vegetable class extends Food class and implements Vegan and Washable interfaces.
public class Vegetable extends Food implements Vegan, Washable {
    
    public Vegetable() {
        this(10.0);
        
    }
    
    public Vegetable(double basePrice) {
        setBasePrice(basePrice);
    }
    
    public double calculatePrice() {
        double taxedPrice = (getBasePrice() * (getVat()+1));
        //25% profit
        double retailPrice = (taxedPrice * 1.25);
        return retailPrice;
    }
    
    public void howToWash() {
        System.out.println("Wash Vegetable with warm water.");
    }

    
    public void madeOf() {
        System.out.println("It is made only of vegetables.");
    }

	
}

