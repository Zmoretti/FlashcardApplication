public class Terminology {
    private String term;
    private String definition;
    private String chapter; // New attribute to specify the chapter

    public Terminology(String term, String definition, String chapter) {
        this.term = term;
        this.definition = definition;
        this.chapter = chapter;
    }

    // Getters
    public String getTerm() {
        return term;
    }

    public String getDefinition() {
        return definition;
    }

    public String getChapter() {
        return chapter;
    }
}
