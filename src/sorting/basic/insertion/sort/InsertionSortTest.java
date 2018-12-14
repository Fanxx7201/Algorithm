package sorting.basic.insertion.sort;

/**
 * @ProjectName: algorithm
 * @Package: sorting.basic.insertion.sort
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2018/12/14 16:58
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class InsertionSortTest {

    private InsertionSortTest(){};

    //n 一共有n个元素
    public void insertion(int arr[], int n){
        for(int i = 1; i < n; i++){
            //j是当前元素的索引.
            for (int j = i; j < 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, i, j);
                }else{
                    break;
                }
            }
        }
    }

    //交换的方法
    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
