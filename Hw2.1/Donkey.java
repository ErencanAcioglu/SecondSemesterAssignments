
	//Erencan Acıoğlu 150122056
	//A Donkey object represents a real-life donkey. It extends Mammal class. 


public class Donkey extends Mammal {
	
	//count static data field keeps the number of chickens created.
    private static int count = 0;

    public Donkey(String name, int age) {
        super(name, age);
        setLegNumber(4);
        setNumberOfOffsprings(1);
        setPregnancyPerYear(1);
        count++;
    }

    public void sayGreeting() {
        System.out.println("Life will go on as it has always gone –that is, badly!");
    }


    public static void decrementCount() {
        count--;
    }
    
    public static int getCount() {
        return count;
    }

	public static void setCount(int count) {
		Donkey.count = count;
	}
}
