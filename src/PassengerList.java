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

}
