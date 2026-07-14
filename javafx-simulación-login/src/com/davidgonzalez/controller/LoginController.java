/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.controller;

import com.davidgonzalez.view.LoginView;

/**
 *
 * @author david
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;

    public LoginController(LoginView loginView) {
        this.LOGIN_VIEW = loginView;
        construirAcciones();
    }

    public void construirAcciones() {
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {
                    System.exit(0);
                }
        );
    }

}
