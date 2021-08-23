package app.manage.studen;

import model.Account;
import data.Data;
import model.Student;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    Data data = new Data();
    Scanner scanner = new Scanner(System.in);



    public Login(){
        data = new Data();
    }

    public void registration() throws IOException {
//        do{
//            data.readFileAccountBf();
            String position = data.choicePosition();
            String username = data.inputUsername();
            String password = data.inputPassword();
            String accuracy = data.inputAccuracy();
            if(!data.getAccountList().isEmpty()){
                for(Account elements : data.getAccountList()) {
                    if(elements.getUserName().equals(username)){
                        System.out.println("NAME HAS EXISTED, PLEASE INPUT AGAIN : ");
                        data.chekNext();
                        break;
                    }else {
                        Account account = new Account();
                        account.setPosition(position);
                        account.setUserName(username);
                        account.setPassWord(password);
                        account.setAccuracy(accuracy);
                        data.getAccountList().add(account);
                        System.out.println("REGISTRATION SUCCESSFUL :");
                        break;
                    }
                }
            }else {
                Account account = new Account();
                account.setPosition(position);
                account.setUserName(username);
                account.setPassWord(password);
                account.setAccuracy(accuracy);
                data.getAccountList().add(account);
                System.out.println("REGISTRATION SUCCESSFUL :");
            }
//        }while (true);
    }

    public int login(){
//            data.readFileAccountBf();
            String chekUsername = data.inputUsername();
            String chekPassword = data.inputPassword();
            for (Account elements : data.getAccountList()) {
                if (elements.getUserName().equals(chekUsername) && elements.getPassWord().equals(chekPassword) &&
                        elements.getPosition().equals("1")) {
                    return 1;
                }if(elements.getUserName().equals(chekUsername) && elements.getPassWord().equals(chekPassword) &&
                        elements.getPosition().equals("2")){
                    return 2;
                }
            }
            return 0;
    }


    public void displayAllStudent() {
        if(!data.getStudentList().isEmpty()){
            for (Student element : data.getStudentList()) {
                System.out.println(element.toString());
            }
        }
        else System.out.println("NO STUDENT IN LIST");
    }
//nhap diem sai
    public void add() throws IOException {
        int n;
        do{
            try{
                System.out.println("ENTER STUDENT NUMBER NEED MORE CODE");
                 n = scanner.nextInt();
                break;
            }catch (Exception e) {
                System.out.println("PLEASE AGAIN :");
            }finally {
                scanner.nextLine();
            }
        }while (true);
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.setName(data.inputName());
            System.out.println("INPUT MATH : ");
            student.setMath(data.inputPoint());
            if(!getData().chekNext()) break;
            System.out.println("INPUT PHYSICS : ");
            student.setPhysics(data.inputPoint());
//            if(!data.chekNext()) break;
            System.out.println("INPUT CHEMISTRY :");
            student.setChemistry(data.inputPoint());
//            if(!data.chekNext()) break;
            System.out.println("INPUT LITERATURE : ");
            student.setLiterature(data.inputPoint());
            data.getStudentList().add(student);
//            data.writeFileStudentBf();
        }
    }



    public void fix() throws IOException {
        System.out.println("IN PUT ID STUDENT FIX :");
        int searchId = data.inputId();
        for(Student elements : data.getStudentList()) {
            if(elements.getId() == searchId) {
                elements.setMath(data.inputPoint());
                if(!data.chekNext()) break;
                elements.setMath(data.inputPoint());
                if(!data.chekNext()) break;
                elements.setPhysics(data.inputPoint());
                data.chekNext();
                elements.setChemistry(data.inputPoint());
                data.chekNext();
                elements.setLiterature(data.inputPoint());
//                data.writeFileStudentBf();
            }
        }
        System.out.println("STUDENT NOT FOUND :");
    }

    public void remove() {
        System.out.println("INPUT ID REMOVE : ");
        int searchId = data.inputId();
        for(Student elements : data.getStudentList()) {
            if(elements.getId() == searchId) {
                data.getStudentList().remove(elements);
                System.out.println("DELETED STUDENT ID = " + searchId);
            }
        }
        System.out.println("STUDENT NOT FOUND :");
    }

    public void searchName() {
        System.out.println("SEARCH FOR NAME :");
        String chekName = data.inputName();
        for(Student element : data.getStudentList()) {
            if(element.getName().equals(chekName)) {
                System.out.println(element.toString());
            }
        }System.out.println("NAME DOESN'T EXIST : ");
    }


    public Data getData() {
        return data;
    }


}
