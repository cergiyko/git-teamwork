public class GitTeamwork {

    public static void main(String[] args) {
        System.out.println("""
        
        Hi there! Welcome to the team!
        We are already 2 people :D
        ------------------------------
        """);
        simulateTeamwork("Serhx4");
        simulateTeamwork("Hello dudes");
        simulateTeamwork("divizia");
        simulateTeamwork("Serhx4 again:)");
        simulateTeamwork("Serhx4 and again:)");
        simulateTeamwork("Ahahahah. It's a conflict!");
    }

    private static void simulateTeamwork(String name) {
        System.out.format("%s simulates teamwork :)\n", name);
    }
}
