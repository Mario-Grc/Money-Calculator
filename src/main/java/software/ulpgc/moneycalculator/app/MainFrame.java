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
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(1280, 720);
        this.setLayout(new BorderLayout());
        this.commands = new HashMap<>();
    }
}
