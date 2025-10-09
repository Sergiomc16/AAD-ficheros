package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Incidencia {
    //usuario, fecha, tipo, hora
    private LocalDate fecha;
    private LocalTime hora;
    private String tipoExcepcion;
    private String usuario;

    public Incidencia(LocalDate fecha, LocalTime hora, String tipoExcepcion, String usuario) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoExcepcion = tipoExcepcion;
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getTipoExcepcion() {
        return tipoExcepcion;
    }

    public void setTipoExcepcion(String tipoExcepcion) {
        this.tipoExcepcion = tipoExcepcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        //hota formateada porque aparecían milisegundos
        DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("HH:mm:ss");

        return fecha + ";" + hora.format(horaFormateada) + ";" + tipoExcepcion + ";" + usuario;
    }
}
