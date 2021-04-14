package ru.geekbrains.javaLevel2;

import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {

    Frame() {
        setTitle("Конкурент телеги");
        setSize(new Dimension(600, 400));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        BigTextField bigTextField = new BigTextField();
        MessageField messageField = new MessageField(bigTextField.getTextArea());

        add(bigTextField, BorderLayout.CENTER);
        add(messageField, BorderLayout.SOUTH);

        setVisible(true);
    }
}