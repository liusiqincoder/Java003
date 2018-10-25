package 剑指offer;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/10/24.
 */
public class 丑数 {
    public static int GetUglyNumber_Solution(int index) {
        Queue<Integer> que1=new LinkedList<>(),
                que2=new LinkedList<>(),
                que3=new LinkedList<>();
        int num=1,min=1;
        while (num<index){
            int t1=min*2,
            t2=min*3,
            t3=min*5;
            if(t1%7!=0)
                que1.add(t1);
            if(t2%7!=0)
                que2.add(t2);
            if(t3%7!=0)
                que3.add(t3);
            if(que1.isEmpty()){
                t1=7;
            }else{
                t1=que1.peek();
            }
            if(que2.isEmpty()){
                t2=7;
            }else{
                t2=que2.peek();
            }
            if(que3.isEmpty()){
                t3=7;
            }else{
                t3=que3.peek();
            }
            if(t1%7!=0&&t1<=t2&&t1<=t3){
                min=t1;
                que1.poll();
            }else if(t2%7!=0&&t2<=t1&&t2<=t3){
                min=t2;
                que2.poll();
            }else if(t3%7!=0){
                min=t3;
                que3.poll();
            }
            num++;
        }
        return min;
    }

    @Test
    public void test(){
        System.out.println(GetUglyNumber_Solution(11));
    }
}
