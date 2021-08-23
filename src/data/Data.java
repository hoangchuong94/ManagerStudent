package data;

import model.Account;
import model.Point;
import model.Student;

import java.io.*;
import java.util.*;

public class Data extends Input {
    private String fileStudent = "D:\\ManageStuden\\src\\file\\Student.csv";
    private String fileAccount = "D:\\ManageStuden\\src\\file\\PassWord.csv";
    private List<Student> studentList;
    private LinkedList<Account> accountList;

    public Data() {
        studentList = new ArrayList<>();
        accountList = new LinkedList<>();
    }

//    public void readFileAccount() throws IOException {
//        FileInputStream fileInputStream= null;
//        ObjectInputStream objectInputStream = null;
//        try{
//            fileInputStream = new FileInputStream(fileAccount);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            Account account;
//            accountList = (LinkedList<Account>) objectInputStream.readObject();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(fileInputStream != null) {
//                fileInputStream.close();
//            }if(objectInputStream != null) {
//                objectInputStream.close();
//            }
//        }
//    }
//
//    public void writeFileAccount() throws IOException {
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try{
//            fileOutputStream = new FileOutputStream(fileAccount);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(getAccountList());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            if(fileOutputStream != null) {
//                fileOutputStream.close();
//            }if(objectOutputStream != null) {
//                objectOutputStream.close();
//            }
//        }
//    }


//    public void readFileStudent() throws IOException {
//        FileInputStream fileInputStream= null;
//        ObjectInputStream objectInputStream = null;
//        try{
//            fileInputStream = new FileInputStream(fileStudent);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            studentList = (List<Student>) objectInputStream.readObject();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(fileInputStream != null) {
//                fileInputStream.close();
//            }if(objectInputStream != null) {
//                objectInputStream.close();
//            }
//        }
//    }
//
//    public void writeFileStudent() throws IOException {
//
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(fileStudent);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(studentList);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(fileOutputStream != null) {
//                fileOutputStream.close();
//            }if(objectOutputStream != null){
//                objectOutputStream.close();
//            }
//        }
//    }

//    public void readFile(String fileName, Student student) throws IOException {
//        FileInputStream fileInputStream= null;
//        ObjectInputStream objectInputStream = null;
//        try{
//            fileInputStream = new FileInputStream(fileName);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            student = (Student) objectInputStream.readObject();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(fileInputStream != null) {
//                fileInputStream.close();
//            }if(objectInputStream != null) {
//                objectInputStream.close();
//            }
//        }
//    }
//    public void writeFile(String fileName, Student student) throws IOException {
//
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(fileName);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(student);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if(fileOutputStream != null) {
//                fileOutputStream.close();
//            }if(objectOutputStream != null){
//                objectOutputStream.close();
//            }
//        }
//    }

    public void writeFileAccountBf() {
        try{
            File file = new File(fileAccount);
            if(!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(Account accounts : accountList) {
                bufferedWriter.write(accounts.toString());
            }
            bufferedWriter.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void readFileAccountBf() {
        try{
            FileReader fileReader = new FileReader(fileAccount);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
              String[] arrayAccount = line.split(";");
              Account account = new Account();
              account.setPosition(arrayAccount[0]);
              account.setUserName(arrayAccount[1]);
              account.setPassWord(arrayAccount[2]);
              account.setAccuracy(arrayAccount[3]);
              accountList.add(account);
            }
            bufferedReader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFileStudentBf()  {
        try{
            File file = new File(fileStudent);
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student students : getStudentList()) {
                bufferedWriter.write(students.toStringCsv());
            }
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFileStudentBf() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileStudent));
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
//                    String line = bufferedReader.readLine();
                    String[] students = line.split(";");
                    Student student = new Student();
//                    try{
                        student.setId(Integer.parseInt(students[0]));
                        student.setName(students[1]);
//                    }catch (Exception e) {
//                        e.printStackTrace();
//                    }finally {
//                        scanner.nextLine();
//                    }
                    student.setId(Integer.parseInt(students[0]));
                    student.setName(students[1]);

                    String[] coefficient = students[2].split(",");
                    Point point = new Point();
                    point.setCoefficientOne(Float.parseFloat(coefficient[0]));
                    point.setCoefficientTwo(Float.parseFloat(coefficient[1]));
                    point.setCoefficientThree(Float.parseFloat(coefficient[2]));
                    point.setCoefficientFor(Float.parseFloat(coefficient[3]));
                    student.setMath(point);

                    Point point1= new Point();
                    String[] coefficient1 = students[3].split(",");
                    point1.setCoefficientOne(Float.parseFloat(coefficient1[0]));
                    point1.setCoefficientTwo(Float.parseFloat(coefficient1[1]));
                    point1.setCoefficientThree(Float.parseFloat(coefficient1[2]));
                    point1.setCoefficientFor(Float.parseFloat(coefficient1[3]));
                    student.setPhysics(point1);

                    Point point2= new Point();
                    String[] coefficien2 = students[4].split(",");
                    point2.setCoefficientOne(Float.parseFloat(coefficien2[0]));
                    point2.setCoefficientTwo(Float.parseFloat(coefficien2[1]));
                    point2.setCoefficientThree(Float.parseFloat(coefficien2[2]));
                    point2.setCoefficientFor(Float.parseFloat(coefficien2[3]));
                    student.setChemistry(point2);

                    Point point3= new Point();
                    String[] coefficient3 = students[5].split(",");
                    point3.setCoefficientOne(Float.parseFloat(coefficient3 [0]));
                    point3.setCoefficientTwo(Float.parseFloat(coefficient3 [1]));
                    point3.setCoefficientThree(Float.parseFloat(coefficient3 [2]));
                    point3.setCoefficientFor(Float.parseFloat(coefficient3 [3]));
                    student.setLiterature(point3);

                    getStudentList().add(student);
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getFileStudent() {
        return fileStudent;
    }

    public String getFileAccount() {
        return fileAccount;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
