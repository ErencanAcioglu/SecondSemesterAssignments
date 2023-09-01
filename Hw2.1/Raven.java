

	//Erencan Acıoğlu 150122056
	//A Raven object represents a real-life raven. It extends Bird class. 
public class Raven extends Bird {
	
	//count static data field keeps the number of chickens created.
    private static int count = 0;
    
    public Raven(String name, int age) {
        super(name, age);
        setLegNumber(2);
        setNumberOfOffsprings(5);
        setPregnancyPerYear(1);
        count++;
    }
    
    public void sayGreeting() {
        System.out.println("A happy country where we poor animals shall rest forever!");
    }
    
    public static int getCount() {
        return count;
    }
    
    public static void decrementCount() {
        count--;
    }

	public static void setCount(int count) {
		Raven.count = count;
	}
}

