package s036;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[10]; //creo array cui elementi sono di tipo dog

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }

        dogs[5].bark();
        
        Dog bob = new Dog("Bob");
        bob.bark();
    }
}
