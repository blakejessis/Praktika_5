import javax.swing.*;

public class Loader {
    public static void main(String[] args) {
        Team team1 = new Team("Bayern");
        Team team2 = new Team("Barcelona");

        new MyForm(team1, team2);
    }

}
