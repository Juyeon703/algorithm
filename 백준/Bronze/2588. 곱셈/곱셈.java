import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    String b = br.readLine();
    System.out.println(a * Character.getNumericValue(b.charAt(2)));
    System.out.println(a * Character.getNumericValue(b.charAt(1)));
    System.out.println(a * Character.getNumericValue(b.charAt(0)));
    System.out.println(a * Integer.parseInt(b));
  }
}