package AlgorithmAndDataStruct;

import org.junit.Test;

/**
 * Created by Administrator on 2018/10/19.
 * Java实现堆排序
 * 用数组x实现
 * root=1
 * value(i)=x[i]
 * leftChild(i)=2*i
 * rightCild(i)=2*i+1
 * parent(i)=i/2
 * null(i)=(i<1) or (i>n)
 */
public class heapSort {



    public heapSort(int[] arr){
        /*
        * 构建最大堆
        * */
        for(int i=1;i<arr.length;i++)
            shitUp(arr,i);
    }

    private void shitUp(int[] arr,int n){
        /*
        * 这种适合构建堆
        * */
        while(true){
            if(n==1)
                break;
            int i=n/2;
            if(arr[i]<=arr[n])
                break;
            int tmp=arr[i];
            arr[i]=arr[n];
            arr[n]=tmp;
            n=i;
        }
    }

    @Test
    public void test(){
        int[] arr={0,35,40,26,51,19,23,29,17,22,18,15,20};
        heapSort sort=new heapSort(arr);
        for(int i=1;i<arr.length;i++)
            System.out.println(arr[i]);
    }

}
