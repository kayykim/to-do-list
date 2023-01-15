import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class toDoList{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner sc = new Scanner (System.in);

        // Introduction

        System.out.println("This is a To-Do List!");
        System.out.println("1: Show List");
        System.out.println("2: Add to list");
        System.out.println("3: Delete list");
        System.out.println("4: Exit");

        int choice;
        
         // Error Check
        do {
            System.out.println("Please enter your option: ");
            while (!sc.hasNextInt()){
                System.out.println("Not a valid option");
                sc.next();
                }
                choice = sc.nextInt();

                // option 2
                if (choice == 2){
                    addList();
                }
            // condition must be false to escape loop
        } while (choice > 1 && choice < 4);
     
