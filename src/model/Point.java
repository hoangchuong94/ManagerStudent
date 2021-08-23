package model;

import java.io.Serializable;

public class Point {
    private float coefficientOne;
    private float coefficientTwo;
    private float coefficientThree;
    private float coefficientFor;

    public Point() {

    }

    public Point(float coefficientOne , float coefficientTwo, float coefficientThree, float coefficientFor) {
        this.coefficientOne = coefficientOne;
        this.coefficientTwo = coefficientTwo;
        this.coefficientThree = coefficientThree;
        this.coefficientFor = coefficientFor;
    }


    public float getCoefficientOne() {
        return coefficientOne;
    }

    public void setCoefficientOne(float coefficientOne) {
        this.coefficientOne = coefficientOne;
    }

    public float getCoefficientTwo() {
        return coefficientTwo;
    }

    public void setCoefficientTwo(float coefficientTwo) {
        this.coefficientTwo = coefficientTwo;
    }

    public float getCoefficientThree() {
        return coefficientThree;
    }

    public void setCoefficientThree(float coefficientThree) {
        this.coefficientThree = coefficientThree;
    }

    public float getCoefficientFor() {
        return coefficientFor;
    }

    public void setCoefficientFor(float coefficientFor) {
        this.coefficientFor = coefficientFor;
    }

    public float goalAverage() {
        return (coefficientOne + coefficientTwo + coefficientThree + coefficientFor) / 4;
    }

//    @Override
//    public String toString() {
//        return coefficientOne + "|-----|" + coefficientTwo + "|-----|" + coefficientThree + "|-----|" + coefficientFor;
//    }


//    @Override
//    public String toString() {
//        return String.format("|%-5s %-5s %-5s| %-5s| ", coefficientOne,coefficientTwo,coefficientThree,coefficientFor) ;
//    }
    public float mediumScore() {
        return (coefficientOne + coefficientTwo + coefficientThree +coefficientFor)/ 4;
    }

    @Override
    public String toString() {
        return "[" +
                "coefficientOne = " + coefficientOne +
                ", coefficientTwo = " + coefficientTwo +
                ", coefficientThree = " + coefficientThree +
                ", coefficientFor = " + coefficientFor +
                ']';
    }

    public String[] csvPoint(String line) {
        String[] array = line.split(",");
        return array;
    }

    public String toStringCsv() {
        return coefficientOne + "," + coefficientTwo + "," + coefficientThree + "," + coefficientFor ;
    }
}
