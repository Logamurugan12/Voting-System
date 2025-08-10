import java.util.Scanner;

public class VotingSystem {

    private static String[] candidates = {"logamurugan", "Ajay", "Harish"};
    

    private static int[] votes = {0, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nVoting System");
            System.out.println("1. Vote for a Candidate");
            System.out.println("2. View Total Votes");
            System.out.println("3. Exit");
            System.out.print("Please select an option (1-3): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    voteForCandidate(scanner);
                    break;
                case 2:
                    viewTotalVotes();
                    break;
                case 3:
                    System.out.println("Exiting the voting system.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void voteForCandidate(Scanner scanner) {
        System.out.println("\nAvailable Candidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }
        
        System.out.print("Enter the number corresponding to your chosen candidate: ");
        int candidateNumber = scanner.nextInt();
        
        if (candidateNumber >= 1 && candidateNumber <= candidates.length) {
            votes[candidateNumber - 1]++;
            System.out.println("You have successfully voted for " + candidates[candidateNumber - 1]);
        } else {
            System.out.println("Invalid candidate number. Please try again.");
        }
    }

    private static void viewTotalVotes() {
        System.out.println("\nTotal Votes:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + ": " + votes[i] + " vote(s)");
        }
    }
}

 
