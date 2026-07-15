/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.controller;

import com.davidgonzalez.view.BienvenidaView;
import com.davidgonzalez.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class SceneManager {
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;
    
    public void cambiarEscena(Pane panel, int ancho, int alto){
        try{
           escenaPrincipal = new Scene(panel, ancho, alto);
           this.escenarioPrincipal.setScene(escenaPrincipal);
           this.escenarioPrincipal.sizeToScene();
           this.escenarioPrincipal.show();
        }catch(NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar Escena");
            objetoNulo.printStackTrace();
        }catch (Exception errorPadre){
        JOptionPane.showMessageDialog(null, "Error padre: Cambiar Escena");
        errorPadre.printStackTrace();
        }
    }
    
    public void ventanaLogin(){
        try{
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
           LoginView login = LoginView.getInstanciaLoginView();
           cambiarEscena(login, 450 , 500);
           this.escenaPrincipal.setFill(Color.TRANSPARENT);
           new LoginController(login);
           
        }catch(NullPointerException objetoNulo){
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Login");
            objetoNulo.printStackTrace();
        }catch (Exception errorPadre){
        JOptionPane.showMessageDialog(null, "Error padre: Ventana Login");
        errorPadre.printStackTrace();
        }
        
    }

    public void ventanaBienvenida(String nombreCompleto) {
        try {
            this.escenarioSecundario = new Stage();
            this.escenarioSecundario.initStyle(StageStyle.TRANSPARENT);

            BienvenidaView bienvenida = new BienvenidaView(nombreCompleto);
            Scene escenaBienvenida = new Scene(bienvenida, 320, 160);
            escenaBienvenida.setFill(Color.TRANSPARENT);

            this.escenarioSecundario.setScene(escenaBienvenida);
            this.escenarioSecundario.centerOnScreen();
            this.escenarioSecundario.show();

            new BienvenidaController(bienvenida);

        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Bienvenida");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: Ventana Bienvenida");
            errorPadre.printStackTrace();
        }
    }

    public static SceneManager getInstanciaSceneManager() {
        if(instanciaSceneManager == null)
            instanciaSceneManager= new SceneManager();
        return instanciaSceneManager;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }
    
    

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
    
    
}
