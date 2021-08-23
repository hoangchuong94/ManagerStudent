package data;
import model.Point;
import model.Student;

import java.io.IOException;
import java.util.*;


public class Input {
        Scanner scanner = new Scanner(System.in);

        public Input() {

        }


        public String inputName() {
                boolean chek;
                String inputName;
                do{
                        System.out.println("INPUT NAME STUDENT : ");
                        inputName = scanner.next();
                        String namePattern = "^[a-zA-Z\\s]+";
                        chek = inputName.matches(namePattern);
                        if(!chek){
                                System.err.println("INVALID NAME, PLEASE ENTER : ");
                        }
                }while(!chek);
                return inputName;
        }

         public float inputCoefficient() {
                float input;
                do{
                        try{
                                input = scanner.nextFloat();
                                if(input >= 0 && input <= 10) {
                                        break;
                                }else System.out.println("INVALID , PLEASE ENTER : ");
                        }catch (Exception e) {
                                System.err.println("IMPORTED COEFFICIENT, PLEASE TRY AGAIN :");
                        }finally {
                                scanner.nextLine();
                        }
                }while(true);
                return input;
        }


        public String inputUsername() {
                String inputUser;
                boolean chek;
                do{
                   System.out.println("INPUT USERNAME : ");
                   String regex = "^[a-z0-9_-]{3,15}$";
                   inputUser = scanner.next();
                   chek = inputUser.matches(regex);
                   if(!chek){
                           System.err.println("INVALID USERNAME, PLEASE ENTER");
                   }
                }while (!chek);
                return inputUser;
        }

        public String inputPassword() {
                String inputPass;
                boolean chek;
                do{
                        System.out.println("INPUT PASSWORD: ");
                        String regex =  "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
                        inputPass = scanner.next();
                        chek = inputPass.matches(regex);
                        if(!chek){
                                System.err.println("INVALID PASSWORD, PLEASE ENTER");
                        }
                }while (!chek);
                return inputPass;
        }

        public int inputId() {

                int id;
                do{
                        try{
                                id = scanner.nextInt();
                                if(id > 0 && id <= 100) {
                                        break;
                                }else System.out.println("INVALID (1 --> 100): ");
                        }catch (Exception e){
                                System.err.println("IMPORTED WRONG , PLEASE TRY AGAIN :");

                        }finally {
                                scanner.nextLine();
                        }
                }while (true);
                return id;
        }

        public boolean chekNext() {
                String chekNext;
                while (true) {
                        System.out.println("DO YOU WANT TO CONTINUE ? (Y/N) : ");
                        chekNext = scanner.next();
                        if(chekNext.equals("Y")) {
                                return true;
                        }else if(chekNext.equals("N")) {
                                return  false;
                        }else System.err.println("PLEASE TRY AGAIN : ");
                }
        }

        public String choicePosition() {
                String position;
                System.out.println("PLEASE CHOICE ONE : ");
                System.out.println("[1]--STUDENT--");
                System.out.println("[2]--TEACHER--");
                while (true){
                        position = scanner.nextLine();
                        if(position.equals("1") || position.equals("2")){
                                break;
                        }else System.out.println("PLEASE AGAIN :");
                }
                return position;
        }

        public String inputAccuracy() {
               String input;
               boolean chek;
               do{
                       System.out.println("INPUT ACCURACY :");
                       String regex = "[1-9]";
                       input = scanner.next();
                       chek = input.matches(regex);
                       if(!chek) {
                               System.err.println("IMPORTED WRONG ACCURACY 0 -> 9: ");
                       }
               }while (!chek);
               return input;
        }

        public Point inputPoint() {
                while (true){
                        Point point = new Point();
                        System.out.println("INPUT SCORE COEFFICIENT 1 : ");
                        point.setCoefficientOne(inputCoefficient());
                        System.out.println("INPUT SCORE COEFFICIENT 2 : ");
                        point.setCoefficientTwo(inputCoefficient());
                        System.out.println("INPUT SCORE COEFFICIENT 3 : ");
                        point.setCoefficientThree(inputCoefficient());
                        System.out.println("INPUT SCORE COEFFICIENT 4 : ");
                        point.setCoefficientFor(inputCoefficient());
                        return point;
                }

        }

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
        }
}
