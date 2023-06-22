import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

}
