package com.example.java_task01;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import moudle.Director;
import moudle.Indicator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    public Label labelIMT;
    private final Imt_class bmi = new Imt_class();
    public TextField massa;
    public TextField rost;
    public Label imt;
    public Button butto;
    public Indicator indicator;
    public boolean indOk = false;
    public HBox colorbox;


    public void onHelloButtonClick(ActionEvent actionEvent) {
        if (indOk) indicator.remove(colorbox);
        indOk = true;
        Director director = new Director();
        bmi.setMass_p(massa.getText());
        bmi.setRost_p(rost.getText());
        Color color;
        if (bmi.getImt() < 16) color = Color.RED;
        else if (bmi.getImt() <= 18.5) color = Color.YELLOW;
        else if (bmi.getImt() <= 25) color = Color.GREEN;
        else if (bmi.getImt() <= 30) color = Color.YELLOW;
        else color = Color.RED;
        indicator = new Indicator();
        double flag = (int) bmi.getImt() * 10.4;
        if (flag > 530) {
            flag = 525;
        }

        indicator = director.construct(color, flag, getMessageBasedOnIMT(bmi.getImt()));
        indicator.show(colorbox);

        imt.setText(String.valueOf(bmi.getImt()));

        String message = getMessageBasedOnIMT(bmi.getImt());
        labelIMT.setText(message);
    }

    private String getMessageBasedOnIMT(double imt) {
        String message = "";
        if (imt < 16) message = "Значительный дефицит массы тела";
        else if (imt <= 18.5) message = "Дефицит массы тела";
        else if (imt <= 25) message = "Норма";
        else if (imt <= 30) message = "Лишний вес";
        else message = "Ожирение";
        return message;
    }
}