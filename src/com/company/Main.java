package com.company;
import app.manage.studen.*;
import java.io.IOException;
import java.util.*;

public class Main {
        Login login = new Login();

    public void menuLoginTeacher() {
        System.out.println("-------------------------------");
        System.out.println("|1| SEE LIST OF STUDENTS : ");
        System.out.println("|2| ADD STUDENT : ");
        System.out.println("|3| SEARCH STUDENT : ");
        System.out.println("|4| CHANGE INFORMATION : ");
        System.out.println("|5| STUDENT RATINGS : ");
        System.out.println("|6| REMOVE STUDENT : ");
        System.out.println("|7| LOGOUT: ");
        System.out.println("|8| EXIT. ");
        System.out.println("-------------------------");
        System.out.println("ENTER OPTIONS : ");

    }

    public void menu() {
        System.out.println("----------HELLO 500 ACE-------------");
        System.out.println("|1| LOG IN : ");
        System.out.println("|2| REGISTRATION : ");
        System.out.println("|3| EXIT. ");
        System.out.println("-------------------------");
        System.out.println("ENTER OPTIONS : ");

    }

    public boolean  choiceMenuTeacher() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean chekExit = false;
        do{
            menuLoginTeacher();
            choice = scanner.next();
            switch (choice) {

                case "1" :  login.displayAllStudent();
                    break;
                case "2" :  login.add();
                    break;
                case "3" :  login.searchName();
                    break;
                case "4" :  login.fix();
                    break;
                case "5" :break;
                case "6" :  login.remove();
                    break;
                case "7" :
                    break;
                case "8" :  chekExit = true;
                            choice = "7";
                    break;
                default  :  System.out.println("PLEASE INPUT AGAIN :");
                    break;
            }
        }while (!choice.equals("7"));
        login.getData().writeFileStudentBf();
        return chekExit;
    }




    public void choiceMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choice;
        login.getData().readFileStudentBf();
        login.getData().readFileAccountBf();
        do{
                menu();
                choice = scanner.nextLine();
                switch (choice) {
                    case "1" :
                        int chek = login.login();
                        if(chek == 1) {
                            choiceMenuStudent();
                        }else if(chek == 2) {
                            if(choiceMenuTeacher()) choice = "3";
                        }else System.out.println("ACCOUNT NOT REGISTRATION :");
                        break;
                    case "2" :  login.registration();
                        break;
                    case "3" :  break;
                    default  :  System.out.println("PLEASE INPUT AGAIN :");
                        break;
                }
            }while (!choice.equals("3"));
        login.getData().writeFileAccountBf();
    }

    public void choiceMenuStudent() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
            System.out.println("-----------------------------------");
            System.out.println("|1| DISPLAY POINT : ");
            System.out.println("|2| BACK.");
            System.out.println("|3| EXIT. ");
            System.out.println("-----------------------------------");

            choice  = scanner.nextLine();
            switch (choice) {
                case "1" : login.displayAllStudent();
                break;
                case "2" :
                    break;
                case  "3": System.exit(0);
                    break;
                default:
                    System.out.println("PLEASE AGAIN : ");
            }
        }while (!choice.equals("2"));
    }




    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.choiceMenu();

    }
}
