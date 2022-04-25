package org.example;

import org.example.MyAnnotation;
import org.example.subpackage.Autowired;

import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Container {
    private Set<Class> types;
    private Map<Class, Object> objects;

    public Container(Set<Class> types) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        this.types = types;
        objects = new HashMap<>();
        init();
    }

    private void init() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        for (Class elem : types) {
            objects.put(elem,createObj(elem));
        }

    }

    private Object createObj(Class element) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for (Field field : element.getDeclaredFields()) {
            if (field.getDeclaredAnnotation(Autowired.class) != null) {
                objects.put(element,createObj(field.getType()));
            }
        }
        Constructor constructor = element.getDeclaredConstructor();
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }

        Object obj = constructor.newInstance();
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.getDeclaredAnnotation(Autowired.class) != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);

                }
                field.set(obj,objects.get(field.getType()));

            }
        }
        return obj;
    }

    /*
    //вернуть обхект по типу из мапы.
    Если тип остутсвтует в types, то выбрасываем исключение
    Если объект допустимого типа, но отсутствует - создать
     */
    public Object getObjectByType(Class type) {
        return objects.get(type);
    }
}
