package sorting.basic.selection.sort.comparable;

/**
 * @ProjectName: algorithm
 * @Package: sorting.basic.selection.sort.comparable
 * @Description: 可比较的学生类
 * @Author: fanxx
 * @CreateDate: 2018/12/11 10:33
 * <p>Copyright: Copyright (c) 2018</p>
 */
public class Student implements Comparable<Student>{

    private String name;

    private int score;

    //构造函数
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    // 定义Student的compareTo函数
    // 如果分数相等，则按照名字的字母序排序
    // 如果分数不等，则分数高的靠前
    @Override
    public int compareTo(Student that) {

        if(this.score < that.score){
            return -1;
        }else if(this.score > that.score){
            return 1;
        }else{ //分数相等的情况
            return this.name.compareTo(that.name);
        }
    }

    //定义Student实例的打印输出方式
    @Override
    public String toString(){
        return "Student: " + this.name + " " + Integer.toString(this.score);
    }
}
