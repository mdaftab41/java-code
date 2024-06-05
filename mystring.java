public class mystring {
  public static void main(String[] args) {
      String name1 = "Alam";
      String name2 = "Aftab";
      String name3 = name1+name2;
      System.out.println(name1);
      System.out.println(name2);
      System.out.println(name3);
      System.out.println(name3.length());
      System.out.println(name2.charAt(1));
      System.out.println(name3.charAt(1));// string name3 have only reference
      String name4 = name3.replace('A','z');
      System.out.println(name3);
      System.out.println(name4);

  }
}
