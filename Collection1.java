import java.util.*;

public class Collection1 {
    public static void main(String args[]){
       // Collection value=new ArrayList();
     //  Collection <Integer> value=new ArrayList();
       List  <Integer> value=new ArrayList<>();//for indexing
        value.add(5);
        value.add(53);
        value.add(45);
        value.add(434);
        value.add(2,345);
        Collections.sort(value);
        Iterator i= value.iterator();



        while (i.hasNext()) {
            System.out.println(i.next());
        }
       // value.remove(434);
      //  value.add("santanu");
       // Iterator i= value.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
     //   List<Integer> value1=new ArrayList<>();
//        for( int i:value){
//            System.out.println( i);
//        }



    }
}
