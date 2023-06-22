import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static <Passenger> void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Цель -- заказ билета
    System.out.println(" ==========  АЭРОПОРТ \"BERLIN\" ============");

    System.out.println();
    System.out.println("    ДОБРО ПОЖАЛОВАТЬ!  ");
    System.out.println("    WILLKOMMEN ZURÜCK! ");
    System.out.println("       BIENVENIDO!     ");
    System.out.println("       ACCUEILLIR!     ");
    System.out.println("         WELCOME!        ");

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

// 3 Размер - выбор между маленьким и большим багажом
    System.out.println("Выберите размер: ");
    System.out.println("М - маленький багаж");
    System.out.println("Б - большой багаж");
    String size = br.readLine().toUpperCase();
    boolean small; // true - маленький, false - большой
    if (size.equals("М")) {
      small = true;
    } else if (size.equals("Б")) {
      small = false; // если не маленький, то большой багаж
    } else {
      System.out.println("Мы пока не перевозим багаж такого размера.");
      System.out.println("Приходите ещё, " + name + "!");
      return;
    }
    System.out.println("Как вы желаете оплатить?");
    System.out.println();
    // 4. Способ оплаты - выбор между наличными и картой
    System.out.println("Выберите способ оплаты:");
    System.out.println("1 - наличными");
    System.out.println("2 - картой");
    String payment = br.readLine();
    boolean byCard;
    if (payment.equals("1")) {
      byCard = false;
    } else if (payment.equals("2")) {
      byCard = true;
    } else {
      System.out.println("Выбран некорректный способ оплаты");
      return;
    }

    System.out.println("Спасибо за покупку, " + name + "!");
    System.out.println("Ваш билет :" + "№13");
    System.out.println("Ваш паспорт :" + passport);

    if (small) {
      System.out.println("Размер багажа: Маленький ");
    } else {
      System.out.println("Размер багажа: Большой ");
    }
    if (byCard) {
      System.out.println("Заказ будет оплачен картой");
    } else {
      System.out.println("Приготовьте, пожалуйста, наличные!");
      return;
    }

    System.out.println("Спасибо за заказ ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("                          КАССА № 2  ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println(" Группа из 5 человек, ожидают регистрацию:");
    System.out.println(" Выводим количество пассажиров в очереди на экран :");

    /**
     * Queue очередь- первый пришёл, первый ушёл
     * poll()- возвращает элемент
     */
    PriorityQueue<Integer> numbersPQ = new PriorityQueue<>();
    numbersPQ.add(5);
    numbersPQ.add(2);
    numbersPQ.add(4);
    numbersPQ.add(1);
    numbersPQ.add(3);
    System.out.println(numbersPQ.poll());
    System.out.println(numbersPQ.poll());
    System.out.println(numbersPQ.poll());
    System.out.println(numbersPQ.poll());
    System.out.println(numbersPQ.poll());
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    System.out.println("                           КАССА № 3   ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    Scanner scanner = new Scanner(System.in);

    HashMap<String, String> passanger = new HashMap<>();
    PassengerList pas = new PassengerList();
    /**
     * Печатаем меню  цикл do- while для printMenuAirport()
     */
    do {
      Airport.printMenuAirport();
      try {
        int buttonPaassenger = scanner.nextInt();
        //добавить команду
        switch (buttonPaassenger) {
          case 1 -> {

            Airport.addPassenger(passanger);
          } // перебирает имя пассажира
          case 2 -> {

            Airport.printPassengerNumber(passanger);
          }
          case 3 -> {
            // печатаем номер билета по имени
            String ticket = Airport.searchTicket(passanger);
            if (!passanger.equals(null)) {
              System.out.println("Ticket: " + ticket);
            } else {
              System.out.println("Такого пассажира нет.");
            }
          }
          case 4 -> {
            // запись в файл
            pas.writePassenger();
            System.out.println("res/out.txt");
          } //удалить выбранное имя пассажира
          case 5 -> {
            if (Airport.deletePassenger(passanger)) { // если метод вернул true
              System.out.println("Сортровать пассажира.");
            } else {
              System.out.println("Такого пассажира нет.");
            }

          } //сортировать пассажиров
          case 6 -> {
            pas.sortPassenger();
            System.out.println();

          } // чтение из файла
          case 7 -> {
            pas.writePassenger();
            System.out.println("res/input.txt");
          }
          case 8 -> {
            // Выход
            return;
          }
          default -> {
            System.out.println("Неверный ввод, попробуйте ещё раз.");
          }
        } // конец оператора switch
      } catch (InputMismatchException e) { // проверка на некорректный ввод
        System.out.println("Неверный ввод попробуйте ещё раз.");
        scanner.next();
      }

    } while (true); // конец цикла while
  }
}








