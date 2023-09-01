

	//Erencan Acıoğlu 150122056


import java.util.ArrayList;

public class ShoppingMall {
	
	//The data field items keeps all the items in the shopping mall.
    private ArrayList<Item> items;

    	
    public ShoppingMall() {
        this.items = new ArrayList<>();
    }
    
    	//getItems method is getter for items ArrayList.
    public ArrayList<Item> getItems() {
        return this.items;
    }
    	//addDairy method adds a default Dairy object to items ArrayList.
    public void addDairy() {
        items.add(new Dairy());
    }
    	
    	//addFruit method adds a default Fruit object to items ArrayList.
    public void addFruit() {
        items.add(new Fruit());
    }

    	//addTop method adds a default Top object to items ArrayList.
    public void addTop() {
        items.add(new Top());
    }

    	//addTrousers method adds a default Trousers object to items ArrayList.
    public void addTrousers() {
        items.add(new Trousers());
    }

    	//addUnderware method adds a default Underware object to items ArrayList.
    public void addUnderware() {
        items.add(new Underware());
    }

    	//addVegetable method adds a default Vegetable object to items ArrayList.
    public void addVegetable() {
        items.add(new Vegetable());
    }

    	//addArbitrary method adds the given Item object to items ArrayList.
    public void addArbitrary(Item item) {
        items.add(item);
    }

    	// bill method iterates through the items ArrayList and calculates the total price of items in the ArrayList.
    public double bill() {
        double totalPrice = 0.0;
        for (int i = 0; i < items.size(); i++) {
        	totalPrice += items.get(i).calculatePrice();
        }
        return totalPrice;
    }
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

}


