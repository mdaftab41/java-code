 

public class basic {
   public  static void main( String[] args)
    { 
       
        int [] array ={1,2,3,4,4,5,6,6,7,7,8};
        System.out.println("Array using forEach Loop");
        for(int i :array)
     {
        System.out.println(array[i]);
       }
  System.out.println("Array using for loop");
       for(int i=0 ; i<array.length; i++){
        System.out.println(array[i]);
       }
     }
}

