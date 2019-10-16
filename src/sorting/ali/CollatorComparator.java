package sorting.ali;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;

/**
 * @ProjectName: algorithm
 * @Package: sorting.ali
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/15 14:54
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class CollatorComparator implements Comparator {


    Collator collator = Collator.getInstance();

    @Override
    public int compare(Object o1, Object o2) {
        CollationKey ck1 = collator.getCollationKey(String.valueOf(o1));
        CollationKey ck2 = collator.getCollationKey(String.valueOf(o2));
        return ck1.compareTo(ck2);
    }
}
