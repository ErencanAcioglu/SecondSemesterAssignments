

	//Erencan Acıoğlu 150122056
	//A Horse object represents a real-life horse. It extends Mammal class. 

public class Horse extends Mammal {
	
	//count static data field keeps the number of chickens created.
    private static int count = 0;

    public Horse(String name, int age) {
        super(name, age);
        setLegNumber(4);
        setNumberOfOffsprings(1);
        setPregnancyPerYear(1);
        count++;
    }

    public void sayGreeting() {
        System.out.println("I will work harder!");
    }

    public static int getCount() {
        return count;
    }

    public static void decrementCount() {
        count--;
    }

	public static void setCount(int count) {
		Horse.count = count;
	}
}

