import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyCounter {
    JFrame frame;
    JButton getCount;
    JTextField field1;
    JTextField field2;
    int count;

    public KeyCounter() {
        frame = new JFrame("Key Counter");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        field1 = new JTextField();
        getCount = new JButton("Get press count");
        field2 = new JTextField();

        frame.add(field1);
        frame.add(getCount);
        frame.add(field2);
        frame.pack();
        frame.setVisible(true);

        getCount.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                count++;
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }



            @Override
            public void keyReleased(KeyEvent e) {

            }


        }
                field2.setText(count +""));
                count = 0;




    }

    public static void main(String[] args) {
        KeyCounter s = new KeyCounter();
    }
}
