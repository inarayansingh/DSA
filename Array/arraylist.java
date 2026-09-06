import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.remove(1);
        arr.set(1,90);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
