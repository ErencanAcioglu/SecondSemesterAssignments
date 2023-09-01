

	//Erencan Acıoğlu 150122056
	//A Chicken object represents a real-life chicken. It extends Bird class.
	
public class Chicken extends Bird {
	
	//count static data field keeps the number of chickens created.
    private static int count = 0;

    public Chicken(String name, int age) {
        super(name, age);
        setLegNumber(2);
        setNumberOfOffsprings(1);
        setPregnancyPerYear(200);
        count++;
    }

    public void sayGreeting() {
        System.out.println("I have nothing to say other than I am against Pigs!");
    }

    public static int getCount() {
        return count;
    }

    public static void decrementCount() {
        count--;
    }

	public static void setCount(int count) {
		Chicken.count = count;
	}
}

