public class printDigit {
    static void PrintDigit(int num) {
        if (num == 0)
            return;
        System.out.println(num);
        PrintDigit(num - 1);
    }

    public static void main(String[] args) {
        PrintDigit(5);
    }

}