package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] items = {"kæreste", "kaffemaskine", "netflix", "sofa", "løbesko", "guitar", "slik", "hund", "bog", "øl"};
        int[] itemsCounter = new int[10];

        for (int i = 0; i < 10; i++) {
            String pickedItem = Methods.pickItem(items);
            for (int x = 0; x < items.length; x++) {

            if (pickedItem.equals(items[x])) {
                itemsCounter[x]++;
            }
            }
        }

        int mostPickedItem = 0;

        for (int i = 0; i < itemsCounter.length; i++) {
            if (mostPickedItem < itemsCounter[i]) {
                mostPickedItem = itemsCounter[i];
            }
        }

        int counter = 0;

        // counts the amount of elements equal to the mostPickedItem in case some options are pick
        // with the same frequency 
        for (int i = 0; i < itemsCounter.length; i++) {
            if (mostPickedItem == itemsCounter[i]) {
                counter++;
            }
        }
        // creates an array equal to counter
        int[] mostPickedItems = new int[counter];
        // fills the array with the value mostPickedItem
        for (int i = 0; i < counter; i++) {
            mostPickedItems[i] = mostPickedItem;
        }

        // creates an array that will contain the index numbers of the elements that are picked the most.
        int[] indexOfMostPickedItems = new int[counter];

        for (int i = 0; i < itemsCounter.length; i++) {
            if (mostPickedItem == itemsCounter[i]) {
                int index = 0;
                indexOfMostPickedItems[index] = i;
                index++;
            }
        }

        if (counter > 1) {

        System.out.println("The most picked items are:");
        for (int i = 0; i < mostPickedItems.length; i++ ) {
            System.out.println(items[indexOfMostPickedItems[i]]);
        }
        System.out.println("With the value of " + mostPickedItem + ".");
        } else {
            System.out.println("The most picked item is:");
            System.out.println("With the value of " + mostPickedItem + ".");
        }
    }
}
