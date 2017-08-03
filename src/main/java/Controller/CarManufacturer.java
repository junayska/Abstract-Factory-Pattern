package Controller;

import factory.AudiFactory;
import factory.ICarFactory;
import factory.SkodaFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarManufacturer {

    private JPanel myPanel;
    private JLabel Label_CarManufacturer;
    private JButton button_Skoda;
    private JButton button_Audi;
    private JFrame frame2 = new JFrame("Friendly car dealer");

    ICarFactory carFactory;

    public CarManufacturer() {
        button_Skoda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {

                carFactory = new SkodaFactory();
                Gui gui = new Gui(carFactory);
                gui.startWindow(carFactory);
                frame2.dispose();
            }
        });
        button_Audi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                carFactory = new AudiFactory();
                Gui gui = new Gui(carFactory);
                gui.startWindow(carFactory);
                frame2.dispose();
            }
        });
    }

    public static void main (String[] args){
        CarManufacturer cm = new CarManufacturer();
        cm.createStartWindow();
    }

    public void createStartWindow(){
        frame2.setContentPane(new CarManufacturer().myPanel);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(600,400);
        frame2.setVisible(true);
    }

}
