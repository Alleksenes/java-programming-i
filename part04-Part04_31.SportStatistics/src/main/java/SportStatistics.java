 
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int count = 0, wins = 0, losses = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        ArrayList<Teams> records = readRecordsFromFile(file);

        System.out.println("Team: ");
        String teamName = scan.nextLine();

        for (Teams team : records) {
            if (team.getHomeTeam().contains(teamName)) {
                count++;
                if (team.getHomeScore() > team.getAwayScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }

                team.playGame();
                } else if (team.getAwayTeam().contains(teamName)) {
                    count++;
                    if (team.getAwayScore() > team.getHomeScore()) {
                        wins++;
                        team.setWins();
                    } else {
                        losses++;
                        team.setLosses();
                    }

                    team.playGame();
                }
            }
                System.out.println("Games: " + count);
                System.out.println("Wins: " + wins);
                System.out.println("Losses: " + losses);
                System.out.println("Total: " + (wins + losses));
                System.out.println("Average: " + (wins + losses) / count);
                        
    }
    public static ArrayList<Teams> readRecordsFromFile(String file) {
        ArrayList<Teams> teams = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                teams.add(new Teams(homeTeam, awayTeam, homeScore, awayScore));

            }
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());        
        }     
        return teams;
        
    }
        

}