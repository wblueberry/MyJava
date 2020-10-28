package T3.day01.Annotation;

public @interface MyAnno1 {
    String name() default "张三";
    int age() default 20;

    Person per();

    MyAnno2 anno2();

    String[] strs();
}
