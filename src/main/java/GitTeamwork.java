public class GitTeamwork {

    public static void main(String[] args) {
        System.out.println("""
        
        Hi there! Welcome to the team!
        ------------------------------
        """);
        simulateTeamwork("Serhx4");
        simulateTeamwork("Hello dudes");
    }

    private static void simulateTeamwork(String name) {
        System.out.format("%s simulates teamwork :)\n", name);
    }
}
