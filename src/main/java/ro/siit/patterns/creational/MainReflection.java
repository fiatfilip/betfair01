package ro.siit.patterns.creational;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Reflection reflection = new Reflection();
        // reflection.getClass().getMethod("reflect", String.class).invoke(reflection, "Ana");
        Method reflectMethod = Reflection.class.getDeclaredMethods()[1];
        reflectMethod.setAccessible(true);
        System.out.println(reflectMethod.invoke(reflection, "Ana"));
        // reflection.reflect("Bob");
    }
}
