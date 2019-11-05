package co.com.tongo.automatizacion.models;

public class ProcesoJuridico {
    private String ciudad;
    private String entidad;
    private String radicado;

    public ProcesoJuridico(String ciudad, String entidad, String radicado) {
        this.ciudad = ciudad;
        this.entidad = entidad;
        this.radicado = radicado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEntidad() {
        return entidad;
    }

    public String getRadicado() {
        return radicado;
    }
}
