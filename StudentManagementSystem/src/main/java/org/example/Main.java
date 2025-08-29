package org.example;
import java.util.*;
import java.sql.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        studentDao dao = new studentDao();
        Scanner sc = new Scanner(System.in);
        while(true){
           System.out.println("1: add Student \n 2: update Student detail \n 3: delete student detail \n 4:list Student \n 5: exit");
           int choice = sc.nextInt();
            switch (choice){
                case 1:// Add student
                    System.out.println("Enter student detail ");
                    System.out.println("Id : "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("name :") ;String name = sc.nextLine();
                    System.out.println("Marks : ");float marks = sc.nextFloat();
                    System.out.println("Age : "); int age = sc.nextInt();
                    dao.addStudent(new student(id,name,marks,age));
                    break;
                case 2:// update student
                    System.out.println("Enter student id to update");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("New name :");
                    name = sc.nextLine();
                    System.out.println("New Marks : "); marks = sc.nextFloat();
                    System.out.println("New Age : "); age = sc.nextInt();
                    dao.updateStudent(new student(id,name,marks,age));
                    break;
                case 3: // delete student
                    System.out.println("Enter student id to delete");
                    id = sc.nextInt();
                    dao.deleteStudent(id);
                    break;
                case 4: // list all student
                    List<student> list = dao.getAllStudents();
                    System.out.println(list);
                    break;
                case  5: // exit program
                    System.out.println("exiting the program....");
                    System.exit(0);
                default: // if invalid case occur
                    System.out.println("Invalid choice");
            }


        }



    }
}