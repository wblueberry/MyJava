package T3.day01.Annotation;

import java.lang.annotation.*;


/*
元注解：用于描述注解的注解
    1，@Target：描述注解能够作用的位置
    2，@Retention：描述注解被保留的阶段
    3，@Documented：描述注解是否被抽取到api文档中
    4，@Inherited：描述注解是否被子类继承
 */
@Target(value={ElementType.TYPE,ElementType.METHOD})//TYPE表示该注解只能作用与类上面
@Retention(RetentionPolicy.RUNTIME)
@Documented//描述注解是否被抽取到api文档中
@Inherited//描述注解是否被子类继承
public @interface MyAnno3 {

}
