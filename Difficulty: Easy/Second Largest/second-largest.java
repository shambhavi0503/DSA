//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr ) {
        if(arr.length<2){
            return -1;
        }
       int n=arr.length;
       int largest=arr[0];
       int secondlargest=-1;
       
       for(int i=1;i<n;i++){
          if (arr[i]>largest){
              secondlargest=largest;
              largest=arr[i];
          }
        else if(arr[i]<largest && arr[i]>secondlargest){
            secondlargest=arr[i];
        }   
       }
        return secondlargest;
    }
}


