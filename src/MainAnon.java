public class MainAnon {
    public static void main(String[] args) {

        Main main = new Main();

        Animal[] animals = {new Animal() {
            @Override
            public void sound() {
                System.out.println("meow");
            }
        }, new Animal() {
            @Override
            public void sound() {
                System.out.println("woof");
            }
        }, new Animal() {
            @Override
            public void sound() {
                System.out.println("moo");
            }
        }};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
