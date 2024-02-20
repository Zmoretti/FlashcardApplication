import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudySession {
    private TerminologyBank terminologyBank;
    private Scanner scanner;

    public StudySession(TerminologyBank terminologyBank) {
        this.terminologyBank = terminologyBank;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Please enter the chapter you want to study:");
        String chapter = scanner.nextLine();

        List<Terminology> filteredTerminologies = terminologyBank.getTerminologiesByChapter(chapter);
        Collections.shuffle(filteredTerminologies);
//        if (termsToStudy.isEmpty()) {
//            System.out.println("No terms found for chapter: " + chapter);
//            return;
//        }

        System.out.println("Starting Study Session for Chapter: " + chapter);
        for (Terminology terminology : filteredTerminologies) {
            System.out.println("What is the definition of: " + terminology.getTerm() + "?");
            scanner.nextLine(); // Wait for user input before showing the answer
            System.out.println("Definition: " + terminology.getDefinition());
            System.out.println("-------------------------------");
        }
        System.out.println("Study Session Complete!");
    }
}
