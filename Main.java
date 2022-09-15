import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2,5,9};
        int[] arr2 = {2,5,8};
        boolean answer = areEquale(arr1, arr2);
        System.out.println(answer);



          //1
//         מערך הוא אוסף פריטים שניתן לגשת אליהם בצורה ישירה באמצעות אינדקס
//        נשתמש בו כשנרצה לאחסן אוסף של משתנים מסוג מסויים

        //2
        int[] array = {101, 102, 103, 104, 105};
        //the number 101 - where it is located : //0
        //the number 105 - where it is located : //4

        //3

//        int[] numArray = { 2, 4, 6 };
//        System.out.println(numArray[1]);
////
//        System.out.println(numArray[2]);
//////        OR
//        System.out.println(numArray[numArray.length-1]);
//
        //4
        //arr.length


        //5
        int[] grades = new int[20];

        //6
        String[] welcomeArray = {"Welcome", "To", "Java"};






        //7
//        int[] negativArray = {-1, -2, -3, -4, -5};
//
//        for (int i =0; i < negativArray.length; i++) {
////            System.out.println(i); for explanation purpose
//            System.out.println(negativArray[i]);
//        }



//







        //8
        int[] oneToTenArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for (int i = 0; i < oneToTenArray.length; i++) {
//            if (oneToTenArray[i] % 2 != 0) {
//                System.out.println(oneToTenArray[i]);
//            }
//        }

        //9
//        for (int i = oneToTenArray.length - 1; i > 0; i--) {
//            if (oneToTenArray[i] % 2 == 0) {
//                System.out.println(oneToTenArray[i]);
//            }
//        }

//
//        int[] array1 = new int[3];
//
//        Scanner scan = new Scanner(System.in);
//
//
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = scan.nextInt();         //populate the array
//
//        }
//
//        System.out.print(Arrays.toString(array1));



        //10
//        int[] newArray = new int[3];
//        Scanner scan = new Scanner(System.in);
//
//        for (int i=0; i < newArray.length; i++) {
//            System.out.println("Please enter a value");
//            newArray[i] = scan.nextInt();
//        }
//        System.out.print(Arrays.toString(newArray));
//
//        for (int i=0; i < newArray.length; i++) {
////            System.out.print(newArray[i] + ", ");
//
//        }

        //11
        int[] arrayNum = new int[5];
        Random rand = new Random();
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = rand.nextInt(50) + 1;
        }
        System.out.print(Arrays.toString(arrayNum));


        //12
//        boolean foundOddNumber = false;
//
//        for (int i =0; i < arrayNum.length; i++) {
//            if (arrayNum[i] % 2 != 0) {
//                foundOddNumber = true;
//            }
//        }
//
//        if (foundOddNumber) {
//            System.out.println("no all numbers even");
//        } else {
//            System.out.println("all numbers even");
//        }

        //14
//        int[] secretCode = {9, 4, 6};
//        int[] emptyArray = new int[3];
//        Scanner scan = new Scanner(System.in);
//
//        for(int i=0; i<emptyArray.length; i++) {
//            emptyArray[i] = scan.nextInt();
//        }
//        if(Arrays.equals(emptyArray, secretCode)) {
//            System.out.println("Access Granted");
//        } else {
//            System.out.println("Wrong");
//        }

     }
//13
    public static boolean areEquale(int[] arr1, int[] arr2) {
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("equals");
            return true;
        } else {
            System.out.println("Not equal");
            return false;
        }
    }
}
