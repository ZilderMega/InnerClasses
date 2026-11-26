public class MainStatic {
    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }

    public static class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }

    public static void main(String[] args) {

        Animal[] animals = {new MainStatic.Cat(), new MainStatic.Dog(), new MainStatic.Cow()};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
