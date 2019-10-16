package sorting.ali;

/**
 * @ProjectName: algorithm
 * @Package: sorting.ali
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/12 10:56
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test2 {


    public static void main(String[] args) {
        String a = "1570593273486,03Ad2k33";
        String b = "1570593273486,03Ad2k33";
        String c = "1570593273486,04Ad2k33";
        int o = Integer.valueOf(a.hashCode()).intValue() % 100;
        System.out.println(o);
        System.out.println(Integer.valueOf(c.hashCode()).intValue() % 100);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());










    }
}
