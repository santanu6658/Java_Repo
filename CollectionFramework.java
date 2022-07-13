import java.util.*;
import java.util.ArrayList;

public class CollectionFramework{
    public static  void main(String args[]){
        Collection < Integer>value= new ArrayList<Integer>();

        value.add(4);
        value.add( 5);
        value.remove(5);
       // Iterator i= value.iterator();//fetch the value of collection
        //System.out.println(i.next());
        //System.out.println(i.hasNext());
//while(i.hasNext()){
//    System.out.println(i.next());}


    for(Object i:value){// using for each value
        System.out.println(i);

}
       // value.add("san"); show error
//        List number= new ArrayList );
//        number.add(5);
//        number.add("santanu");
//        System.out.println(value);
//        System.out.println(number);

    }
}
