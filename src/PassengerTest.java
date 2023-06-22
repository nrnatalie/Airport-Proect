
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PassengerTest {

  private static final String NAME = "Test";
  private static final int TICKET = 50;
  private static final char SEP = ';';

  //arrange
  @Test
  public void testPassenger() {
    //arrange
    Passenger passenger = new Passenger(NAME, TICKET);

    // assert
    assertEquals(NAME, passenger.getName());
    assertEquals(TICKET, passenger.getTicket());

    // arrange
    String newName = "Test2";

    //act
    passenger.setName(newName);

    //assert
    assertEquals(newName, passenger.getName());

  }

  @Test
  public void testparseFrom() {
    // arrange
    String start = NAME + SEP + TICKET;

    //act
    Passenger actual = Passenger.parseFrom(start, SEP);

    //assert
    assertEquals(NAME, actual.getName());
    assertEquals(TICKET, actual.getTicket());
  }

}


