import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Цель -- заказ билета
    System.out.println(" ========== ЗАКАЗ БИЛЕТА В АЭРОПОРТУ \"BERLIN\" ============");
    System.out.println();
    System.out.println();

    List<String> lines = new ArrayList<>();
    lines.add("LONDON");
    lines.add("PARIS");
    lines.add("NEW YORK");
    lines.add("TOKYO");
    lines.add("DUBAI");
    lines.add("MUNICH");
    lines.add("CHINA");
    lines.add("INDONESIA");
    lines.add("INDIA");

    System.out.println(lines);
    System.out.println(" ");
    lines.add("BERLIN");
    System.out.println(lines);
    System.out.println();
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  }
}