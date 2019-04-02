import ClubOfFighters.Warrior;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int[] input = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            input[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(input));

        System.out.println("Legkisebb: " + returnSmallest(input));
        System.out.println("Legnagyobb: " + returnGreatest(input));
        System.out.println("Két legkisebb: " + Arrays.toString(returnSmallestTwo(input)));
        System.out.println("Két legnagyobb: " + Arrays.toString(returnGreatestTwo(input)));
        System.out.println(returnMiddleElement(input));
        System.out.println("Átlag: " + average(input));

        Runable.fightEvent(new Warrior(3, 15), new Warrior(5, 21));
    }

    public static int returnSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int returnGreatest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int[] returnSmallestTwo(int[] arr) {
        int[] twoSmall = new int[2];
        Arrays.sort(arr);
        twoSmall[0] = arr[0];
        twoSmall[1] = arr[1];
        return twoSmall;
    }

    public static int[] returnGreatestTwo(int[] arr) {
        int[] twoGreat = new int[2];
        Arrays.sort(arr);
        twoGreat[0] = arr[arr.length - 2];
        twoGreat[1] = arr[arr.length - 1];
        return twoGreat;
    }

    public static boolean returnMiddleElement(int[] arr) {
        if (arr.length % 2 != 0) {
            System.out.println("Középső elem: " + arr[(arr.length - 1) / 2]);
            return true;
        } else {
            System.out.println("Páros elemszám, aka. nincs középső elem");
            return false;
        }
    }

    public static float average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float)sum / arr.length;
        return avg;
    }

}
