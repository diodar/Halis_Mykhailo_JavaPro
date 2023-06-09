package dz_1;

import java.util.Arrays;
import java.util.Random;

public class StartMain {

    public static void main(String[] args) {

        byte byte1 = 7;
        short short1 = 71;
        int int1 = 702;
        long long1 = 700000000003L;
        float float1 = 7.04F;
        double double1 = 70.05;
        char char1 = 7006;
        boolean isJavaVeryInteresting = true;


        String string1 = new String("String1");
        System.out.println(string1);
        String string2 = "String2";
        System.out.println(string2);
        System.out.println('\n');


        int result1 = byte1 + short1;
        System.out.println("byte1 + short1 = " + result1);
        int result2 = short1 * int1;
        System.out.println("short1 * int1 = " + result2);
        int result3 = int1 % byte1;
        System.out.println("int1 % byte1 = " + result3);
        double result4 = double1 - float1;
        System.out.println("double1 - float1 = " + result4);
        double result5 = double1 + char1;
        System.out.println("double1 + char1 = " + result5);
        long result6 = long1 - char1;
        System.out.println("long1 - char1 = " + result6);
        float result7 = long1 / float1;
        System.out.println("long1 / float1 = " + result7);
        System.out.println('\n');


        if (byte1 < 5 | byte1 == 7) {
            System.out.println("byte1 менший за 5 або дорівнює 7");
        } else {
            System.out.println("byte1 більщий за 5 та не дорівнює 7");
        }

        if (int1 != byte1 & int1 != short1 & byte1 != short1) {
            System.out.println("int1, short1 та byte1 - мають різне значення");
        } else {
            System.out.println("Деякі або всі змінні int1, short1 або byte1 - мають однаковае значення");
        }
        System.out.println('\n');


        if (byte1 < short1) {
            System.out.println("byte1 менше ніж short1");
        } else {
            System.out.println("byte1 більше за short1");
        }

        if (int1 == char1) {
            System.out.println("int1 дорівнює char1");
        } else {
            System.out.println("int1 не дорівнює char1");
        }
        System.out.println('\n');


        String stringY = "YES";
        String stringYep = "YEEEEP";

        String resultStringYes = (isJavaVeryInteresting) ? stringY : stringYep;
        System.out.println("isJavaVeryInteresting? - " + resultStringYes);

        String resultStringYep = (!(isJavaVeryInteresting)) ? stringY : stringYep;
        System.out.println("isJavaVeryInteresting? - " + resultStringYep);
        System.out.println('\n');


        int num = 1;
        System.out.println(num++);
        System.out.println(--num);
        System.out.println(num--);
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(--num);
        System.out.println(num);
        System.out.println('\n');


        int[] array1 = new int[10];
        Random randomizer = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomizer.nextInt(9);
        }
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.println("Елемент " + i + " зі значенням " + array1[i] + " являється парним");
            }
        }
    }
}
