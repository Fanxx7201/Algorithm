package sorting.ali;

import java.io.*;
import java.util.*;

/**
 * @ProjectName: yunlian-traffic
 * @Package: com.sinochem.yunlian.yunliantraffic.util
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/1/23 14:20
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class FileUtil {


    /**
     * 读入TXT文件
     */
    public Queue<String> readFile(String pathName) {
        CollatorComparator comparator = new CollatorComparator();
        TreeMap map = new TreeMap(comparator);

        try {
            InputStream stream = getClass()
                    .getClassLoader()
                    .getResourceAsStream(pathName);

            BufferedReader read = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            String line;
            while ((line = read.readLine()) != null) {
                // 一次读入一行数据
                map.put(line, line);
            }
            Collection col = map.values();
            Iterator it = col.iterator();
            Queue<String> queue = new LinkedList<String>();
            while (it.hasNext()) {
                queue.offer(it.next().toString());
            }
            ;

            return queue;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 写入TXT文件
     */
    public void writeFile(String pathName, String name, String id) {
        try {
            File writeName = new File(pathName); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            FileOutputStream fos = new FileOutputStream(writeName, true);//创建文件输出流对象
            byte[] byts = (name + ";").getBytes();
            byte[] byts1 = (id + "\r\n").getBytes();
            fos.write(byts);
            fos.write(byts1);

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String pathName, String params) {
        try {
            File writeName = new File(pathName); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            FileOutputStream fos = new FileOutputStream(writeName, true);//创建文件输出流对象
            byte[] byts = (params).getBytes();

            fos.write(byts);

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        String a = "陈晓奥,350521199305080987,18659087715";
        String[] split = a.split(",");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
    }
}
