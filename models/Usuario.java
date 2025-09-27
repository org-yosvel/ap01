package models;

import java.util.Date;

public class Usuario {
    private Integer Id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String tipoUsuario;
    private Date fechaRegistro;

    public Usuario(){

    }

    public Usuario(Integer Id, String nombre, String correo, String contrasena, String tipoUsuario, Date fechaRegistro ){
        this.Id=Id;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena=contrasena;
        this.tipoUsuario=tipoUsuario;
        this.fechaRegistro=fechaRegistro;
    }

    public Usuario(String nombre, String correo, String contrasena, String tipoUsuario, Date fechaRegistro){
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena=contrasena;
        this.tipoUsuario=tipoUsuario;
        this.fechaRegistro=fechaRegistro;
    }
}
