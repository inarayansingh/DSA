import java.util.ArrayList;

public class array_list {
    public static void main(String args[]){
        ArrayList<Integer> arr =new ArrayList<>(3);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);

        arr.set(0,90);
        arr.set(1,70);
        
        arr.get(1);
        arr.get(2);

        arr.add(90);



    }
}
