import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerList {

  private final List<Passenger> passengers = new ArrayList<>();
  private File file;
  private char sep;


  public PassengerList() {

  }

  /**
   * Запись пассажиров в файл
   *
   * @throws IOException Возможно исключение при записывании файла.
   */

  public void writePassenger() throws IOException {
    File output = new File("res/out.txt");
    FileWriter outputFileWriter = new FileWriter(output);
    for (Passenger passenger : passengers) {
      outputFileWriter.write(passenger + "\n");
    }
    outputFileWriter.close();
  }

  /**
   * Чтение из файла
   *
   * @return result, закрываем файл inputReader.close();
   * @throws IOException, Возможно исключение при чтении из файла
   */
  public List<Passenger> readFile() throws IOException {
    File input = new File("res/input.txt");
    FileReader inputReader = new FileReader(input);
    List<Passenger> result = new ArrayList<>();
    if (!file.exists() || !file.canRead()) {
      return result;
    }
    Scanner scanner = new Scanner(file);
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      Passenger passenger = Passenger.parseFrom(line, sep);
      result.add(passenger);

    }
    scanner.close();
    inputReader.close();
    return result;

  }

  /**
   * Сортируем пассажиров Фильтруем и устанавливаем лимит ограничений
   */
  public void sortPassenger() {
    Scanner scanner = new Scanner(System.in);
    List<Passenger> passeng = makePassenger();
    System.out.println("Введите минимальный билет:");
    int price = scanner.nextInt();
    scanner.nextLine();

    passeng.stream()
        .filter(s -> s.getTicket() >= price)
        .sorted((s1, s2) -> -Integer.compare(s1.getTicket(), s2.getTicket()))
        .limit(5)
        .forEach(System.out::println);

  }

  public static List<Passenger> makePassenger() {
    List<Passenger> effect = new ArrayList<>();
    effect.add(new Passenger("Роша Генадий А.", 99));
    effect.add(new Passenger("Гоша Леонид А.", 89));
    effect.add(new Passenger("Броша Василий А.", 75));
    effect.add(new Passenger("Зоша Андрей А.", 70));
    effect.add(new Passenger("Лоша Мухамед А.", 59));
    effect.add(new Passenger("Шоша Сергей А.", 65));
    effect.add(new Passenger("Фоша Олег А.", 78));
    effect.add(new Passenger("Тоша Никита А.", 85));
    effect.add(new Passenger("Тоша Николай А.", 22));
    effect.add(new Passenger("Тоша Пупкин А.", 18));
    effect.add(new Passenger("Тоша Владимир А.", 15));
    effect.add(new Passenger("Тоша Михаил А.", 10));
    effect.add(new Passenger("Тоша Борис А.", 8));
    effect.add(new Passenger("Тоша Генадий А.", 3));
    return effect;
  }
}


