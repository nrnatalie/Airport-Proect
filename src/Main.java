import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
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
    System.out.println("                           КАССА № 1  ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("   ДОБРО ПОЖАЛОВАТЬ!  ");
    System.out.println("       WELCOME! ");

    // 1. Заказ билета на кассе
    System.out.println("Добрый день, желаю срочно забронировать билет:");
    System.out.println();
    System.out.println("Вы хотите заказать билет?:");
    System.out.println("Как вас зовут?");
    String name = br.readLine();

    // 2 Узнаём город куда отправляется пассажир
    System.out.println("Куда летим?");
    String city = br.readLine();

    //     !Условие-стражник!
    if (city.equalsIgnoreCase("МЮНХЕН") || city.equalsIgnoreCase("München")) {
      System.out.println("Замечательно!");
    } else {
      System.out.println("К сожалению, в ваш город пока самолётов нет.");
      return;
    }
    // 2 Узнаём есть ли билет
    System.out.println("Вам повезло у нас есть для вас билет: ");
    System.out.println();

    System.out.println("Предоставьте пожалуйста ID паспорта:");
    String passport = br.readLine();

    }


  }

