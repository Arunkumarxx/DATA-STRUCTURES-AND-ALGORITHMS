package HASHING;

public class DirectAddressTable {
    static void search(boolean [] arr,int key) {
        if(key < arr.length && arr[key]==true )
            System.out.println("Yes Element Found");
        else System.out.println("Not Found");
    }
    static void insert(boolean [] arr,int key) {
        if(key <arr.length )
            arr[key]=true;
        else System.out.println("");
    }
    static void delete ( boolean [] arr ,int key) {
        if(key < arr.length && arr[key]==true) {
            arr[key] = false;
            System.out.println("Deleted Element "+key);
        }
        else System.out.println("Element not Found");
    }
    public static void main(String[] args) {
        int max=999;
        boolean [] values = new boolean[999];
         search(values,23);  // search O(1)
          insert(values,23);   // insert O(1)
          delete( values,23);// delete O(1)

    }
}
