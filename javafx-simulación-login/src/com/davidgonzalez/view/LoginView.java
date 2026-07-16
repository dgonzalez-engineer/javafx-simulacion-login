/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.view;

import com.davidgonzalez.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author david
 */
public  class LoginView extends BorderPane{    
    private static LoginView instanciaLoginView;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private BorderPane barraDeOpciones;
    
    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;
    
    private GridPane formulario;
    private ImageView imgLogoLogin;
    private Button btnIniciarSecion;
    private String RUTA_ESTILOS = "/com/davidgonzalez/styles/";
    
    private LoginView(){
        this.getStylesheets().add(RUTA_ESTILOS + "LoginStyles.css");
        this.setPadding(new Insets(10));
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
        barraDeOpciones = new BorderPane();
        
        btnCerrarVentana = new Button("X");
        btnCerrarVentana.setStyle("-fx-background-color: #AB7D32; -fx-text-fill: white;");
        lblTituloVentana = new Label("JAVAFX - SIMULACIÓN - LOGIN");
        lblTituloVentana.setStyle("-fx-font-weight: bold; -fx-text-fill: #786341;");
        
        barraDeOpciones.setLeft(btnCerrarVentana);
        barraDeOpciones.setCenter(lblTituloVentana);
        BorderPane.setAlignment(lblTituloVentana, Pos.CENTER);
        
        this.setTop(barraDeOpciones);
        
        //Objetos del formulario
        cajaVertical = new VBox(20);
        
        formulario = new GridPane();
        formulario.setHgap(10);
        formulario.setVgap(15);
        formulario.setAlignment(Pos.CENTER);
        
        lblNombreUsuario = new Label("Ingrese su nombre de Usuario");
        txtNombreUsuario = new TextField();
        
        lblClave = new Label("Ingrese su Contraseña");
        pwdClave = new PasswordField();
        
        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);
        
        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);
        
        btnIniciarSecion = new Button("Iniciar Sesion");
        btnIniciarSecion.getStyleClass().add("btn-ingresar");
        
        imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
        imgLogoLogin.setFitHeight(100);
        imgLogoLogin.setFitWidth(100);
        imgLogoLogin.setCache(true);
        
        cajaVertical.setAlignment(Pos.CENTER);
        
        cajaVertical.getChildren().addAll(imgLogoLogin, formulario, btnIniciarSecion);
        
        this.setCenter(cajaVertical);
    }    
    

    public static LoginView getInstanciaLoginView() {
        if(instanciaLoginView == null)
            instanciaLoginView = new LoginView();
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public BorderPane getBarraDeOpciones() {
        return barraDeOpciones;
    }

    public void setBarraDeOpciones(BorderPane barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }

    public VBox getCajaVertical() {
        return cajaVertical;
    }

    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }

    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public Label getLblClave() {
        return lblClave;
    }

    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }

    public void setImgLogoLogin(ImageView imgLogoLogin) {
        this.imgLogoLogin = imgLogoLogin;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSecion;
    }

    public void setBtnIniciarSesion(Button btnIniciarSecion) {
        this.btnIniciarSecion = btnIniciarSecion;
    }
    
    
}
