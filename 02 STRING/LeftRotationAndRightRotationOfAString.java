package STRING;

class LeftRotationAndRightRotationOfAString {
    static void LeftRotation(String str,int d) {
        if (str.length()<d)
            return;
        char arr[] = str.toCharArray();
        int n= arr.length;
        //left rotation
        swap(arr,0, n-1);
        swap(arr,n-d,n-1);
        swap(arr,0,n-d-1);
        System.out.print("left Rotation :");
        print(arr);
    }
    static void rightRotation( String str,int d) {
        char [] arr = str.toCharArray();
        int n= arr.length;
        System.out.print("Right Rotation :");
        swap(arr,0,n-1);
        swap(arr,0,d-1);
        swap(arr,d,n-1);
        print(arr);
    }
    static void swap(char[] arr,int x,int  y) {
        while (x<=y) {
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x++;
            y--;
        }
    }
    static void print(char[] arr) {
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        String str ="GeeksforGeeks";
        int d=2;
        LeftRotation(str,d);
        System.out.println();
        rightRotation(str,d);
    }
}