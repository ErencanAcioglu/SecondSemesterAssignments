

	//Erencan Acıoğlu 150122056

import java.util.ArrayList;

public class AnimalFarm {
    private ArrayList<Animal> animalList;
    private ArrayList<String> animalNames;
    private final int CAPACITY;
    private int numberOfAnimals = 0;

    public AnimalFarm(int capacity) {
        this.CAPACITY = capacity;
        this.animalList = new ArrayList<>();
        this.animalNames = new ArrayList<>();
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }
    public ArrayList<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(ArrayList<Animal> animalList) {
		this.animalList = animalList;
	}

	public ArrayList<String> getAnimalNames() {
		return animalNames;
	}

	public void setAnimalNames(ArrayList<String> animalNames) {
		this.animalNames = animalNames;
	}

	public int getCAPACITY() {
		return CAPACITY;
	}

	public void setNumberOfAnimals(int numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
	}
	//addAnimalmethod adds the animal name to the animalName for further check. 
	//It returns true if the animal and its name are successfully added to the ArrayLists, false otherwise.
    public boolean addAnimal(Animal animal) throws IllegalNameException {
        if (numberOfAnimals >= CAPACITY) {
            return false;
        }
        
        String name = animal.getName();
        if (animalNames.contains(name)) {
        	//If the user tries to enter an animal with the same name, then addAnimal method throws an IllegalNameException.
            throw new IllegalNameException("There is an animal with name " + name + " please enter another name.");
        }
        animalList.add(animal);
        animalNames.add(animal.getName());
        numberOfAnimals++;
        return true;
    }
    //removeAnimal method removes an animal from the animalList and animalName.
    public boolean removeAnimal(String name) {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getName().equals(name)) {
                Animal removedAnimal = animalList.remove(i);
                animalNames.remove(name);
                numberOfAnimals--;
                //It also decrements the counter of either Chicken, Donkey, Horse, Pig, Raven, or Sheep classes depending on the type of the removed animal.
                if (removedAnimal instanceof Chicken) {
                    Chicken.decrementCount();
                } else if (removedAnimal instanceof Donkey) {
                    Donkey.decrementCount();
                } else if (removedAnimal instanceof Horse) {
                    Horse.decrementCount();
                } else if (removedAnimal instanceof Pig) {
                    Pig.decrementCount();
                } else if (removedAnimal instanceof Raven) {
                    Raven.decrementCount();
                } else if (removedAnimal instanceof Sheep) {
                    Sheep.decrementCount();
                }
                return true;
            }
        }
        return false;
    }

    public void printAllAnimalGreetings() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            printOneAnimalGreeting(animal);
        }
    }

    public void printOneAnimalGreeting(Animal animal) {
        animal.sayGreeting();
    }



    public void printAllAnimalNames() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            printOneAnimalName(animal);
        }
    }


    public void printOneAnimalName(Animal animal) {
        System.out.println(animal.getName());
    }

    public void printAllAnimals() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            System.out.println(animal.toString());
        }
    }

    /*nextYearPopulationForecast method calculates the expected population for
    the next year. */
    public int nextYearPopulationForecast() {
        int expectedPopulation = 0;
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            expectedPopulation += animal.getNumberOfOffsprings() * animal.getPregnancyPerYear();
        }
        return numberOfAnimals + expectedPopulation;
    }

/*animalMovements method works like this :
 * if the animal is of type
 *Bird, calls fly method of the animal. If the animal is of type Mammal, however, it calls
 *the walk method.
 */
    public void animalMovements() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal instanceof Bird) {
                System.out.println("My name is " + animal.getName() + " and I can fly to the endless skies!");
                
            } else if (animal instanceof Mammal) {
                System.out.println("My name is " + animal.getName() + " and I can walk to the far away lands!");
                
            }
        }
    }

    /*eatingHabits method works like this: if the animal is of type
     *Bird, calls omnivore method of the animal. If the animal is of type Mammal, however,
     *it calls the herbivore method.
    */
    public void eatingHabits() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal instanceof Bird) {
            	System.out.println("My name is " + animal.getName() + " and I can eat plants only!");
                
            }  if (animal instanceof Mammal) {
            	System.out.println("My name is " + animal.getName() + " and I can eat everything!");
              
            }
        }
    }

    public void sortAlphabetically() {
    	//We create a copy of the animalList with arraylist name sortAlphabetically.
        ArrayList<Animal> sortAlphabetically = new ArrayList<>(animalList);
        
        //We sort alphabetically with this code block
        for (int i = 0; i < sortAlphabetically.size() - 1; i++) {
            for (int j = i + 1; j < sortAlphabetically.size(); j++) {
                if (sortAlphabetically.get(i).getName().compareToIgnoreCase(sortAlphabetically.get(j).getName()) > 0) {
                    Animal temp = sortAlphabetically.get(i);
                    sortAlphabetically.set(i, sortAlphabetically.get(j));
                    sortAlphabetically.set(j, temp);
                }
            }
        }
        //Prints sorted.
        for (int i = 0; i < sortAlphabetically.size(); i++) {
            Animal animal = sortAlphabetically.get(i);
            System.out.println("my name" + " is " + animal.getName() + "!");
        }
    }



    public void sortBasedOnLegNumber() {
        //We create a copy of the animalList with arraylist name sortBasedOnLegNumbe.
        ArrayList<Animal> sortBasedOnLegNumbe = new ArrayList<>(animalList);

        //We sort  based on leg numbers with this code block.
        for (int i = 0; i < sortBasedOnLegNumbe.size() - 1; i++) {
            for (int j = i + 1; j < sortBasedOnLegNumbe.size(); j++) {
                Animal animal1 = sortBasedOnLegNumbe.get(i);
                Animal animal2 = sortBasedOnLegNumbe.get(j);
                if (animal1.getLegNumber() > animal2.getLegNumber()) {
                	sortBasedOnLegNumbe.set(i, animal2);
                	sortBasedOnLegNumbe.set(j, animal1);
                }
            }
        }

        //Prints sorted.
        for (int i = 0; i < sortBasedOnLegNumbe.size(); i++) {
            Animal animal = sortBasedOnLegNumbe.get(i);
            String name = animal.getName();
            int legNumber = animal.getLegNumber();
            System.out.println(name + " has " + legNumber + " legs!");
        }
        }


    

    public void sortBasedOnAge() {
    	//We create a copy of the animalList with arraylist name sortBasedOnAge.
        ArrayList<Animal> sortBasedOnAge = new ArrayList<>(animalList);
        
        //We sort  based on ages with this code block.       
        for (int i = 0; i < sortBasedOnAge.size() - 1; i++) {
            for (int j = i + 1; j < sortBasedOnAge.size(); j++) {
                Animal animal1 = sortBasedOnAge.get(i);
                Animal animal2 = sortBasedOnAge.get(j);
                if (animal1.getAge() > animal2.getAge()) {
                	sortBasedOnAge.set(i, animal2);
                	sortBasedOnAge.set(j, animal1);
                }
            }
        }

        //Prints sorted.
        for (int i = 0; i < sortBasedOnAge.size(); i++) {
            Animal animal = sortBasedOnAge.get(i);
            String name = animal.getName();
            int age = animal.getAge();
            System.out.println(name + " is " + age + " years old!");
        }
    }
    //searchBasedOnName method finds and prints the animal with the given name.
    public void searchBasedOnName(String name) {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal.getName().equals(name)) {
                System.out.println(animal.toString());
            }
           
        }
    }

    //searchBasedOnAge method finds and prints the animals with the given age.
    public void searchBasedOnAge(int age) {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal.getAge() == age) {
                System.out.println(animal.toString());
            }
            
        }
    }
    //printReport method prints the information about the animal farm on a file.
    //This file create part, written as in the example from week 3 lecture 2.
    public void printReport(String fileName) throws Exception{
    	java.io.File file = new java.io.File(fileName);
    	if(file.exists()) {
    		System.out.println("There is a file with same name, please enter another name.");
    		System.exit(0);
    	}
    	//This code block for if you forget to close output.
    	try(
    	java.io.PrintWriter output = new java.io.PrintWriter(file);
    			){
    	output.println("We have a total of " + animalList.size() + " animals in the farm." );
    	if(Chicken.getCount()>0) {
    		output.println("*"+Chicken.getCount() + " of them chicken. Those are:");  		
    		output.println("        Name          Age          Leg Number");
    		for (int i = 0; i < animalList.size(); i++) {
                Animal animal = animalList.get(i);
                if(animal instanceof Chicken) {
                	output.println("        " + animal.getName() + "          " + animal.getAge() + "               " + animal.getLegNumber());
                } 
    		}
    	}
    		 if(Donkey.getCount()>0) {
        		output.println("*"+Donkey.getCount() + " of them donkey. Those are:");  		
        		output.println("        Name          Age          Leg Number");
        		for (int i = 0; i < animalList.size(); i++) {
                    Animal animal = animalList.get(i);
                    if(animal instanceof Donkey) {
                    	output.println("        " + animal.getName() + "          " + animal.getAge() + "               " + animal.getLegNumber());
                    } 
        		} 
    		 }
                     if(Horse.getCount()>0) {
                		output.println("*"+Horse.getCount() + " of them horse. Those are:");  		
                		output.println("        Name          Age          Leg Number");
                		for (int i = 0; i < animalList.size(); i++) {
                            Animal animal = animalList.get(i);
                            if(animal instanceof Horse) {
                            	output.println("        " + animal.getName() + "          " + animal.getAge() + "               " + animal.getLegNumber());
                            } 
                		}
                     }
                		   if(Pig.getCount()>0) {
                      		output.println("*"+Pig.getCount() + " of them pig. Those are:");  		
                      		output.println("        Name          Age          Leg Number");
                      		for (int i = 0; i < animalList.size(); i++) {
                                  Animal animal = animalList.get(i);
                                  if(animal instanceof Pig) {
                                  	output.println("        " + animal.getName() + "          " + animal.getAge() + "               " + animal.getLegNumber());
                                  } 
                      		}
                		   }
                      			
                	
                      		 if(Raven.getCount()>0) {
                        		output.println("*"+Raven.getCount() + " of them raven. Those are:");  		
                        		output.println("        Name          Age          Leg Number");
                        		for (int i = 0; i < animalList.size(); i++) {
                                    Animal animal = animalList.get(i);
                                    if(animal instanceof Raven) {
                                    	output.println("        " + animal.getName() + "          " + animal.getAge() + "               " + animal.getLegNumber());
                                    } 
                        		}
                      		 }
                        		if(Sheep.getCount()>0) {
                            		output.println("*"+Sheep.getCount() + " of them sheep. Those are:");  		
                            		output.println("        Name          Age          Leg Number");
                            		for (int i = 0; i < animalList.size(); i++) {
                                        Animal animal = animalList.get(i);
                                        if(animal instanceof Sheep) {
                                        	output.println("        " + animal.getName() + "          " + animal.getAge() + "               " + animal.getLegNumber());
                                        } 
                            		}
                        		}
    	   			}  
                		   
    		
    		}

	
                     
    

}
