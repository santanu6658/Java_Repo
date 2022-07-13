import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Collection2Vector {
    public static void main(String [] args){
        ArrayList v=new ArrayList();
      //  Vector<Integer> v=new Vector<>();
        v.add(54);
        v.add(48);
        v.add(488);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        ArrayList v1= new ArrayList();
        v1.add(32);
        v1.add(32);
        v1.add(32);
        v1.add(32);
        v1.addAll(0,v);
      //  Collections.sort(v);
      //  System.out.println(v.capacity()); //v.capacity();
        for(Object i:v1){
            System.out.println(i);
        }
    }
}
