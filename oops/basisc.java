public class basisc{
    public static class student{
        String name;
         int rolln;
        double percent;
    }
    public static void main(String[] args) {
        
        student s1=new student();

        s1.name="Narayan Singh";
        s1.rolln=21;
        s1.percent=99.9;

        System.out.println(s1.name);
        System.out.println(s1.rolln);
        System.out.println(s1.percent);

        student s2=new student();

        s2.name="kishan singh";
        s2.rolln=01;
        s2.percent=99.9;

         System.out.println(s2.name);
        System.out.println(s2.rolln);
        System.out.println(s2.percent);


    }
}