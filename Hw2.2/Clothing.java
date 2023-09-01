

	//Erencan Acıoğlu 150122056

	//The Clothing class represents any piece of clothing.
	//Clothing class extends Item class and implements Washable interface.
public abstract class Clothing extends Item implements Washable {
	
  public Clothing() {
    setVat(0.18);
    
  }
  
  public abstract void howToWash();
  
}


