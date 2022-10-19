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
}
