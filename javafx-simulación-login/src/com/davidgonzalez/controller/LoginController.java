/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.controller;

import com.davidgonzalez.model.Usuario;
import com.davidgonzalez.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class LoginController {
    private double ejeX;
    private double ejeY;

    private final LoginView LOGIN_VIEW;
    private AuthSistema authSistema = new AuthSistema();

    public LoginController(LoginView loginView) {
        this.LOGIN_VIEW = loginView;
        construirAcciones();
    }
    
    private Stage escenarioPrincipal = SceneManager.getInstanciaSceneManager().getEscenarioPrincipal();
    
    public void iniciarSesion(){
        String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String clave =this.LOGIN_VIEW.getPwdClave().getText().trim();
        
        if(nombreUsuario.isEmpty()){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "NO DEJES VACIO EL NOMBRE DE USUARIO");
        }else if(clave.isEmpty()){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("empty");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
        JOptionPane.showMessageDialog(null,"NO DEJES VACIA LA CONTRASEÑA");
        }else{
            this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
            //METODO LOGIN 
            Usuario usuario = authSistema.login(nombreUsuario, clave);
            
            if(usuario == null){
                JOptionPane.showMessageDialog(null, "VERIFICA TUS CREDENCIALES");
            }
        }
    }
    
    public void construirAcciones() {
        this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
                (evento)->{
                    iniciarSesion();
                }
        );
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {
                    System.exit(0);
                }
        );

        this.LOGIN_VIEW.setOnMouseClicked(
                (evento) -> {
                    ejeX = evento.getSceneX();
                    ejeY = evento.getSceneY();
                    
                });
        
        this.LOGIN_VIEW.setOnMouseDragged(
        (evento)->{
            double ejeXDesplazamientoVentana = evento.getScreenX();
            double ejeYDesplazamientoVentana = evento.getScreenY();
            
            escenarioPrincipal.setX(ejeXDesplazamientoVentana - ejeX);
            escenarioPrincipal.setY(ejeYDesplazamientoVentana - ejeY);
        }
        );
    }

}
