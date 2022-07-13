import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection6Hash {
     public static void main(String [] args){
         Map<String,String> map=new HashMap<>();
         map.put("myName","santanu");
         map.put("actor","Hrithik");
         map.put("ceo","ratang");
         System.out.println(map);
         Set<String> keys=map.keySet();
         for(String key:keys){
             System.out.println(key+" "+map.get(key));
         }



     }
}
