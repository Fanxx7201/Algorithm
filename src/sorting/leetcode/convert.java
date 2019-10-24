package sorting.leetcode;

/**
 * @ProjectName: algorithm
 * @Package: sorting.leetcode
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/23 17:03
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class convert {

    public String convert(String s, int numRows){
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }
        StringBuffer[] buffers = new StringBuffer[numRows];
        for(int i = 0; i < buffers.length; i++){
            buffers[i] = new StringBuffer("");
        }
        int idx = 0;
        int step = 1;
        for(int i = 0; i < s.length(); i++){
            buffers[idx].append(s.charAt(i));
            //如果在第一行, 往下走
            if(idx == 0){
                step = 1;
            }
            //如果在最后一行, 往上走
            if(idx == numRows - 1){
                step = -1;
            }
            idx += step;
            //idx = idx + step;
        }
        String res = "";
        for(int i = 0; i < buffers.length; i++){
            res += buffers[i];
        }
        return res;
    }
}
