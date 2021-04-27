class Main {
  public static void main(String[] args) {
      //add test cases
      PQTester pqt = new PQTester("one two three four five six seven");  
      System.out.println(pqt);
      pqt.setPQ("one two three four five 1 2 3 4 5");
      System.out.println(pqt);
      pqt.setPQ("a b c d e f g h i j k l m n o p");
      System.out.println(pqt);
  }
}
