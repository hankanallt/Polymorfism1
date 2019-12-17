package polymorfism1;

import java.util.ArrayList;

public class PolyMorfism1 {


    public static void main(String[] args) {
        //ArrayList of Diffrent Animals
        ArrayList<Animal> animals = new ArrayList<>();
        
        
        //Here i have added new Animals
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myHorse = new Horse();
        Animal myCow = new Cow();
        
//Here i have added animal Sounds
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myCat.animalSound();
        myHorse.animalSound();
        myCow.animalSound();
        
        //Here i have added a for each loop.
        for (Animal animal : animals) {
            animal.animalSound();
        }
    }
}


    

