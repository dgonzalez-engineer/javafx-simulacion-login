/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.controller;

import com.davidgonzalez.view.BienvenidaView;
import javafx.stage.Stage;

/**
 *
 * @author david
 */
public class BienvenidaController {

    private final BienvenidaView BIENVENIDA_VIEW;

    public BienvenidaController(BienvenidaView bienvenidaView) {
        this.BIENVENIDA_VIEW = bienvenidaView;
        construirAcciones();
    }

    public void construirAcciones() {
        this.BIENVENIDA_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {
                    Stage escenarioActual = (Stage) this.BIENVENIDA_VIEW.getScene().getWindow();
                    escenarioActual.close();
                }
        );
    }

}
