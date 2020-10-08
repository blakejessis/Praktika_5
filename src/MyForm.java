import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyForm extends JFrame {

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton total;
    private JLabel team1Label;
    private JLabel team2Label;
    private JLabel scoreLabel;

    MyForm(Team team1, Team team2) throws HeadlessException {

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(panel1);
        scoreLabel.setText("0 X 0");

        team1Label.setText(team1.getName());
        team2Label.setText((team2.getName()));

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                team1.increasedScore();
                scoreLabel.setText(String.valueOf(team1.getScore()) + " " + "X" + " " + String.valueOf(team2.getScore()));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                team2.increasedScore();
                scoreLabel.setText(String.valueOf(team1.getScore()) + " " + "X" + " " + String.valueOf(team2.getScore()));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        total.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (team1.getScore() > team2.getScore()) {
                    JOptionPane.showMessageDialog(MyForm.this, "Team " + team1.getName() + " WON!");
                } else if (team1.getScore() < team2.getScore()) {
                    JOptionPane.showMessageDialog(MyForm.this, "Team " + team2.getName() + " WON!");
                }
                else {
                    JOptionPane.showMessageDialog(MyForm.this, "DRAW");
                }
                team1.setScore(0);
                team2.setScore(0);
                scoreLabel.setText("0 x 0");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
