package app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo {
    String name();

    String returnType();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String name();

    String surname();
}

public class ArrayUtils {

    @Author(name = "John", surname = "Smith")
    @MethodInfo(name = "print", returnType = "void")
    public void print(String[] array) {
        for (String item : array) {
            System.out.println(item + ", ");
        }
    }
}
