package sorting.ali;

import java.io.*;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @ProjectName: algorithm
 * @Package: sorting.ali
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/10/16 15:10
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test4 {

    public static void main(String[] args) {
        //调用cutFile()函数 传人参数分别为 （原大文件，切割后存放的小文件的路径，切割规定的内存大小）
        cutFile("D:\\java\\cut\\ForrestGump.avi", "D:\\java\\cuts", 1024 * 1024 * 20);
        //读取每个小文件的内容. 遍历存到map中
        FileUtil FileUtil = new FileUtil();
        //读取各个小文件
        Queue<String> queue1 = FileUtil.readFile("小文件名");
        Queue<String> queue2 = FileUtil.readFile("小文件名2");
        Queue<String> queue3 = FileUtil.readFile("小文件名3");
        Queue<String> queue4 = FileUtil.readFile("小文件名4");
        Queue<String> queue5 = FileUtil.readFile("小文件名5");
        Queue<String> queue6 = FileUtil.readFile("小文件名6");
        Queue<String> queue7 = FileUtil.readFile("小文件名7");
        //将已经排好序的队列, 进行归并排序


    }

    private static void cutFile(String src, String endsrc, int num) {
        FileInputStream fis = null;
        File file = null;
        try {
            fis = new FileInputStream(src);
            file = new File(src);
            //创建规定大小的byte数组
            byte[] b = new byte[num];
            int len = 0;
            //name为以后的小文件命名做准备
            int name = 1;
            //遍历将大文件读入byte数组中，当byte数组读满后写入对应的小文件中
            while ((len = fis.read(b)) != -1) {
                //分别找到原大文件的文件名和文件类型，为下面的小文件命名做准备
                String name2 = file.getName();
                int lastIndexOf = name2.lastIndexOf(".");
                String substring = name2.substring(0, lastIndexOf);
                String substring2 = name2.substring(lastIndexOf, name2.length());
                FileOutputStream fos = new FileOutputStream(endsrc + "\\\\" + substring + "-" + name + substring2);
                //将byte数组写入对应的小文件中
                fos.write(b, 0, len);
                //结束资源
                fos.close();
                name++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    //结束资源
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
