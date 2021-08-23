package model;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private Point math;
    private Point physics;
    private Point chemistry;
    private Point literature;
    public static int count = 0;

    public Student() {
        this.id = autoId();
    }

    public static int autoId() {
        count++;
        return count;
    }

//    public Student(String name, Point math, Point physics, Point chemistry, Point literature) {
//        this.id = autoId();
//        this.name = name;
//        this.math = math;
//        this.physics = physics;
//        this.chemistry = chemistry;
//        this.literature = literature;
//
//    }

    public Student(int id, String name, Point math, Point physics, Point chemistry, Point literature) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.literature = literature;

    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getMath() {
        return math;
    }

    public void setMath(Point math) {
        this.math = math;
    }

    public Point getPhysics() {
        return physics;
    }

    public void setPhysics(Point physics) {
        this.physics = physics;
    }

    public Point getChemistry() {
        return chemistry;
    }

    public void setChemistry(Point chemistry) {
        this.chemistry = chemistry;
    }

    public Point getLiterature() {
        return literature;
    }

    public void setLiterature(Point literature) {
        this.literature = literature;
    }

    public String[] csvStudent(String line) {
        String[] array = line.split(";");
        return array;
    }

//    @Override
//    public String toString() {
//        return id + "|-----|" + name + "|-----|" + math + "|-----|" + physics + "|-----|" + chemistry + "|-----|" + literature + "|-----|";
//    }

    @Override
    public String toString() {
        return  "ID : " + id + "Name : " + "\n"
                + "POINT MATH       : " + math.toString() +     "MEDIUM SCORE :" + math.mediumScore() + "\n"
                + "POINT PHYSICS    : " + physics.toString() +  "MEDIUM SCORE :" + physics.mediumScore() +"\n"
                + "POINT CHEMISTRY  : " + chemistry.toString() +"MEDIUM SCORE :" + chemistry.mediumScore() +"\n"
                + "POINT LITERATURE : " + literature.toString()+"MEDIUM SCORE :" + literature.mediumScore() +"\n";

    }



//    @Override
//    public String toString() {
//        return String.format("%-2s %-6s %-9s %-9s %-9s %-9s", id, name, math, physics, chemistry, literature);
//    }

//    public void display() {
//        String.format("|_ID_|____||____NAME_____||__________COEFFICIENT 1_________||_________COEFFICIENT 1__________||________COEFFICIENT 1_________||___________COEFFICIENT 1____________||");
//        String.format("\n%-2s %-16s %-5s %-5s %-5s %-5s", id, name, math, physics, chemistry, literature);
//    }
    public String toStringCsv() {
        return id + ";" + name + ";" + math.toStringCsv() + ";" + physics.toStringCsv() + ";" + chemistry.toStringCsv() + ";" + literature.toStringCsv() + "\n";
    }
}
