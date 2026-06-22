package app;


import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    static void main(String[] args) throws NoSuchMethodException {

        System.out.println("***Reflection***");
        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println(Arrays.toString(method.getAnnotations()));
            System.out.println();
        }


        System.out.println("***Annotation***");
        Method method = ArrayUtils.class.getDeclaredMethod("print", String[].class);
        MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
        Author author = method.getAnnotation(Author.class);
        System.out.println("Method name: " + methodInfo.name());
        System.out.println("Return type: " + methodInfo.returnType());
        System.out.println("Author name: " + author.name());
        System.out.println("Author surname: " + author.surname());
    }
}
