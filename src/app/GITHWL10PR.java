package app;

import java.util.Arrays;
import java.util.Scanner;

public class GITHWL10PR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{10,20,30,40,50};

        System.out.println("1. Введіть ціле число: ");
        int squareNum = scanner.nextInt();
        System.out.println("Квадрат числа " + squareNum + " дорівнює " + squareSolution(squareNum) + ".");

        System.out.println("Введіть радіус циліндра :");
        double cylinderRadius = scanner.nextDouble();
        System.out.println("Введіть висоту циліндра :");
        double cylinderHigh = scanner.nextDouble();
        System.out.printf("2. Об'єм циліндра з радіусом %.1f і висотою %.1f дорівнює %f.\n ",
                cylinderRadius , cylinderHigh , cylinderVolume(cylinderRadius , cylinderHigh));

        System.out.println("3. Масив чисел: " + Arrays.toString(array));
        System.out.println("Сума всіх елементів масиву дорівнює " + arraySum(array) + ".");

        System.out.println("4. Введіть рядок: ");
        String text = scanner.next();
        System.out.println("Рядок в зворотньому порядку: " + reverseString(text));

        System.out.println("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.println("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a , b) + ".");

        System.out.println("6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        System.out.println("Введіть текстовий рядок: ");
        scanner.nextLine();
        String text2 = scanner.nextLine();
        repeatText(n, text2);

        scanner.close();;


    }
    public static int squareSolution(int squareNum){
        return squareNum * squareNum;

    }
    public static double cylinderVolume(double cylinderRadius , double cylinderHigh){
        return Math.PI * cylinderRadius * cylinderRadius * cylinderHigh;
    }

    public static int arraySum(int [] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String text){
        char [] i = text.toCharArray();
        int begin = 0;
        int end = i.length -1;
        char temp = 0;
        while(end > begin){
            temp = i[begin];
            i[begin] = i[end];
            i[end] = temp;
            end--;
            begin++;
        }
        return new String(i);

    }
    public static int power(int a , int b){
        return (int) Math.pow(a , b);

    }
    public static void repeatText(int n , String text2){
        for (int i = 0; i < n; i++) {
            System.out.println(text2);

        }
    }

}
