

	//Erencan Acıoğlu 150122056

	//A Underwear object represents a real-life underwear.
	//Underwear class extends Clothing class.
	
	//Although the correct spelling is 'underwear', it has been written as 'underware' throughout the instructions, so I also wrote 'underware' in the class and method names.
public class Underware extends Clothing {
	
    public Underware() {
        this(30.0);
        
    }
    
    public Underware(double basePrice) {
        setBasePrice(basePrice);
    }
    
    public double calculatePrice() {
        double taxedPrice = (getBasePrice() * (getVat()+1));
        //45% profit
        double retailPrice = (taxedPrice * 1.45);
        return retailPrice;
    }
    
    public void howToWash() {
        System.out.println("Wash Underware at 60 degrees.");
    }
}


