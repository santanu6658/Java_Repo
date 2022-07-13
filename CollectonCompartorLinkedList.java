import java.util.*;


public class CollectonCompartorLinkedList {
    public static void main(String []args){
        List <Integer>value=new ArrayList<>();
        value.add(289);
        value.add(324);
        value.add(45);
        value.add(41);
        value.add(48);
        List<Integer>value1=new ArrayList<>();
        //Collections.sort(value);
       // Collections.reverse(value);


        //***********using anonymous class***************
//        Comparator<Integer> com=new Comparator<Integer>(){
//            public  int compare(Integer o1,Integer o2){
//                if(o1%10>o2){
//                    return 1;
//                }
//                return -1;
//            }
//        };


        //*************using lambda expression*************
//        Comparator <Integer>com=(o1,  o2) ->{
////                if(o1%10>o2%10)
////                    return 1;
////                return -1;
//            return  o1%10>o2%10?1:-1;
//
//
//
//        };
        //*****************using another file of java
        Comparator<Integer> com=new ComImpl();

        Collections.sort(value,com)   ;

//        Iterator i= value.iterator();
//        while(i.hasNext())         {
//            System.out.println(i.next());
//        }
        for(Object i:value){
            System.out.println(i);
        }
    }
}
