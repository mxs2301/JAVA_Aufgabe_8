import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedList;
public class collection_stuff {


    public static void Aufgabe_1_2(){


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
        System.out.println();

        Iterator<String> it = li.iterator();
        Iterator<String> bi = bb.iterator();
        Iterator<String> th = ht.iterator();


        int i = 0;
        while(it.hasNext()){
            if(i%2==0){
                System.out.print(it.next()+ " ");
            }else{
                it.next();
            }
            i++;
        }

        System.out.println();

        i = 0;
        while(bi.hasNext()){
            if(i%2==0){
                System.out.print(bi.next() + " ");
            }
            else{
                bi.next();
            }
            i++;
        }

        System.out.println();

        i = 0;
        while(th.hasNext()){
            if(i%2==0){
                System.out.print(th.next()+" ");
            }else{
                th.next();
            }
            i++;
        }

        System.out.println();
        System.out.println();



    }





}
