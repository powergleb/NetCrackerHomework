package org.example;

import org.example.subpackage.Autowired;

public class ClassB {
    @Autowired
    private ClassA classA;
    @Autowired
    private ClassC classС;

    public ClassB(){

    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }

    public ClassC getClassB() {
        return classС;
    }

    public void setClassB(ClassC classС) {
        this.classС = classС;
    }
}
