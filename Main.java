import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> hash = new HashMap<>();
    hash.put(1, "Coffee");
    hash.put(2, "Tea");
    hash.put(3, "Soda");
    hash.put(4, "Soda");
    hash.replace(3, "Soda","Water");
    System.out.println(hash.values());
    
  }
}