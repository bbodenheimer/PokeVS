import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;

public class pokeVS {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Vector<String> rowTwo = new Vector<String>();
        rowTwo.addElement("Attack:");
        rowTwo.addElement("GVA");
        rowTwo.addElement("BVA");

        Vector<String> rowThree = new Vector<String>();
        rowThree.addElement("Defense:");
        rowThree.addElement("GVD");
        rowThree.addElement("BVD");

        Vector<String> rowFour = new Vector<String>();
        rowFour.addElement("No Effect:");

        Vector<Vector> rowData = new Vector<Vector>();
        rowData.addElement(rowTwo);
        rowData.addElement(rowThree);
        rowData.addElement(rowFour);

        Vector<String> columnNames = new Vector<String>();
        columnNames.addElement("");
        columnNames.addElement("Good VS");
        columnNames.addElement("Bad VS");
//        columnNames.setSize(3);
        JTable table = new JTable(rowData, columnNames);
        JPanel panel = new JPanel();

        //buttons and listeners
        JButton normal = new JButton("Normal");
        normal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("None", 0, 1);
                // BVA
                table.setValueAt("Rock, Steel", 0, 2);
                // GVD
                table.setValueAt("None", 1, 1);
                // BVD
                table.setValueAt("Fighting", 1, 2);
                // NE
                table.setValueAt("Ghost", 2, 1);
            }
        });
        panel.add(normal);

        JButton fire = new JButton("Fire");
        fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Grass, Ice, Bug, Steel", 0, 1);
                // BVA
                table.setValueAt("Fire, Water, Rock, Dragon", 0, 2);
                // GVD
                table.setValueAt("Fire, Grass, Ice, Bug, Steel, Fairy", 1, 1);
                // BVD
                table.setValueAt("Water, Ground, Rock", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(fire);

        JButton water = new JButton("Water");
        water.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Fire, Ground, Rock", 0, 1);
                // BVA
                table.setValueAt("Water, Grass, Dragon", 0, 2);
                // GVD
                table.setValueAt("Electric, Grass", 1, 1);
                // BVD
                table.setValueAt("Fire, Water, Ice, Steel", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(water);

        JButton electric = new JButton("Electric");
        electric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Water, Flying", 0, 1);
                // BVA
                table.setValueAt("Electric, Grass, Dragon", 0, 2);
                // GVD
                table.setValueAt("Electric, Flying, Steel", 1, 1);
                // BVD
                table.setValueAt("Ground", 1, 2);
                // NE
                table.setValueAt("Ground", 2, 1);
            }
        });
        panel.add(electric);

        JButton grass = new JButton("Grass");
        grass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Water, Ground, Rock", 0, 1);
                // BVA
                table.setValueAt("Fire, Grass, Poison, Flying, Bug, Dragon, Steel", 0, 2);
                // GVD
                table.setValueAt("Water, Electric, Grass, Ground", 1, 1);
                // BVD
                table.setValueAt("Fire, Ice, Poison, Flying, Bug", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(grass);

        JButton ice = new JButton("Ice");
        ice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Grass, Ground, Flying, Dragon", 0, 1);
                // BVA
                table.setValueAt("Fire, Water, Ice, Steel", 0, 2);
                // GVD
                table.setValueAt("Ice", 1, 1);
                // BVD
                table.setValueAt("Fire, Fighting, Rock, Steel", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(ice);

        JButton fighting = new JButton("Fighting");
        fighting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Normal, Ice, Rock, Dark, Steel", 0, 1);
                // BVA
                table.setValueAt("Poison, Flying, Psychic, Bug, Fairy", 0, 2);
                // GVD
                table.setValueAt("Bug, Rock, Dark", 1, 1);
                // BVD
                table.setValueAt("Flying, Psychic, Fairy", 1, 2);
                // NE
                table.setValueAt("Ghost", 2, 1);
            }
        });
        panel.add(fighting);

        JButton poison = new JButton("Poison");
        poison.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Grass, Fairy", 0, 1);
                // BVA
                table.setValueAt("Poison, Ground, Rock, Ghost", 0, 2);
                // GVD
                table.setValueAt("Grass, Fighting, Poison, Bug, Fairy", 1, 1);
                // BVD
                table.setValueAt("Ground, Psychic", 1, 2);
                // NE
                table.setValueAt("Steel", 2, 1);
            }
        });
        panel.add(poison);

        JButton ground = new JButton("Ground");
        ground.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Fire, Electric, Poison, Rock, Steel", 0, 1);
                // BVA
                table.setValueAt("Grass, Bug", 0, 2);
                // GVD
                table.setValueAt("Poison, Rock", 1, 1);
                // BVD
                table.setValueAt("Water, Grass, Ice", 1, 2);
                // NE
                table.setValueAt("Electric", 2, 1);
            }
        });
        panel.add(ground);

        JButton flying = new JButton("Flying");
        flying.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Grass, Fighting, Bug", 0, 1);
                // BVA
                table.setValueAt("Electric, Rock, Steel", 0, 2);
                // GVD
                table.setValueAt("Grass, Fighting, Bug", 1, 1);
                // BVD
                table.setValueAt("Electric, Ice, Rock", 1, 2);
                // NE
                table.setValueAt("Ground", 2, 1);
            }
        });
        panel.add(flying);

        JButton psychic = new JButton("Psychic");
        psychic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Fighting, Poison", 0, 1);
                // BVA
                table.setValueAt("Psychic, Steel", 0, 2);
                // GVD
                table.setValueAt("Fighting, Psychic", 1, 1);
                // BVD
                table.setValueAt("Bug, Ghost, Dark", 1, 2);
                // NE
                table.setValueAt("Dark", 2, 1);
            }
        });
        panel.add(psychic);

        JButton bug = new JButton("Bug");
        bug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Grass, Psychic, Dark", 0, 1);
                // BVA
                table.setValueAt("Fire, Fighting, Poison, Flying, Ghost, Steel, Fairy", 0, 2);
                // GVD
                table.setValueAt("Grass, Fighting, Ground", 1, 1);
                // BVD
                table.setValueAt("Fire, Flying, Rock", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(bug);

        JButton rock = new JButton("Rock");
        rock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Fire, Ice, Flying, Bug", 0, 1);
                // BVA
                table.setValueAt("Fighting, Ground, Steel", 0, 2);
                // GVD
                table.setValueAt("Normal, Fire, Poison, Flying", 1, 1);
                // BVD
                table.setValueAt("Water, Grass, Fighting, Ground, Steel", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(rock);

        JButton ghost = new JButton("Ghost");
        ghost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Psychic, Ghost", 0, 1);
                // BVA
                table.setValueAt("Dark", 0, 2);
                // GVD
                table.setValueAt("NORMAL, FIGHTING, Poison, Bug", 1, 1);
                // BVD
                table.setValueAt("Ghost, Dark", 1, 2);
                // NE
                table.setValueAt("Normal", 2, 1);
            }
        });
        panel.add(ghost);

        JButton dragon = new JButton("Dragon");
        dragon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Dragon", 0, 1);
                // BVA
                table.setValueAt("Steel", 0, 2);
                // GVD
                table.setValueAt("Fire, Water, Electric, Grass", 1, 1);
                // BVD
                table.setValueAt("Ice, Dragon, Fairy", 1, 2);
                // NE
                table.setValueAt("Fairy", 2, 1);
            }
        });
        panel.add(dragon);

        JButton dark = new JButton("Dark");
        dark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Psychic, Ghost", 0, 1);
                // BVA
                table.setValueAt("Fighting, Dark, Fairy", 0, 2);
                // GVD
                table.setValueAt("PSYCHIC, Ghost, Dark", 1, 1);
                // BVD
                table.setValueAt("Fighting, Bug, Fairy", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(dark);

        JButton steel = new JButton("Steel");
        steel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Ice, Rock, Fairy", 0, 1);
                // BVA
                table.setValueAt("Fire, Water, Electric, Steel", 0, 2);
                // GVD
                table.setValueAt("POISON, Normal, Grass, Ice, Flying, Psychic, Bug, Rock, Dragon, Steel, Fairy", 1, 1);
                // BVD
                table.setValueAt("Fire, Fighting, Ground", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(steel);

        JButton fairy = new JButton("Fairy");
        fairy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // GVA
                table.setValueAt("Fighting, Dragon, Dark", 0, 1);
                // BVA
                table.setValueAt("Fire, Poison, Steel", 0, 2);
                // GVD
                table.setValueAt("DRAGON, Fighting, Bug, Dark", 1, 1);
                // BVD
                table.setValueAt("Poison, Steel", 1, 2);
                // NE
                table.setValueAt("None", 2, 1);
            }
        });
        panel.add(fairy);


        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.NORTH);
        frame.setSize(1400, 150);
        frame.setVisible(true);
    }
}