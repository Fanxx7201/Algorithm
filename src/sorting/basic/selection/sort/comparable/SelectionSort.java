package sorting.basic.selection.sort.comparable;

/**
 * @ProjectName: algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: ${TYPE_NAME}
 * @Description: 排序算法
 * @Author: fanxx
 * @CreateDate: 2018/11/20 17:47
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class SelectionSort {
    //todo: 1.寻找到[i, n) 区间内的最小值
    //todo: 2.将最小值, 和排序位置的元素进行交换 (C++使用swap函数进行交换, java用什么? 用自定义的swap方法就行)
    //todo: 3.测试排序算法

    //算法不允许产生实例
    private SelectionSort(){}

    public static void selectionSortMethod(Comparable[] arr){ //arr是数组, n是数组元素个数
        int n = arr.length;
        for (int i = 0; i < n; i++){

            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                //使用compareTo方法比较两个Comparable对象的大小 . 负数, 说明比较小.
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }
    }
    private static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        //测试String
        String[] c = {"D", "C", "B", "A"};
        SelectionSort.selectionSortMethod(c);
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]);
            System.out.print(" ");
        }
        System.out.println();


        //测试自定义的类Student
        Student[] d = new Student[4];
        d[0] = new Student("D", 90);
        d[1] = new Student("C",100);
        d[2] = new Student("B",95);
        d[3] = new Student("A",95);
        SelectionSort.selectionSortMethod(d);
        for( int i = 0 ; i < d.length ; i ++ ){
            System.out.println(d[i]);
        }
    }
}
