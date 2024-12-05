package software.ulpgc.moneycalculator.app;

import software.ulpgc.moneycalculator.control.Command;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private final Map<String, Command> commands;

    public MainFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Money Calculator");
        this.setResizable(false);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.commands = new HashMap<>();
        this.add(titlePane());
    }

    private Component titlePane() {
        return new SwingTitlePane();
    }

}
