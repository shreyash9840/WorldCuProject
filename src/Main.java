import Model.Group;
import Model.Players;
import Model.Team;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Brazil","Yellow",1);
        Team team2 = new Team("England","White",5);
        Team team3 = new Team("Denmark","Red",10);
        Team team4 = new Team("France","Blue",4);
        Team team5 = new Team("Netherlands","Orange",8);
        Team team6 = new Team("Argentina","sky blue",3);
        Players players1 = new Players("Harry Kane",3434,34,9);
        Players players2 = new Players("Kylian Mbappe",2334,29,6);
        Players players3 = new Players("Christiano Ronaldo",2456,38,7);
        Players players4 = new Players("Lionel Messi",1435,41,8);
        Group group1 = new Group("English football team");
        Group group2 = new Group("French football team");
        Group group3 = new Group("Brazilian football team");
    }
}
