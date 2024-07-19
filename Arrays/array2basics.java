package DSAwithJAVA.Arrays;
import java.util.Arrays;

class Student{
    void Student_name(){
        String name[]={"betu","chhotu","lalla"};
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
    void Student_marks(){
        int marks[]={88,77,66,55,68,98,56,87,87};
        int x=56;
        int ans=-1;
        for(int i=0;i<marks.length;i++){
            if(marks[i]==x) {
                ans = i;
            }
        }
        System.out.println(x+" is present at index "+ans);
    }
}
class Teacher{
    void teachers_name(){
        String name[]={"aman","akash","ashish","abhishek"};
        for(int i=0;i<name.length;i++){
            String n=name[i];
            System.out.println(n);
        }

    }
}
public class array2basics {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.Student_marks();
        st1.Student_name();
        Teacher t1=new Teacher();
        t1.teachers_name();
    }
}
