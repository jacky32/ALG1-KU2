import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Sector sector1 = new Sector("F1", 150, 0, "Blue");
    Sector sector2 = new Sector("L1", 50, 80, "Red");
    Sector sector3 = new Sector("L2", 50, 80, "Red");
    Sector sector4 = new Sector("L3", 20, 40, "Red");
    Sector sector5 = new Sector("U1", 35, 95, "Yellow");
    Sector sector6 = new Sector("U2", 35, 95, "Yellow");
    Sector sector7 = new Sector("U3", 60, 70, "Yellow");

    MusicHall musicHall = new MusicHall(sector1, sector2, sector3, sector4, sector5, sector6, sector7);

    runTests(sector1, sector2, sector3, sector4, sector5, sector6, sector7, musicHall);
  }

  private static void runTests(Sector s1, Sector s2, Sector s3, Sector s4, Sector s5, Sector s6, Sector s7, MusicHall musicHall) {
    ArrayList<Boolean> tests = new ArrayList<Boolean>();
    System.out.println("Sector tests:");
    tests.add(testSector(s1, 150, 0, "Blue"));
    tests.add(testSector(s2, 50, 80, "Red"));
    tests.add(testSector(s3, 50, 80, "Red"));
    tests.add(testSector(s4, 20, 40, "Red"));
    tests.add(testSector(s5, 35, 95, "Yellow"));
    tests.add(testSector(s6, 35, 95, "Yellow"));
    tests.add(testSector(s7, 60, 70, "Yellow"));
    System.out.println("Music hall tests:");
    tests.add(testMusicHall(musicHall));

    int totalFailed = 0;
    for (Boolean passed : tests) {
      if(!passed)  {
        totalFailed++;
      }
    }
    System.out.println( totalFailed == 0 ? "All tests passed." : totalFailed + " tests failed.");
  }

  private static boolean testMusicHall(MusicHall musicHall) {
    int numberOfCheckmarks = 0;
    musicHall.printInfo();
    if (musicHall.getSumOfStandingPlaces() == 400) {
      System.out.println("getSumOfStandingPlaces passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfStandingPlaces failed");
    }
    if (musicHall.getSumOfSeatingPlaces() == 460) {
      System.out.println("getSumOfSeatingPlaces passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfSeatingPlaces failed");
    }

    if (musicHall.getSumOfStandingPlaces("Blue") == 150) {
      System.out.println("getSumOfStandingPlaces for Blue color passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfStandingPlaces for Blue color failed");
    }

    if (musicHall.getSumOfSeatingPlaces("Blue") == 0) {
      System.out.println("getSumOfSeatingPlaces for Blue color passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfSeatingPlaces for Blue color failed");
    }

    if (musicHall.getSumOfStandingPlaces("Red") == 120) {
      System.out.println("getSumOfStandingPlaces for Red color passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfStandingPlaces for Red color failed");
    }

    if (musicHall.getSumOfSeatingPlaces("Red") == 200) {
      System.out.println("getSumOfSeatingPlaces for Red color passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfSeatingPlaces for Red color failed");
    }

    if (musicHall.getSumOfStandingPlaces("Yellow") == 130) {
      System.out.println("getSumOfStandingPlaces for Yellow color passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfStandingPlaces for Yellow color failed");
    }

    if (musicHall.getSumOfSeatingPlaces("Yellow") == 260) {
      System.out.println("getSumOfSeatingPlaces for Yellow color passed");
      numberOfCheckmarks++;
    } else {
      System.out.println("getSumOfSeatingPlaces for Yellow color failed");
    }
    return(numberOfCheckmarks == 8);
  }

  private static boolean testSector(Sector sector, int expectedStandingPlaces, int expectedSeatingPlaces, String expectedColor) {
    int numberOfCheckmarks = 0;
    if (sector.getStandingPlaces() == expectedStandingPlaces) {
      numberOfCheckmarks++;
    }
    if (sector.getSeatingPlaces() == expectedSeatingPlaces) {
      numberOfCheckmarks++;
    }
    if (sector.getColor().equals(expectedColor)) {
      numberOfCheckmarks++;
    }
    sector.printInfo();
    System.out.println(numberOfCheckmarks == 3 ? "passed" : "failed");
    return(numberOfCheckmarks == 3);
  }
}