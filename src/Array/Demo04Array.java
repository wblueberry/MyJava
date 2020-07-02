package Array;

/*
遍历数组：说的就是对数组当中的每一个元素进行逐一处理。
默认处理为打印输出
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 35, 48, 58, 66};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("===============");
        int len = array.length;
        for(int j=0,i=len-1;j<i;j++,i--){
            int tem = array[i];
            array[i] = array[j];
            array[j] = tem;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
