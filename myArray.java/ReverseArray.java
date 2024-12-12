

public class ReverseArray {
    public static void reverse(int a[] , int n){
        int i, k, t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
        System.out.println("Array After Reverse");
        for (k = 0; k < n; k++) { 
            System.out.println(a[k]); 
        }
        
    }
   public static void main(String[] args){
     int arr [] = {3,4,2,5,6,7,0,9};
     int k;
     System.out.println("Array before Reverse");
     for (k = 0; k < arr.length; k++) { 
        System.out.println(arr[k]); 
    }
     reverse(arr, arr.length); 
   }
}
