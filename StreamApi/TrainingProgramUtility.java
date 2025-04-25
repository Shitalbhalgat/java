import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class TrainingProgramUtility {

    public List<TrainingProgram> retrieveProgramsByTrainer(Stream<TrainingProgram> programStream, String trainerName) {
        return programStream
                .filter(program -> program.getTrainerName().equalsIgnoreCase(trainerName))
                .collect(Collectors.toList());
    }

    public List<TrainingProgram> retrieveProgramsByTopic(Stream<TrainingProgram> programStream, String topic) {
        return programStream
                .filter(program -> program.getTopic().equalsIgnoreCase(topic))
                .collect(Collectors.toList());
    }

    public List<TrainingProgram> retrieveProgramsByDuration(Stream<TrainingProgram> programStream, int duration) {
        return programStream
                .filter(program -> program.getDuration() > duration)
                .collect(Collectors.toList());
    }
}

 class Streamex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of training programs to add to the list:");
        int totalPrograms = Integer.parseInt(scanner.nextLine());

        List<TrainingProgram> trainingProgramList = new ArrayList<>();

        System.out.println("Enter the training program details (programName, trainerName, topic, duration) separated by commas:");
        for (int i = 0; i < totalPrograms; i++) {
            String[] details = scanner.nextLine().split(",");
            String programName = details[0].trim();
            String trainerName = details[1].trim();
            String topic = details[2].trim();
            int duration = Integer.parseInt(details[3].trim());

            TrainingProgram program = new TrainingProgram(programName, trainerName, topic, duration);
            trainingProgramList.add(program);
        }

        TrainingProgramUtility utility = new TrainingProgramUtility();

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Retrieve programs by trainer");
            System.out.println("2. Retrieve programs by topic");
            System.out.println("3. Retrieve programs with duration greater than given value");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter trainer name:");
                    String trainerName = scanner.nextLine();
                    List<TrainingProgram> byTrainer = utility.retrieveProgramsByTrainer(trainingProgramList.stream(), trainerName);
                    displayPrograms(byTrainer);
                    break;

                case 2:
                    System.out.println("Enter topic:");
                    String topic = scanner.nextLine();
                    List<TrainingProgram> byTopic = utility.retrieveProgramsByTopic(trainingProgramList.stream(), topic);
                    displayPrograms(byTopic);
                    break;

                case 3:
                    System.out.println("Enter minimum duration:");
                    int duration = Integer.parseInt(scanner.nextLine());
                    List<TrainingProgram> byDuration = utility.retrieveProgramsByDuration(trainingProgramList.stream(), duration);
                    displayPrograms(byDuration);
                    break;

                case 4:
                    continueProgram = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayPrograms(List<TrainingProgram> programs) {
        if (programs.isEmpty()) {
            System.out.println("No programs found.");
        } else {
            programs.forEach(program -> {
                System.out.println("Program Name: " + program.getProgramName());
                System.out.println("Trainer Name: " + program.getTrainerName());
                System.out.println("Topic: " + program.getTopic());
                System.out.println("Duration: " + program.getDuration() + " hours\n");
            });
        }
    }
}
