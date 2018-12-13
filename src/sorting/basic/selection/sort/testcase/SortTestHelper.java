package sorting.basic.selection.sort.testcase;

/**
 * @ProjectName: algorithm
 * @Package: sorting.basic.selection.sort.testcase
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2018/12/13 16:44
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class SortTestHelper {
    //不允许产生实例
    private SortTestHelper(){};

    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR){
        //assert<boolean表达式> : 断言 如果<boolean表达式>为true，则程序继续执行。
        //如果为false，则程序抛出AssertionError，并终止执行。
        assert rangeL <= rangeR;
        Integer[] arr = new Integer[n];
        for (int i =0; i < n; i++){
            arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        }
        return arr;
    }


    //打印arr数组的所有内容
    public static void printArray(Object arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        return;
    }
}
