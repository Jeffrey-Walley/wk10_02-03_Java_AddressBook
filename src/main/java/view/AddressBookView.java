package view;

import java.util.Scanner;


public class AddressBookView {

    public static void display(int options[], String description[]){
        // Display Options to user:
        System.out.println("\n\nWalley Works Address Book Java App");
        System.out.println("----------------------------------");
        // loop through options and description and output to display
        for(int i = 0; i < options.length; i++) {
            System.out.printf("%d. %s\n", options[i] +1, description[i]);
        }
        System.out.print("Please choose your option: (enter 1 - 6)");



}


}
