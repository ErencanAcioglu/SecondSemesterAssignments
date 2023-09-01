
	//Erencan Acıoğlu 150122056
	//A Sheep object represents a real-life sheep. It extends Mammal class. 

public class Sheep extends Mammal {
	
	//count static data field keeps the number of chickens created.
    private static int count = 0;

    public Sheep(String name, int age) {
        super(name, age);
        setLegNumber(4);
        setNumberOfOffsprings(1);
        setPregnancyPerYear(1);
        count++;
    }

   
    public void sayGreeting() {
        System.out.println("Four legs good, two legs better!");
    }

    public static int getCount() {
        return count;
    }

    public static void decrementCount() {
        count--;
    }

	public static void setCount(int count) {
		Sheep.count = count;
	}
}

