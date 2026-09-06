public class constructor {
   public static class car{
        String name;
        int price;
        car(String name ,int price){
        this.name=name;
        this.price=price;
    }

    }
    public static void main(String args[]){
        car s1= new car("kia",13);
       
        System.out.println(s1.name);
        System.out.println(s1.price);

        car s2=new car("fortuner", 500);

         System.out.println(s2.name);
        System.out.println(s2.price);

    }
}
