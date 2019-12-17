
package polymorfism1;


public class Animal {
    

  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

 class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The Cat says: Miao, Miao");
    }
}


class Horse extends Animal{
    public void animalSound(){
        System.out.println("The Horse says: EEEhhaa, EEEhhaa");
    }
}

class Cow extends Animal{
    public void animalSound(){
        System.out.println("The Cow says: Muuuuuu, Muuuuuu");
    }
}
