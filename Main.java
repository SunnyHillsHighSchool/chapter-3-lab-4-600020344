class Main {
  public static void main(String[] args) {
      //add test cases
      PQTester pqt = new PQTester("one two three four five six seven");  
      System.out.println(pqt);
      pqt.setPQ("1 2 3 4 5 one two three four five");
      System.out.println(pqt);
      pqt.setPQ("a p h j e f m c i d k l g n o b");
      System.out.println(pqt);
  }
}
