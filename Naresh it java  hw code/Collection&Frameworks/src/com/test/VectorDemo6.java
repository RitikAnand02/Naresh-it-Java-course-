package com.test;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo6
{
    public static void main(String[] args) 
    {        
        Vector<String> toDoList = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do 
        {
            System.out.println("To Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt(); 
            scanner.nextLine(); 

            switch (choice) 
            {
                case 1:
                    // Add Task
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added successfully!\n");
                    break;
                case 2:
                    // View Tasks
                    System.out.println("To Do List:");
                    for (int i = 0; i < toDoList.size(); i++) 
                    {
                      System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    System.out.println();
                    break;
                case 3:
                    // Mark Task as Completed
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();  //1
                    if (taskNumber >= 1 && taskNumber <= toDoList.size()) 
                    {
                        String completedTask = toDoList.remove(taskNumber - 1);
                        System.out.println("Task marked as completed: " + completedTask + "\n");
                    } 
                    else {
                        System.out.println("Invalid task number!\n");
                    }
                    break;
                case 4:
                    System.out.println("Exiting ToDo List application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }

        } 
        while (choice != 4);

       
        scanner.close();
    }
}