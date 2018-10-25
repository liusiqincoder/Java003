package 设计模式.模板方法模式;

/**
 * Created by Administrator on 2018/10/13.
 */
public class tea extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("Add tea");
    }

    @Override
    void brew() {
        System.out.println("Tea is brew");
    }
}
