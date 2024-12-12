public class PrintName {
    static void printName(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("Md Aftab alam");
        printName(num - 1);
        
    }

    public static void main(String[] args) {
        printName(5);

    }

}