package T2.Recurison;
/*
练习：
    使用递归计算1-n之间的和
 */
public class Demo02Recurison {
    public static void main(String[] args) {
        int s = sum(9);
        System.out.println(s);
    }

    //定义一个方法，递归计算1-n之间的和
    //使用递归必须明确的条件：1，递归的结束条件。2，递归的目的
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);
    }
}
