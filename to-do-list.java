import java.util.Scanner;
import java.util.ArrayList;

public class toDoList{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner sc = new Scanner (System.in);
        
         // Assign variables 
        ArrayList<String> currentlist = new ArrayList<String>();
        int choice;
        String task;

        System.out.println("This is a To-Do List!");
        do {
            // Introduction
            System.out.println();
            System.out.println("1: Show List");
            System.out.println("2: Add to list");
            System.out.println("3: Delete list");
            System.out.println("4: Exit");
            
            choice = input.nextInt();
            switch(choice){

                //Option 1 - Show the list
                case (1):
                    System.out.println(currentlist);
                    break;

                //Option 2 - add to list
                case (2):
                    System.out.println("Enter a task: ");
                    task = sc.nextLine();
                    currentlist.add(task);
                    
                //Option 3 - remove from list
                case (3):
                    currentlist.forEach(System.out::println);
                    
                    System.out.println("Which task would you like to delete?");
                    String delete = sc.nextLine();
                    
                    if (currentlist.contains(delete)) {
                        int location = currentlist.indexOf(delete);
                        System.out.println(currentlist.remove(location) + " has been marked as completed");
                        break;
                    }
                    
                    else {
                        System.out.println("Not a task found in your list");
                        break;
                    }
             

            }
                // Option 4 - exit
        } while (choice > 0 && choice < 4);
        System.out.println("Please enter a valid option.");
    }
}


