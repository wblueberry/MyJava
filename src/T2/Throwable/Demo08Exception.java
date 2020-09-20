package T2.Throwable;

import java.util.List;

/*
异常注意事项
 */
public class Demo08Exception {
    public static void main(String[] args) {
        /*
        多个异常使用捕获又改如何处理？
        1，多个异常分别处理
        2，多个异常一次捕获，多次处理
        3，多个异常一次捕获一次处理
         */

        //1，多个异常分别处理
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }


        //2，多个异常一次捕获，多次处理（一个try，多个catch）
        //注意事项：catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错。
        //ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }


        //3，多个异常一次捕获一次处理
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (Exception e){
            System.out.println(e);
        }

        //运行时异常被抛出可以不处理，既不捕获也不申明抛出

        System.out.println("后续代码");
    }
}
