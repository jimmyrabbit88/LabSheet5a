import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendMenu extends JFrame implements ActionListener {
    JMenu friends;

    public static void main(String[] args) {
        FriendMenu frame = new FriendMenu();
        frame.setVisible(true);
    }

    public FriendMenu(){
        Container container;


        //set properties
        setTitle("Friend Menu");
        setSize(300, 300);
        setResizable(false);
        setLocation(250, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(new FlowLayout());

        createFriendMenu();
        


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
