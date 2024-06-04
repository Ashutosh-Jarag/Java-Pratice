class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

public class moverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Some generic sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof woof

        // Using polymorphism
        Animal animal2 = new Dog();
        animal2.makeSound(); // Output: Woof woof (dynamic method dispatch)
    }
}
