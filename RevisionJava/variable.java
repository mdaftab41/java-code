package RevisionJava;

public class variable {
    public static void main(String[] args) {
        System.out.println( "Working on DataType");
        System.out.println(" Primitive Data type : int  , double , char , boolean ");
        int age = 25;
        double salary = 45000.50;
        char grade = 'A';
        boolean isActive = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Active: " + isActive);

        // Non-Primitive Data Types in Java
        // Non-primitive data types (also called reference data types) are not predefined by Java (unlike primitive data types) 
        // but are created by the programmer. They are used to store references (or memory addresses) to objects rather than actual values. 
        // These data types include classes, arrays, interfaces, and more.

        System.out.println("NonPrimitive Data Type : Array , String  , Enum , Class , Interface");
        System.out.println(" ");
        System.out.println("WorKing on Array");
        System.out.println(" ");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Array Length: " + numbers.length);
        System.out.println(" ");
        System.out.println("WorKing on String");
        String name = "Aftab";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());

      }
}
