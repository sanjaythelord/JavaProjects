package Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {
    private static Dialog d;
    DialogExample(){
        Frame f = new Frame();
        d = new Dialog(f,"Dialog Demo", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DialogExample.d.setVisible(false);
            }
        });
        d.add(new Label("Click on button"));
        d.add(b);
        d.setSize(400,400);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogExample();
    }
}
