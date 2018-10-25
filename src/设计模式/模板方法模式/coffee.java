package 设计模式.模板方法模式;

/**
 * Created by Administrator on 2018/10/13.
 */
public class coffee extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Coffee is brew");
    }
}
