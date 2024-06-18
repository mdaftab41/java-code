class Main {
    public static void main(String[] args) {
     
      // create an array
      int[] age = {12, 4, 5, 2, 5};
   
      // access each array elements
      System.out.println("Accessing Elements of Array:");
      System.out.println("First Element: " + age[0]);
      System.out.println("Second Element: " + age[1]);
      System.out.println("Third Element: " + age[2]);
      System.out.println("Fourth Element: " + age[3]);
      System.out.println("Fifth Element: " + age[4]);
      System.out.println("Array using loop");

      int[] age1 = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for Loop:");
   for(int i = 0; i < age1.length; i++) {
     System.out.println(age1[i]);
   }
   // program to find the sum of array element 
   System.out.println("program to find sum osf array element");

   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;
   
   // access all elements using for each loop
   // add each element in sum
   for (int number: numbers) {
     sum += number;
   }
  
   // get the total number of elements
   int arrayLength = numbers.length;

   // calculate the average
   // convert the average from int to double
   average =  ((double)sum / (double)arrayLength);

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);
    }
   }