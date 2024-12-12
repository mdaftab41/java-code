public class immtable {
   public static void  main(String[] args) {
    String str = "AftabAlam";
    System.out.println(str);
    str= "Prashant Malik";
    System.out.println(str);
    char arr[]= str.toCharArray();// toString is use to change into string
    str=arr.toString();
    str= new String(arr);
    // for loop use karlo print karne ke liye
    System.out.println(str);
   }
}
