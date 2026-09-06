import passingclasstofun.student;
public class passingclasstofun {
//     public static class Student{
//             String name;
//             int rolln;
//             double percent;
//  }

       public static void change(Student s){
                s.name="kishan";
                return;

            }
    public static void main(String[] args) {
       
        Student s1=new Student();
        s1.name="Narayan Singh";
        s1.rolln=01;
        s1.percent=99.9;

      System.out.println(s1.name);
      change(s1);
      System.out.println(s1.name);

    }
     
   
}
