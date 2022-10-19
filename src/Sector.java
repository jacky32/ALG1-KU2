public class Sector {
  private int standingPlaces;
  private int seatingPlaces;
  private String nameOfSector;
  private String colorOfSector;

  public Sector(String name, int standingPlaces, int seatingPlaces, String colorOfSector) {
    this.nameOfSector = name;
    this.standingPlaces = standingPlaces;
    this.seatingPlaces = seatingPlaces;
    this.colorOfSector = colorOfSector;
  }

  public int getStandingPlaces() {
    return this.standingPlaces;
  }

  public int getSeatingPlaces() {
    return this.seatingPlaces;
  }

  public String getColor() {
    return this.colorOfSector;
  }

  public void printInfo() {
    System.out.println(this.colorOfSector + " sector " + this.nameOfSector + " has " + this.seatingPlaces + " places to sit and " + this.standingPlaces + " places to stand.");
  }
}
