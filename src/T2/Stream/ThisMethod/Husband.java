package T2.Stream.ThisMethod;
/*
通过this引用本类的成员方法
 */
public class Husband {
    //定义一个买房子的方法
    public void buyHouse(){
        System.out.println("北京买房！");
    }

    //定义一个结婚的方法,参数传递Richable接口
    public void marry(Richable r){
        r.buy();
    }

    //定义一个非常开心的方法
    public void soHappy(){
        //调用结婚的方法，方法的参数是一个函数式接口，传递lambda表达式
        marry(()->{
            //使用this调用成员方法
            this.buyHouse();
        });

        /*
        使用方法引用，优化lambda表达式
        this已经存在，本类的成员方法buyHouse已经存在
         */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }

}
