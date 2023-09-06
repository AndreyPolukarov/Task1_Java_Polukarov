package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Fail_text {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("poem.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                queue.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        printQueueWithDelay(queue);
    }

    public static void printQueueWithDelay(Queue queue) {
        Random random = new Random();
        while (!queue.isEmpty()) {
            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(queue.poll());
        }
    }
}