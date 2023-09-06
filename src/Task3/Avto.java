package Task3;
import java.util.Scanner;


public class Avto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number;
        // Регионы, которые есть в базе и будем их сравнивать
        int[] region = new int[] {777, 999, 666, 222};

        while (true) {
            System.out.print("Ведите регистрационный номер автомобиля (для выхода введите 'exit'): ");
            number = scan.nextLine();
            // Если пользователь введет exit, то выходим из цикла
            if (number.equalsIgnoreCase("exit")) {
                break;
            }
            // Проверка на буквы и цыфры номера
            if (number.substring(1, 4).matches("-?\\d+")) {
                if (number.substring(6, 9).matches("-?\\d+")) {
                    if (number.substring(0,1).matches("[a-zA-Z]+")) {
                        if (number.substring(4, 6).matches("[a-zA-Z]+")) {
                            for(int i = 0; i < region.length; i++) {
                                if (Integer.parseInt(number.substring(6, 9)) == region[i]) {
                                    System.out.println("Ваш номер зарегестрирован!\nВаш регион - " + region[i]);
                                }else {
                                    break;
                                }
                            }
                        }else {
                            System.out.println("Должно быть две буквы\nПопробуйте ввести еще раз!");
                        }
                    }else {
                        System.out.println("Ошибка! Должна быть буква \nПопробуйте ввести еще раз!");
                    }
                }else {
                    System.out.println("Ошибка! Код региона должен состоять из цифр\nПопробуйте ввести еще раз!");
                }
            }else {
                System.out.println("Ошибка! Регистрационый номре должно состоять из 3 цифр Ошибка!\nПопробуйте ввести еще раз!");
            }
        }

    }
}




