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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
