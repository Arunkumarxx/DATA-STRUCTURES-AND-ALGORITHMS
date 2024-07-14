package HASHING;

public class DirectAddressTable {
    static void search(boolean [] arr,int key) {
        if(key < arr.length && arr[key]==true )
            System.out.println("Yes Element Found");
        else System.out.println("Not Found");
    }
    static void insert(boolean [] arr,int key) {
        if(key <arr.length && arr[key]==true)
            System.out.println("Replaced New Value");
        else System.out.println("Inserted Element "+key);
    }
    static void delete ( boolean [] arr ,int key) {
        if(key < arr.length)
            System.out.println();
    }
    public static void main(String[] args) {
        int max=999;
        boolean [] values = new boolean[999];
         search(values,23);  // search O(1)
            // insert O(1)
        // delete O(1)

    }
}
