import java.util.HashMap;
import java.util.Scanner;

public class Airport {

  /**
   * Вывод меню на экран
   */
  public static void printMenuAirport() {
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Ожидание регистрации:");
    System.out.println("1 - Добавить:");
    System.out.println("2 - Вывести на экран:");
    System.out.println("3 - Поиск пассажира:");
    System.out.println("4 - Запись в файл:");
    System.out.println("5 - Удалить пассажира:");
    System.out.println("6 - Сортировать пассажира:");
    System.out.println("7 - Выход:");
    System.out.println("Введите команду: ");
  }

  /**
   * Mетод добавляет контакт пассажира
   *
   * @param contacts список пассажиров - имя и паспорт
   * @return contacts
   */

  public static HashMap<String, String> addPassenger(HashMap<String, String> contacts) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ваше имя? ");
    String name = scanner.next();
    System.out.println("Ваш паспорт: ");
    String phone = scanner.next();
    contacts.put(name, phone);
    return contacts;
  }

  /**
   * Метод печатает все контакты пассажиров
   *
   * @param contacts Выводит на экран имя и паспорт пассажира, цикл for each перебирает по ключу и
   *                 печатает пассажиров
   */

  public static void printPassengerNumber(HashMap<String, String> contacts) {

    for (String name : contacts.keySet()) {
      System.out.println("Name: " + name + " | Passport: " + contacts.get(name));
    }
  }

  /**
   * Метод для поиска билета по имени
   *
   * @param contacts Перебираем список пассажиров по имени и паспорту и если имя нашлось
   * @return Возвращаем билет
   */
  // метод для поиска билета по имени
  public static String searchTicket(HashMap<String, String> contacts) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input name: ");
    String name = scanner.next();
    if (contacts.containsKey(name)) {
      return contacts.get(name);
    }
    return null;
  }

  /**
   * Метод для удаления пассажира по имени
   *
   * @param contacts Перебираем пассажиров,если имя нашлось, то удаляем пассажира
   * @return возвращаем true
   */

  public static boolean deletePassenger(HashMap<String, String> contacts) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input name: ");
    String name = scanner.next();
    if (contacts.containsKey(name)) {
      contacts.remove(name);
      return true;
    }
    return false;
  }
}


