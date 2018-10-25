package AlgorithmAndDataStruct;

import org.junit.Test;

import java.util.Arrays;

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

    public heapSort(){

    }

    public heapSort(int[] arr){
        /*
        * 构建最大堆
        * */
        for(int i=1;i<arr.length;i++)
            shitUp(arr,i);
    }

    public int[] minK(int[] arr,int k){
        /*
        * 实现时忘记了topK是要用最小堆的，
        * 所以将就minK
        * */
        int[] res=new int[k+1];
        for(int i=1;i<=k;i++){
            res[i]=arr[i];
        }
        BuildMaxHeap(res,k);
        for(int i=k;i<arr.length;i++){
            if(arr[i]>res[1])
                continue;
            else{
                res[1]=arr[i];
                shitDown2(res,1,k);
            }
        }
        return res;
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

    private void shitDown1(int[] arr,int n){
        /*
        * 这种方法适合构造包含一定数量的堆
        * 需要传入参数k
        * 用以解决min(n)问题
        * 这是经典写法
        * 对于已经是n容量的堆才适合
        * 这里太麻烦
        * */
        int i=1;
        while(true){
            int c=i>>2;
            if(c>n)
                break;
            //c是左节点
            if(c+1<n&&arr[c+1]<arr[c])
                c++;
            if(arr[i]<=arr[c])
                break;
            int tmp=arr[i];
            arr[i]=arr[c];
            arr[c]=tmp;
            i=c;
        }
    }

    private void shitDown2(int[] arr,int s,int n){
        /*
        * 看到的一种很好的解决mn（n）问题
        * */
        arr[0]=arr[s];
        for(int i=s*2;i<=n;i*=2){
            if(i<n&&arr[i]<arr[i+1])
                i++;
            if(arr[0]>=arr[i])
                break;
            else{
                arr[s]=arr[i];
                s=i;
            }
        }
        arr[s]=arr[0];
    }

    void BuildMaxHeap(int[] arr,int n)
    {
        for(int i=n/2;i>0;i--)
            shitDown2(arr,i,n);//向下调整
    }

    public static void main(String[] args){
        int[] arr={0,35,40,26,51,19,23,29,17,22,18,15,20};
        heapSort sort=new heapSort(arr);
        /*for(int i=1;i<arr.length;i++)
            System.out.println(arr[i]);*/
        int k=3;
        int[] b=sort.minK(arr,k);
        for(int i=1;i<=k;i++){
            System.out.println(b[i]);
        }
    }

}
