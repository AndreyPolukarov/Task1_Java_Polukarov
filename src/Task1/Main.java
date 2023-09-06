package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ANIMALS[] animals = new ANIMALS[10];

        int catCount = random.nextInt(3) + 1;
        int tigerCount = random.nextInt(3) + 1;
        int dogCount = random.nextInt(3) + 1;

        for (int i = 0; i < catCount; i++) {
            animals[i] = new Cat("Кот " + (i + 1));
        }
        for (int i = catCount; i < catCount + tigerCount; i++) {
            animals[i] = new Tiger("Тигр " + (i - catCount + 1));
        }
        for (int i = catCount + tigerCount; i < catCount + tigerCount + dogCount; i++) {
            animals[i] = new Dog("Собака " + (i - catCount - tigerCount + 1));
        }

        for (int i = 0; i < animals.length; i++) {
            int distance = random.nextInt(1000) + 1;
            animals[i].run(distance);
            animals[i].swim(distance);
            System.out.println("--------------------------------");
        }
    }
}
