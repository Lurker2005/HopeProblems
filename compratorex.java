import java.util.*;;
class Student {
    int rollno;
    String Name;

    Student(int rollno,String Name){
        this.rollno=rollno;
        this.Name=Name;
    }
    @Override
    public String toString(){
        return rollno+":"+Name;
    }
}
class sorts implements Comparator<Student> {
    public int compare(Student a,Student b) {
        return a.rollno-b.rollno;        
    }
    
}
public class compratorex {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student(112, "JAYA"));
        students.add(new Student(122, "JAA"));
        students.add(new Student(182, "JAYA"));
        students.add(new Student(102, "JAYA"));
        students.add(new Student(92, "JAYA"));


        Collections.sort(students,new sorts());
        for(Student student:students ){
            System.out.println(student);
        }


    }
    
}
