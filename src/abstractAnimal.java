public abstract class abstractAnimal {

        public abstract void animalSound();
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    class Pigs extends abstractAnimal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class mains {
        public static void main(String[] args) {
            Pigs myPig = new Pigs();
            myPig.animalSound();
            myPig.sleep();
        }
    }

