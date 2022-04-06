package org.example;

public class ClassA {
    private final int a;
    private final int b;
    private String testString;

    private ClassA(int a, int b, String testString) {
        this.a = a;
        this.b = b;
        this.testString = testString;
    }

    private ClassA() {
        this.a = 0;
        this.b = 0;
    }


    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }


    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
