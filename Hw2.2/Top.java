

	//Erencan Acıoğlu 150122056

	//A Top object represents a real-life top clothing.
	//Top class extends Clothing class.
public class Top extends Clothing  {
	
    public Top() {
        this(20.0);
        
    }
    
    public Top(double basePrice) {
        setBasePrice(basePrice);
    }
    
    public double calculatePrice() {
        double taxedPrice = (getBasePrice() * (getVat()+1));
        //20% profit
        double retailPrice = (taxedPrice * 1.2);
        return retailPrice;
    }
    
    public void howToWash() {
        System.out.println("Wash Top at 40 degrees.");
    }
}


