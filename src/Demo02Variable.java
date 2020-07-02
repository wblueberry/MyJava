//变量：程序运行期间，内容可以发生改变的量
//
//        创建一个变量并且使用的格式：
//        数据类型 变量名称；//创建了一个变量
//        变量名称 = 数据值；//赋值。
//        一步到位格式：
//        数据类型 变量名称 = 数据值；//在创建变量的同时，立刻放入指定数据值

public class Demo02Variable {
    public static void main(String[] args){
        //创建一个变量
        //格式：数据类型 变量名称；
        int num1;
        //向变量当中存入一个数据
        //格式：变量名称 = 数据值；
        num1 = 10;
        //当打印输出变量名称的时候，显示出来的是变量的内容
        System.out.println(num1);

        //改变变量当中本来的数字，变成新的数字
        num1 = 20;
        System.out.println(num1);//20

        //使用一步到位格式来定义变量
        //格式:数据类型 变量名称 = 数据值；
        int num2 = 25;
        System.out.println(num2);

        num2 = 35;
        System.out.println(num2);
        System.out.println("========================");

        //byte 取值范围为-128~127
        byte num3 = 30;//注意，右侧数值范围不能超过左侧数据类型的取值范围
        System.out.println(num3);
        //byte num4 =  400;//此处会报错
        //System.out.println(num4);

        //short
        short num5 = 50;
        System.out.println(num5);

        //long
        long num6 = 300000000000L;//后面要接L，不然会报错
        System.out.println(num6);

        //float
        float num7 = 2.5F;//浮点数后面加F
        System.out.println(num7);

        //double
        double num8 = 1.2;
        System.out.println(num8);

        //char
        char zifu1 = 'A';
        System.out.println(zifu1);

        //boolean
        boolean var1 = true;
        System.out.println(var1);
        boolean var2 = false;
        System.out.println(var2);
        //将一根变量的数据内容，赋值给另一个变量
        boolean var3 = var2;
        System.out.println(var3);


    }
}
