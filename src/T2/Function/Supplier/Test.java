package T2.Function.Supplier;

import java.util.function.Supplier;

public class Test {
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100,50,0,88,-22,-50,99};
        int maxValue = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
