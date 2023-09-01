

	//Erencan Acıoğlu 150122056

	//The Item class represents anything that is being sold at the shopping mall.
public abstract class Item {
	
	//The data field vat represents value added tax for each item.
  private double vat;
  
  /*The data field basePrice represents the price of the item when there is no taxes or
  profit added.*/
  private double basePrice;
  
  //getVat and setVat methods are accessor methods for vat data field.
  public double getVat() {
    return vat;
    
  }
  
  public void setVat(double vat) {
    this.vat = vat;
    
  }
  //getBasePrice and setBasePrice methods are accessor methods for basePricedata field.
  public double getBasePrice() {
    return basePrice;
    
  }
  
  public void setBasePrice(double price) {
    this.basePrice = price;
    
  }
  //calculatePrice abstract method calculates the final price of the item.
  public abstract double calculatePrice();
  
}

