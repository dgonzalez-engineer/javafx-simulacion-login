/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.davidgonzalez.controller;

import com.davidgonzalez.model.Rol;
import com.davidgonzalez.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class AuthSistema {

    private static AuthSistema instanciaAuthSistema;
    private static ArrayList<Usuario> listaUsuarios;

    public AuthSistema() {
        this.listaUsuarios = new ArrayList<>();
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        listaUsuarios.add(new Usuario("admin", "admin123", "David González", Rol.ADMIN));
        listaUsuarios.add(new Usuario("jperez", "clave123", "Juan Pérez", Rol.USER));
        listaUsuarios.add(new Usuario("mlopez", "clave456", "María López", Rol.USER));
    }

    public Usuario login(String nombreUsuario, String password) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)
                    && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    public static AuthSistema getInstanciaAuthSistema() {
        if (instanciaAuthSistema == null) {
            instanciaAuthSistema = new AuthSistema();
        }
        return instanciaAuthSistema;
    }

    public static void setInstanciaAuthSistema(AuthSistema instanciaAuthSistema) {
        AuthSistema.instanciaAuthSistema = instanciaAuthSistema;
    }
}
