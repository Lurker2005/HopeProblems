import java.util.*;
class student_data{
    long roll;
    String name;
    HashMap<String,Integer> marks=new HashMap<>();
    student_data(long roll, String name, HashMap<String, Integer> marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

class school{
    private static ArrayList<student_data> students=new ArrayList<>();

    private  static school sjit=new school();
    private school(){
        System.out.println("Singleton object created");
    }
    public static school getInstance(){
        return sjit;
    }
    public void addStudent(student_data s){
        students.add(s);
    }
    public ArrayList<student_data> getStudents(){
        return students;
    }
}
public class singelton_demo {
    public static void main(String[] args){
        school s1=school.getInstance();
        school s2=school.getInstance();
        System.out.println(s1==s2);
        s1.addStudent(new student_data(312423104044L,"amith",new HashMap<String,Integer>(){{put("maths",90);put("science",80);}}));
        for(student_data s:s2.getStudents()){
            System.out.println(s.name);
            System.out.println(s.marks);
            System.out.println(s.roll);

        }

    }
}

//MORE MODULAR
// import java.util.*;
// class student_data{
//     long roll;
//     String name;
//     HashMap<String,Integer> marks=new HashMap<>();
//     student_data(long roll, String name, HashMap<String, Integer> marks) {
//         this.roll = roll;
//         this.name = name;
//         this.marks = marks;
//     }
// }
// class mystudents{
//     public ArrayList<student_data> students=new ArrayList<>();
//     public void addStudent(student_data s){
//         students.add(s);
//     }
//     public ArrayList<student_data> getStudents(){
//         return students;
//     }
// }

// class school{
//     static mystudents students=new mystudents();

//     private  static school sjit=new school();
//     private school(){
//         System.out.println("Singleton object created");
//     }
//     public static school getInstance(){
//         return sjit;
//     }
//     public void addStudent(student_data s){
//         students.addStudent(s);
//     }
//     public ArrayList<student_data> getStudents(){
//         return students.getStudents();
//     }
// }
// public class singelton_demo {
//     public static void main(String[] args){
//         school s1=school.getInstance();
//         school s2=school.getInstance();
//         System.out.println(s1==s2);
//         s1.addStudent(new student_data(312423104044L,"amith",new HashMap<String,Integer>(){{put("maths",90);put("science",80);}}));
//         for(student_data s:s2.getStudents()){
//             System.out.println(s.name);
//             System.out.println(s.marks);
//             System.out.println(s.roll);

//         }

//     }
// }