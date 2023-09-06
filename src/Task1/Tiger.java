package Task1;

public class Tiger extends ANIMALS {
    public Tiger(String name) {
        super(name, 1000, 0);
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
        System.out.println(name + " не умеет плавать");
    }
}