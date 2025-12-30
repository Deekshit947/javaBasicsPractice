public class polymorphismAnimal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends polymorphismAnimal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends polymorphismAnimal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    class main {
        public static void main(String[] args) {
            polymorphismAnimal myAnimal = new polymorphismAnimal();  
            polymorphismAnimal myPig = new Pig();
            polymorphismAnimal myDog = new Dog();
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
        }
    }

