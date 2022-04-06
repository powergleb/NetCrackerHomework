package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        HashSet<Class> set= new HashSet<>();
        set.add(ClassA.class);
        set.add(ClassB.class);
        set.add(ClassC.class);
        Container container = new Container(set);
        Object a = container.getObjectByType(ClassA.class);

        System.out.println(a.toString());

    }
}
