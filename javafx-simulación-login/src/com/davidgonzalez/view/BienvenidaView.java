/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

/**
 *
 * @author david
 */
public class BienvenidaView extends VBox {

    private Label lblMensajeBienvenida;
    private Button btnCerrarVentana;
    private HBox barraDeOpciones;

    public BienvenidaView(String nombreCompleto) {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));

        this.setBorder(new Border(
                new BorderStroke(Paint.valueOf("786341"),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(20),
                        new BorderWidths(10))
        ));

        this.setBackground(new Background(
                new BackgroundFill(Paint.valueOf("FCF8E6"),
                        new CornerRadii(25),
                        Insets.EMPTY)
        ));

        barraDeOpciones = new HBox();
        barraDeOpciones.setAlignment(Pos.CENTER_LEFT);

        btnCerrarVentana = new Button("X");
        btnCerrarVentana.setStyle("-fx-background-color: #AB7D32; -fx-text-fill: white;");

        barraDeOpciones.getChildren().add(btnCerrarVentana);

        lblMensajeBienvenida = new Label("Bienvenido, " + nombreCompleto);
        lblMensajeBienvenida.setStyle(
                "-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #786341;"
        );

        this.getChildren().addAll(barraDeOpciones, lblMensajeBienvenida);
    }

    public Label getLblMensajeBienvenida() {
        return lblMensajeBienvenida;
    }

    public void setLblMensajeBienvenida(Label lblMensajeBienvenida) {
        this.lblMensajeBienvenida = lblMensajeBienvenida;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }
}
