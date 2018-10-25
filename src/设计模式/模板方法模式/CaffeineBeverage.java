package 设计模式.模板方法模式;

/**
 * Created by Administrator on 2018/10/13.
 */
public abstract class CaffeineBeverage {
    final void preparerecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantCondiments()){
            addCondiments();
        }
    }

    private void boilWater(){
        //煮沸水
        System.out.println("Boiling water");
    }

    private void pourInCup(){
        //倒进杯子里
        System.out.println("Pouring into cup");
    }

    private boolean customerWantCondiments(){
        //客户是否想加调料，子类可以选择覆盖，默认true
        return true;
    }
    //天加调料
    abstract void addCondiments();
    //冲泡
    abstract void brew();
}
