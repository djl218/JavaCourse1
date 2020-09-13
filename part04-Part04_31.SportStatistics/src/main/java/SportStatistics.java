
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                
                if (home.equals(team) || away.equals(team)) {
                    gameCount++;
                }
                if (home.equals(team) && (homeScore > awayScore)) {
                    winCount++;
                }
                if (home.equals(team) && (homeScore < awayScore)) {
                    lossCount++;
                }
                if (away.equals(team) && (awayScore > homeScore)) {
                    winCount++;
                }
                if (away.equals(team) && (awayScore < homeScore)) {
                    lossCount++;
                }
            }
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + winCount);
            System.out.println("Losses: " + lossCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
