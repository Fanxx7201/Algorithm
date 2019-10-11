package sorting.advance.mergesort;

import java.util.Arrays;

/**
 * @ProjectName: algorithm
 * @Package: sorting.advance.mergesort
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/1/18 15:08
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class MergeSort {

    private MergeSort(){}
    //归并排序, 递归操作. 对arr[1...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r){
        //该数组只有一个元素, 或者一个元素都没有.
        //todo:这里也是递归结束的一个标志.
        if(l >= r){
            return;
        }
        //这里有一些风险, 以后可以拓展一下
        int mid = (l + r) / 2;
        //对左右两部分进行归并排序, 然后给他们合并起来
        sort(arr, l, mid);
        sort(arr, mid +1, r);
        //合并的操作
        merge(arr, l, mid, r);
    }








    //首先, 将要排序的数组分成两部分 arr[l...mid], arr[mid+1...r]
    //其次, 分别对这两个部分进行归并排序
    private static void merge(Comparable[] arr, int l, int mid, int r){

        //aux是临时空间的意思.
        Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);
        //i:指向左半部分的索引起始位置, j:指向右半部分索引的起始位置
        int i = l, j = mid + 1;
        //k是临时索引.
        for(int k = l; k <= r; k++){
            //左半部分已经全部处理完毕
            if( i > mid ){
                arr[k] = aux[j - 1];
                j++;
            }else if( j > r){ // 右半部分已经全部处理完毕
                arr[k] = aux[i - 1];
                i++;
            }else if( aux[i - 1].compareTo(aux[j - 1]) < 0){ // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i - 1];
                i++;
            }else{ // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j - 1];
                j++;
            }

        }

    }
}
