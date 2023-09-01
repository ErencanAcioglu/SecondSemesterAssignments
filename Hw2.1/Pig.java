
	//Erencan Acıoğlu 150122056
	//Pig object represents a real-life pig. It extends Mammal class.
public class Pig extends Mammal {
	
	//count static data field keeps the number of chickens created.
    private static int count = 0;
    
    public Pig(String name, int age) {
        super(name, age);
        setLegNumber(4);
        setNumberOfOffsprings(12);
        setPregnancyPerYear(2);
        count++;
    }
    
    public void sayGreeting() {
        System.out.println("All animals are equal, but some animals are more equal than others!");
    }
    
    public static int getCount() {
        return count;
    }
    
    public static void decrementCount() {
        count--;
    }
	public static void setCount(int count) {
		Pig.count = count;
	}
}
