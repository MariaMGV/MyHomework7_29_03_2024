package encapsulation;


public class Test {
    public static void main(String[] args) {


        Player messi = new Player("Lionel Messi", 75, 85, 84, 92, 67);
        Player pique = new Player("Gerard Pique", 95, 82, 82, 89, 68);
        Team barcelona = new Team("Barcelona");

        barcelona.addPlayer(messi);
        barcelona.addPlayer(pique);
        barcelona.removePlayer(pique);

        System.out.println("Barcelona - " + barcelona.getTeamAverageRating());
        System.out.println("-----------------");

        Player gerardPique = new Player("Gerard Pique", 195, 82, 82, 89, 68);
        barcelona.removePlayer(gerardPique);
        System.out.println("Barcelona - " + barcelona.getTeamAverageRating());
        System.out.println("---------------");

        Team barsa = new Team("Barcelona");
        System.out.println("Barcelona - " + barsa.getTeamAverageRating());

    }


}
