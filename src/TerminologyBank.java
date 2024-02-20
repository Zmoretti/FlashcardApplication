import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminologyBank {
    private List<Terminology> terminologies;

    public TerminologyBank() {
        this.terminologies = new ArrayList<>();
    }

    public void addTerminology(Terminology terminology) {
        terminologies.add(terminology);
    }

    // New method to get terminologies by chapter
    public List<Terminology> getTerminologiesByChapter(String chapter) {
        return terminologies.stream()
                .filter(terminology -> terminology.getChapter().equalsIgnoreCase(chapter))
                .collect(Collectors.toList());
    }

    public int getSize() {
        return terminologies.size();
    }
}
