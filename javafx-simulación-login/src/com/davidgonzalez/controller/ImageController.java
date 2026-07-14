/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.controller;

import javafx.scene.image.Image;

/**
 *
 * @author david
 */
public class ImageController {
    private final String RUTA_IMAGENES = "/com/davidgonzalez/resources/";
    public Image getImageLogin(String nombreImagen){
    Image crearImagen;
        switch (nombreImagen) {
            case "logo":
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.png");
                break;
            default:
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.png");
        }
        return crearImagen;
    }
}
