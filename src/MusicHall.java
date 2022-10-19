import java.util.HashSet;

public class MusicHall {
  private HashSet<Sector> sectors = new HashSet<Sector>();
  public MusicHall(Sector s1, Sector s2, Sector s3, Sector s4, Sector s5, Sector s6, Sector s7) {
    this.sectors.add(s1);
    this.sectors.add(s2);
    this.sectors.add(s3);
    this.sectors.add(s4);
    this.sectors.add(s5);
    this.sectors.add(s6);
    this.sectors.add(s7);
  }

  private int getSumOfSeatingPlaces() {
    int sum = 0;
    for (Sector sector : sectors) {
      sum += sector.getSeatingPlaces();
    }
    return sum;
  }

  private int getSumOfStandingPlaces() {
    int sum = 0;
    for (Sector sector : sectors) {
      sum += sector.getStandingPlaces();
    }
    return sum;
  }

  private int getSumOfSeatingPlaces(String onlyForColor) {
    int sum = 0;
    for (Sector sector : sectors) {
      if (sector.getColor().equals(onlyForColor)) {
        sum += sector.getSeatingPlaces();
      }
    }
    return sum;
  }

  private int getSumOfStandingPlaces(String onlyForColor) {
    int sum = 0;
    for (Sector sector : sectors) {
      if (sector.getColor().equals(onlyForColor)) {
        sum += sector.getStandingPlaces();
      }
    }
    return sum;
  }
}
