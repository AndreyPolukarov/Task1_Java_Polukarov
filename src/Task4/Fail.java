package Task4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// Неразобрался как собрать проект в jar-файл.
public class Fail {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/User/IdeaProjects/Task_Java_Polukarov/src/Task4/poem.txt"))) {
            String line;
            int partNumber = 1;
            BufferedWriter writer = null;
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    if (writer != null) {
                        writer.close();
                    }
                    writer = new BufferedWriter(new FileWriter("part" + partNumber + ".txt"));
                    partNumber++;
                } else {
                    if (writer != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


