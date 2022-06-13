package course;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {
    public static void main(String[] args) {

        //  Set<String> set = new HashSet<>(); //if the order does not matter hashset is your guy :-)
        // Set<String> set = new TreeSet<>(); // the treeSet comes with the order.
        Set<String> set = new LinkedHashSet<>(); // it comes in the order that is was putted. Egal was.

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf((x -> x.charAt(1) == 'o'));

        for (String p : set) {
            System.out.println(p);
        }

    }
}
