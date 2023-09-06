package Task1;

public class Dog extends ANIMALS {
    public Dog(String name) {
        super(name, 500, 10);
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м");
        }
    }
}