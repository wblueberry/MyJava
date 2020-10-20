package T2.Function.Demo02;
/*
使用lambda优化日志案例
lambda特点：延迟加载
lambda使用前提：必须存在函数式接口
 */
public class Demo02Lambda {
    //定义一个显示日志的方法，方法的参数传递日志的等级和messagebuilder接口
    public static void showLog(int lev,MessageBuilder mb){
        //对日志的等级进行判断，如果是1级，则调用MessageBuilder接口中的方法
        if(lev == 1){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用方法
        showLog(1,()->{
            //返回一个拼接的字符串
            return msg1+msg2+msg3;
        });
    }
}
