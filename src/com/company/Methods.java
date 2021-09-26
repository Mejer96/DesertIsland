package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Methods {

    public static String pickItem(String[] array) {
        boolean whileLoop = true;
        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        while (whileLoop) {
            System.out.println("Please enter one item you would like to bring to a deserted island");
            System.out.println("Your options are: 'kæreste', kaffemaskine', 'Netflix', 'sofa', 'løbesko'," +
                    " 'guitar', 'slik', 'hund', 'bog' og 'øl, ");
            System.out.print(">");
            userInput = scanner.nextLine().toLowerCase(Locale.ROOT);

            for (int i = 0; i < array.length; i++) {
                if (userInput.equals(array[i])){
                    whileLoop = false;
                    break;
                }
                if (i == array.length-1) {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
        return userInput;
    }
    public static int surveyResult(int[] array) {
        int mostPickedItem = 0;
        int i = 0;

        for (i = 0; i < array.length; i++) {
            if (mostPickedItem < array[i]) {
                mostPickedItem = array[i];
            }
        }
        return mostPickedItem;
    }

    public static int findIndexOfMostPickedItem(int mostPickedItem, int[] array) {
        int indexOfMostPickedItem = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == mostPickedItem) {
                indexOfMostPickedItem = i;
            }
        }
        return indexOfMostPickedItem;
    }
}


