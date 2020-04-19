import java.util.Hashtable;

public class Student {

    public static void main(String[] args) {
        //Creating New Hash Table
        Hashtable <Integer, String > hash_table = new Hashtable<Integer, String>();

        //Mapping string values into int keys
        hash_table.put(10, "Katie");
        hash_table.put(20, "Joshua");
        hash_table.put(30, "Weezy");
        hash_table.put(40, "Isiah");

        //Displaying Hash Table
        System.out.println("Initial Table: " + hash_table);

        //Checking for a value
        System.out.println("Is the value 'Katie' present?? : " + hash_table.contains("Katie"));
        System.out.println("Is the value 'Jade' present?? : " + hash_table.contains("Jade"));
    }

}
