package 设计模式.适配器模式;

/**
 * Created by Administrator on 2018/10/8.
 */
public class fatTiger implements bigCat{

    private tiger t;

    public fatTiger() {
    }

    public fatTiger(tiger t){
        this.t=t;
        System.out.println("我是胖虎，我潜入了猫群");
    }

    @Override
    public void action() {
        t.action();
    }

    public static void main(String[] args){
        bigCat aCat=new cat();
        tiger t=new tiger();
        bigCat fakeCat=new fatTiger(t);

        if(aCat.getClass()!=fakeCat.getClass()){
            System.out.println("胖虎die");
        }
    }
}
