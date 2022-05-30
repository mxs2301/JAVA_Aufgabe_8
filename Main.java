import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        String Weekdays[] = {
                "Montag",
                "Dienstag",
                "Mittwoch",
                "Donnerstag",
                "Freitag",
                "Samstag",
                "Sonntag"
        };

        LinkedList<String> li = new LinkedList<>();
        TreeSet<String> bb = new TreeSet<>();
        HashSet<String> ht = new HashSet<>();


        for (int i = 0; i < Weekdays.length; i++)
            li.add(Weekdays[i]);

        for (int i = 0; i < Weekdays.length; i++) {
            bb.add(li.get(i));
            ht.add(li.get(i));
        }

        for (String i : li) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (String i : bb) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (String i : ht) {
            System.out.print(i + " ");
        }

        System.out.println();

        Iterator<String> it = li.iterator();
        Iterator<String> bi = bb.iterator();
        Iterator<String> th = ht.iterator();

        int i = 1;
        while(it.hasNext()){
            if(i%2 == 0)
                System.out.print(it.next()+" ");
        }


    }
}
