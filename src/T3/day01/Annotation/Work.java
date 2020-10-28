package T3.day01.Annotation;

@MyAnno1(age = 19,name = "李四",per = Person.p1,anno2 = @MyAnno2,strs = {"abc","hello"})
public class Work {


    public void test(){
        System.out.println("work  ....");
    }
}
