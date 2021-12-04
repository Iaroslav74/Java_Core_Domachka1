public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Vova", 300);
        Member member2 = new Member("Sveta", 400);
        Member member3 = new Member("Slava", 150);
        Member member4 = new Member("Bob", 50);
        Team team = new Team("Уральские пельмени", member1, member2, member3, member4);
        Course course = new Course(150, 200, 300);

        team.showInfoAboutAllMembers();
        System.out.println();

        course.doIt(team);

        team.showInfoAboutWinners();
    }
}
