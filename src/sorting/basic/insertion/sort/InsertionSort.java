package sorting.basic.insertion.sort;

/**
 * @description:
 * @author: fanxinxin
 * @create: 2018-12-15
 */
public class InsertionSort {

    private InsertionSort(){}

    public static void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            //写法1见InsertionSortTest -- >最容易理解.
            //写法2, swap元素见Test
            /*for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--){
                swap(arr, j, j-1);
            }*/
            //写法3. 改进后的插入排序. 赋值代替交换位置.效率高.
            Comparable e = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }

    }
}
