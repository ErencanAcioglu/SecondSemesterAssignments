
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Animal Farm simulation program!");
        System.out.print("Please enter the capacity of the animal farm: ");
        int capacity = scanner.nextInt();
        AnimalFarm animalFarm = new AnimalFarm(capacity);
        int options;
        for (;;) {
            System.out.println("0 - Exit the program");
            System.out.println("1 - Add animal");
            System.out.println("2 - Remove animal");
            System.out.println("3 - Search animal");
            System.out.println("4 - Sort animals");
            System.out.println("5 - Calculate next year's population estimate");
            System.out.println("6 - Print all animal's movements");
            System.out.println("7 - Print all animal's eating habits");
            System.out.println("8 - Print report");
            System.out.print("Please enter your choice: ");
            options = scanner.nextInt();
            
            //ends program.
            if (options == 0) {
                System.out.println("Program is terminated.");
                break;
            } else if (options == 1) {
                System.out.println("1 - Chicken");
                System.out.println("2 - Donkey");
                System.out.println("3 - Horse");
                System.out.println("4 - Pig");
                System.out.println("5 - Raven");
                System.out.println("6 - Sheep");
                System.out.print("Select animal type: ");
                int typeOfAnimal = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter the name: ");
                String name = scanner.nextLine();
                System.out.print("Enter the age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                Animal animal;
                if (typeOfAnimal == 1) {
                    animal = new Chicken(name, age);
                } else if (typeOfAnimal == 2) {
                    animal = new Donkey(name, age);
                } else if (typeOfAnimal == 3) {
                    animal = new Horse(name, age);
                } else if (typeOfAnimal == 4) {
                    animal = new Pig(name, age);
                } else if (typeOfAnimal == 5) {
                    animal = new Raven(name, age);
                } else if (typeOfAnimal == 6) {
                    animal = new Sheep(name, age);
                } else {
                    System.out.println("Please enter a number between 1-6.");
                    continue;
                }
                //Prevents you from entering the same name
                try {
                    animalFarm.addAnimal(animal);
                    
                } catch (IllegalNameException e) {
                    System.out.println(e.getMessage());
                }
            } 
            else if (options == 2) {
                System.out.print("Enter the name of the animal you want to remove: ");
                scanner.nextLine(); 
                String removeName = scanner.nextLine();
                boolean removed = animalFarm.removeAnimal(removeName);
                if (removed) {
                    System.out.println(removeName + " removed successfully.");
                } 
                else {
                	System.out.println("There is no animal with that name, please enter a valid name.");
                }
            }


                          
            
            else if (options == 3) {
                System.out.println("1- Search based on name");
                System.out.println("2- Search based on age");
                System.out.print("Please enter your choice: ");
                int searchChoice = scanner.nextInt();
                scanner.nextLine(); 
                
                if (searchChoice == 1) {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
               
                    if (name != null) {
                    	animalFarm.searchBasedOnName(name);
                    } 
                    else { 
                    	System.out.println("There is no animal with that name, please enter a valid name.");
                    }
                }  if (searchChoice == 2) {
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    
                    if (age != 0) {
                    	animalFarm.searchBasedOnAge(age);
                    }           
                    else { 
                    	System.out.println("There is no animal with that age, please enter a valid age.");
                    }
                    
                    
                    	} 
                else if(searchChoice < 1 || searchChoice > 2) {
                System.out.println("Please enter a number between 1-2. ");
                }
                
        } 
            
            else if (options == 4) {
                System.out.println("1. Sort based on name");
                System.out.println("2. Sort based on leg number");
                System.out.println("3. Sort based on age");
                System.out.println("4. Sort based on addition date");
                System.out.print("Please enter your choice: ");
                int choiceOfSort = scanner.nextInt();
                scanner.nextLine(); 

                if (choiceOfSort == 1) {
                    animalFarm.sortAlphabetically();
                   
                } else if (choiceOfSort == 2) {
                    animalFarm.sortBasedOnLegNumber();
                   
                }  else if (choiceOfSort == 3) {
                	animalFarm.sortBasedOnAge();
                	
                }  else if (choiceOfSort == 4) {
                	animalFarm.printAllAnimals();
                	
                }
                
                else {
                    System.out.println("Please enter a number between 1-4 for your sort choice.");
                }
            }
                
            else if (options == 5) {
            	int nextYearPopulation = animalFarm.nextYearPopulationForecast();
            	System.out.println(nextYearPopulation);
            	}
            else if (options == 6) {
            	animalFarm.animalMovements();
            }
            else if (options == 7) {
            	animalFarm.eatingHabits();
            }
            else if (options == 8) {
            	Scanner input = new Scanner(System.in);
            	System.out.print("Enter filename: ");
            	String fileName = input.nextLine();
            	scanner.nextLine();
            	try {
            		animalFarm.printReport(fileName);
            	} catch(Exception e) {
            		System.out.println(e.getMessage());
            	}
            	
         
            }
          
        }
    }
}


