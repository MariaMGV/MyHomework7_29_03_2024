package encapsulation;
import java.util.LinkedList;


public class Team {
    public String teamName;
    private LinkedList<Player> players = new LinkedList<>();

    public String getTeamName() {

        return teamName;
    }
    private void setName(String name) {
       if(!name.isEmpty()){
           this.teamName = name;
       }else{
           System.out.println("A name should not be empty");
       }
    }
    public Team (String name){

        setName(name);
    }

    public double getTeamAverageRating(){
        if(!players.isEmpty()){

            double allPlayersSkill = 0;
            int numberOfPlayers = 0;

                for (Player p : players) {
                    double currentPlayer = p.calculateSkillLevel();
                    allPlayersSkill += currentPlayer;
                    numberOfPlayers++;
                }
            double resultStats = allPlayersSkill / numberOfPlayers;
            return resultStats;
            } else{
            return 0.0;
            }
    }
    public void addPlayer(Player player){
        if(players.isEmpty()) {
            System.out.printf("Team %s does not exist\n", getTeamName());

        }
        if(!players.contains(player)) {
            players.add(player);
        }
        else{
            System.out.printf("%s is already in this team\n",player.getName());
        }
    }
    public void removePlayer(Player player){
        if(players.contains(player)) {
            players.remove(player);
        }
        else {
            System.out.printf("Player %s is not in %s team\n",player.getName(),getTeamName());

        }

    }

}

