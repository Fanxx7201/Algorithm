/**
 * @ProjectName: algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: ${TYPE_NAME}
 * @Description: 将数组中的元素, 从小到大进行排序.
 * @Author: fanxx
 * @CreateDate: 2018/11/20 17:47
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class SelectionSort {
    //todo: 1.寻找到[i, n) 区间内的最小值
    //todo: 2.将最小值, 和排序位置的元素进行交换 (C++使用swap函数进行交换, java用什么? 用自定义的swap方法就行)
    //todo: 3.测试排序算法

    public void selectionSortMethod(int[] arr, int n){ //arr是数组, n是数组元素个数

        for (int i = 0; i < n; i++){

            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] <= arr[minIndex]){
                    int a = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = a;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 4, 0, 1, 5, 7, 8};
        SelectionSort ss = new SelectionSort();
        ss.selectionSortMethod(arr, 10);

        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
