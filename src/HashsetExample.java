import java.util.HashSet;

public class HashsetExample {

   public static void main(String[] args){

       HashSet<String> set = new HashSet<>();

       set.add("apple");
       set.add("mango");
       set.add("banana");   /*  adding elements to the hashset  */



        set.add("apple") ;    /*  adding duplicate elements to the hashset  */

       System.out.println("Displaying the hashset"+ set);

       /*  check if specific elements in the set */
       System.out.println("Contains Banana"+ set.contains("banana"));


       /*  remove an element */
       set.remove("mango");

       /*  After removing set is  */
       System.out.println("after removing mango set is"+set);

       /*Size of the hashset    */
       System.out.println("Size of the hashset is "+ set.size());
   }

}
