package ARRAYS;
import java.util.ArrayList;
import java.util.Collections;
public class LeadersInAnArrayProblem {
    static void LeadersBruteForceApproach(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.print(arr[i] + " ");
        }
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        int currentElement = arr[n - 1];
        leaders.add(currentElement);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > currentElement && arr[i] != currentElement) {
                currentElement = arr[i];
                leaders.add(currentElement);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args) {
        int arr[] ={16,17,4,3,5,2};
        int n= arr.length;
        LeadersBruteForceApproach(arr,n);
       ArrayList<Integer> temp=  leaders(arr,n);
        System.out.println(temp);

    }
}