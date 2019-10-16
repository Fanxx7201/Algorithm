package sorting.ali;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * @ProjectName: algorithm
 * @Package: sorting.ali
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/15 14:50
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test3 {


    public static void main(String[] args) {

        CollatorComparator comparator = new CollatorComparator();
        TreeMap map = new TreeMap(comparator);
        map.put("1570593273486,03Ad2k33", "1570593273486,03Ad2k33");
        map.put("1570593273487,03Ad233d988dfd", "1570593273487,03Ad233d988dfd");
        map.put("1570593273488,03Ad2k34", "1570593273488,03Ad2k34");
        map.put("1570593273486,03Ad2k33", "1570593273486,03Ad2k33");
        map.put("1570593273486,03Ad2k33", "1570593273486,03Ad2k33");


        Collection col = map.values();
        Iterator it = col.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
