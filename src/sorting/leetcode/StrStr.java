package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/14 10:33
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class StrStr {




    private static int strStr(String haystack, String needle){
        if(needle == null || needle == ""){
            return 0;
        }
        if(!haystack.contains(needle)){
            return -1;
        }else{

            int i = haystack.indexOf(needle);


            return i;
        }
    }


    public static void main(String[] args) {

    }
}
