package maps;
import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Sharanya");
        ht.put(117, "Shreyas");
        ht.put(128, "Sonika");
        ht.put(100, "Siri");
        ht.put(99, "Sunil");
        ht.put(101, "Prashanth");
        System.out.println(ht.getOrDefault(101, "Not Found"));
        System.out.println(ht.getOrDefault(200, "Not Found"));
        ht.putIfAbsent(104, "Gaurav");
        System.out.println("Updated Table:" + ht);
        ht.putIfAbsent(99, "Ram");
        System.out.println("Updated Table:" + ht);




    }
}
