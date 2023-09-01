

	//Erencan Acıoğlu 150122056

	//A Trousers object represents a real-life trousers.
	//Trousers class extends Clothing class.
public class Trousers extends Clothing {
	
    public Trousers() {
        this(40.0);
        
    }
    
    public Trousers(double basePrice) {
        setBasePrice(basePrice);
    }
    
    public double calculatePrice() {
        double taxedPrice = (getBasePrice() * (getVat()+1));
        //20% profit
        double retailPrice = (taxedPrice * 1.2);
        return retailPrice;
    }
    
    public void howToWash() {
        System.out.println("Wash Trousers at 30 degrees.");
    }
}


