public class Main {

    public class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    public class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }

    public class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }

    public static void main(String[] args) {

        Main main = new Main();

        Animal[] animals = {main.new Cat(),
                main.new Dog(),
                main.new Cow()};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
