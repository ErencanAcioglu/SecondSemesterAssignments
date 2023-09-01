

	//Erencan Acıoğlu 150122056

	//A Dairy object represents a dairy product.
	//Dairy class extends Food class.
public class Dairy extends Food {
	
	double taxedPrice;
	double retailPrice;
	
    public Dairy() {
        this(8.0);
        
    }
    
    public Dairy(double basePrice) {      
        setBasePrice(basePrice);
    }
    
    public double calculatePrice() {
        taxedPrice = (getBasePrice() * (getVat()+1));
        //30% profit
        retailPrice = (taxedPrice * 1.3);
        return retailPrice;
    }

	
}


