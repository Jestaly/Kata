package DSA.DSA16;

import java.util.*;

public class Main {
    // COMPLETED
    public static void main(String args[]) {
        LinkedList<Integer> lList = new LinkedList<Integer>();

        lList.add(2);
        lList.add(4);
        lList.add(6);

        Iterator<Integer> p = lList.listIterator();

        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
