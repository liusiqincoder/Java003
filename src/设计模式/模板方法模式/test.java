package 设计模式.模板方法模式;

/**
 * Created by Administrator on 2018/10/13.
 */
public class test {
    public static void main(String[] args){
        coffee c=new coffee();
        tea t=new tea();
        c.preparerecipe();
        t.preparerecipe();
    }
}
