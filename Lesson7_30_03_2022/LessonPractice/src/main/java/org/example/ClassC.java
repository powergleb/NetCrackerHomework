package org.example;

import org.example.subpackage.Autowired;

public class ClassC {
    @Autowired
    private ClassA classA;

    private String s;

    public ClassC(){

    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
