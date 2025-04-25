
import java.util.List;
import java.util.stream.Stream;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.Objects;

 class Match {
    private String matchCode;
    private String matchTitle;
    private String coordinator;
    private LocalDate matchDate;
    private String venue;

    public Match() {}

    public Match(String matchCode, String matchTitle, String coordinator, LocalDate matchDate, String venue) {
        this.matchCode = matchCode;
        this.matchTitle = matchTitle;
        this.coordinator = coordinator;
        this.matchDate = matchDate;
        this.venue = venue;
    }

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    public String getMatchTitle() {
        return matchTitle;
    }

    public void setMatchTitle(String matchTitle) {
        this.matchTitle = matchTitle;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match)) return false;
        Match match = (Match) o;
        return Objects.equals(matchCode, match.matchCode) &&
                Objects.equals(matchTitle, match.matchTitle) &&
                Objects.equals(coordinator, match.coordinator) &&
                Objects.equals(matchDate, match.matchDate) &&
                Objects.equals(venue, match.venue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchCode, matchTitle, coordinator, matchDate, venue);
    }

    @Override
    public String toString() {
        return matchCode + " | " + matchTitle + " | " + coordinator + " | " + matchDate + " | " + venue;
    }
}


 class MatchUtility {

    public Stream<Match> getMatchesByCoordinator(List<Match> matchList, String coordinator) {
        return matchList.stream()
                        .filter(match -> match.getCoordinator().equalsIgnoreCase(coordinator));
    }

    public Stream<Match> getMatchesInOrderByDate(List<Match> matchList) {
        return matchList.stream()
                        .sorted(Comparator.comparing(Match::getMatchDate));
    }

    public Stream<String> getDistinctMatches(List<Match> matchList) {
        return matchList.stream()
                        .map(Match::getMatchTitle)
                        .distinct();
    }
}

 class Streamex2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatchUtility matchUtility = new MatchUtility();
        List<Match> matchList = new ArrayList<>();

        System.out.println("Enter the number of Matches:");
        int numberOfMatches = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter the Match details (matchCode:matchTitle:coordinator:yyyy-MM-dd:venue):");
        for (int i = 0; i < numberOfMatches; i++) {
            String[] matchDetails = scanner.nextLine().split(":");
            if (matchDetails.length != 5) {
                System.out.println("Invalid input. Please enter details in the correct format.");
                i--; // Decrement counter to retry
                continue;
            }

            try {
                String matchCode = matchDetails[0];
                String matchTitle = matchDetails[1];
                String coordinator = matchDetails[2];
                LocalDate matchDate = LocalDate.parse(matchDetails[3]);
                String venue = matchDetails[4];

                Match match = new Match(matchCode, matchTitle, coordinator, matchDate, venue);
                matchList.add(match);
            } catch (Exception e) {
                System.out.println("Error parsing date. Please enter date in yyyy-MM-dd format.");
                i--; // Retry
            }
        }

        System.out.println("\nChoose an option:");
        System.out.println("1. Filter by Coordinator");
        System.out.println("2. Sort by Match Date");
        System.out.println("3. Display Distinct Match Titles");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Enter coordinator name:");
                String coordinator = scanner.nextLine();
                matchUtility.getMatchesByCoordinator(matchList, coordinator)
                            .forEach(System.out::println);
                break;
            case 2:
                matchUtility.getMatchesInOrderByDate(matchList)
                            .forEach(System.out::println);
                break;
            case 3:
                matchUtility.getDistinctMatches(matchList)
                            .forEach(System.out::println);
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
