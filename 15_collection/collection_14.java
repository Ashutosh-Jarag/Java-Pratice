import java.util.*;
public class collection_14 {
    public static void main(String args[]){
        ArrayList<String>a1= new ArrayList<>();
        a1.add("ab");
        a1.add("bc");
        a1.add("cd");
        System.out.println(a1);

        HashSet<String>hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        System.out.println(hs);

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println("Elements in the deque:");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }

      
    }
    
}
