package 设计模式.单例模式;

/**
 * Created by Administrator on 2018/10/3.
 * 单例设计模式
 */
public class Singleton {
    public static volatile Singleton instance = null;

    //    method1
    /*
    *
    * */
    public Singleton newInStance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
/*
    method2
    public synchronized Singleton newInStance(){
        if(instance==null){
             instance=new Singleton();
         }

        return instance;
    }

*/


    /*
    * method3
      public Singleton newInStance(){
        synchronized (Singleton.class){
            if(instance==null){
                 instance=new Singleton();
             }
        }

        return instance;
    }

    * */
    private Singleton() {

    }
}
