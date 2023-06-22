public class Passenger {

  private String name;
  private int ticket;

  public String getName() {
    return name;
  }

  public int getTicket() {
    return ticket;
  }

  public Passenger(String name, int ticket) {
    this.name = name;
    this.ticket = ticket;

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTicket(int ticket) {
    this.ticket = ticket;
  }

  @Override
  public String toString() {
    return name + "(ticket: " + ticket + ")";

  }

  public static Passenger parseFrom(String line, char sep) {
    int sepIndex = line.indexOf(sep);
    String n = line.substring(0, sepIndex);
    String ticketStr = line.substring(sepIndex + 1);
    int ticket = Integer.parseInt(ticketStr);
    return new Passenger(n, ticket);
  }

}





