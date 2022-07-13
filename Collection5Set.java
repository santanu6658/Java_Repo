import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection5Set {
    public static void main(String []args) {
     //   Set a = new HashSet();//gives the value in random order
        Set <Integer> a=new TreeSet<>();//Give the value in ascending order

        System.out.println(a.add(45));
        System.out.println(a.add(14));
        System.out.println(a.add(16));
        System.out.println(a.add(4));
        System.out.println(a.add(4));
        for(Object i:a){
            System.out.println(i);
        }
    }
}
