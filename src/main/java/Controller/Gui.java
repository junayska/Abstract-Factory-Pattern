package Controller;

import factory.ICarFactory;
import factory.IComfortCar;
import factory.ISportCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JPanel mypanel;
    private JRadioButton sportRadioButton;
    private JRadioButton comfortRadioButton;
    private JTextArea dec;
    private JTextArea techinfo;
    private JFrame frame = new JFrame("Friendly car dealer");

    private ICarFactory carFactory;


    public Gui(ICarFactory iCarFactory) {
        carFactory = iCarFactory;
        sportRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ISportCar isc = carFactory.sportCar();
                String specs =  isc.getSpecs();
                showDescription(specs);
                showTechinalInfo(isc.getMaximumSpeed());
            }
        });
        comfortRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IComfortCar icc = carFactory.confortCar();
                String specs = icc.getSpecs();
                showDescription(specs);
                showTechinalInfo(icc.getGasolineConsumation());
            }
        });
    }

    public void showDescription(String specs){
        dec.setText(specs);
    }

    public void showTechinalInfo(String techInfoString){
        techinfo.setText(techInfoString);
    }


    public void startWindow(ICarFactory carFactory) {
        Gui gui = new Gui(carFactory);
        gui.createWindow();
        //this.carFactory = carFactory;

    }

    public void createWindow(){
        frame.setContentPane(new Gui(this.carFactory).mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
    }

}
