/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Maharaj
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Shows home screen
        intro();
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        //Determines what to do next after user gives input
        for (int i = 0; i < 100; i++) {
            if (i == 100) {
                break;
            }
            if(choice == 1){
                Add();
            }
            if(choice == 2){
                Edit();
            }
            if(choice == 3){
                //Delete list
            }
            if(choice == 4){
                guide();
            }
            if(choice == 5){
                //Exit application
            }
        }

    }

    public static void intro() {

        //Home screen
        //Determine what user wants to do
        System.out.println(" To Do List Application");
        System.out.println("        Welcome        ");
        System.out.println("----------------------------");
        System.out.println(" Please select an option");
        System.out.println("  1. Add a To Do list");
        System.out.println("  2. Edit a To Do list");
        System.out.println("  3. Delete a To Do list");
        System.out.println("  4. Help Guide");
        System.out.println("  5. Help Guide");
        System.out.println("----------------------------");



    }

    public static void Add() {

        //For adding a task
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Task Title");
        String Title = input.nextLine();
        System.out.println("Enter Task Date");
        String Date = input.nextLine();
        System.out.println("Enter Task Description");
        String Description = input.nextLine();
        System.out.println("Enter Task objects");
        String objects = input.nextLine();
        System.out.println("Type Exit to exit");

    }

    public static void Edit() {

        //For editing a task
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to edit?");
        System.out.println("----------------------------");
        System.out.println("  1. Edit title");
        System.out.println("  2. Edit date");
        System.out.println("  3. Edit description");
        System.out.println("  4. Edit objects");
        System.out.println("----------------------------");

        int choice2 = input.nextInt();
        System.out.println(input.nextLine());

        if(choice2 == 1){
            System.out.println("Enter new title: ");
            String Title = input.nextLine();
        }
        if(choice2 == 2){
            System.out.println("Enter new date: ");
            String Date = input.nextLine();
        }
        if(choice2 == 3){
            System.out.println("Enter new description: ");
            String Description = input.nextLine();
        }
        if(choice2 == 4){
            System.out.println("Enter new objects: ");
            String objects = input.nextLine();
        }

    }

    public static void guide() {

        //User guide
        System.out.println(" User guide for task Application ");
        System.out.println("----------------------------------");
        System.out.println(" What would you like to know?");
        System.out.println("  1. How to Add a To Do list");
        System.out.println("  2. How to Edit a To Do list");
        System.out.println("  3. How to Delete a To Do list");
        System.out.println("  4. Exit Application");
        System.out.println("----------------------------------");

        Scanner input = new Scanner(System.in);
        int choice3 = input.nextInt();
        System.out.println(input.nextLine());

        if(choice3 == 1){
            System.out.println("----------------------------------------------------------------");
            System.out.println("How to Add a To Do list");
            System.out.println("Press enter to see next step");
            System.out.println(input.nextLine());
            System.out.println("Step 1");
            System.out.println("Press 1 on the home screen");
            System.out.println(input.nextLine());
            System.out.println("Step 2");
            System.out.println("You will be promted to input a title for a task");
            System.out.println("Enter the title");
            System.out.println("Example: Task 1, Task1");
            System.out.println(input.nextLine());
            System.out.println("Step 3");
            System.out.println("Enter the date in the format mm-dd-yyyy");
            System.out.println("Example: 11-15-2021");
            System.out.println(input.nextLine());
            System.out.println("Step 4");
            System.out.println("Enter a description for the task");
            System.out.println("Example: This task is for a shopping list.");
            System.out.println(input.nextLine());
            System.out.println("Step 5");
            System.out.println("Enter the objects for the tasks");
            System.out.println("Example: obj1, car, milk, etc");
            System.out.println("When done the program will return back to the home screen.");
            System.out.println("-----------------------------------------------------------------");
        }
        if(choice3 == 2){
            System.out.println("----------------------------------------------------------------");
            System.out.println("How to edit a To Do list");
            System.out.println("Press enter to see next step");
            System.out.println("Step 1");
            System.out.println("Press 2 on the home screen");
            System.out.println(input.nextLine());
            System.out.println("Step 2");
            System.out.println("Select either 1, 2, 3, or 4 for what you want to edit.");
            System.out.println("Enter either the title, date decription or objects");
            System.out.println("When done the program will return back to the home screen.");
            System.out.println("-----------------------------------------------------------------");


        }
        if(choice3 == 3){
            System.out.println("----------------------------------------------------------------");
            System.out.println("How to delete a To Do list");
            System.out.println("----------------------------------------------------------------");
        }
    }
}