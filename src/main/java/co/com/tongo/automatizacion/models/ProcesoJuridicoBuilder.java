package co.com.tongo.automatizacion.models;

import co.com.tongo.automatizacion.utils.Builder;

public class ProcesoJuridicoBuilder implements Builder<ProcesoJuridico> {
    private String ciudad;
    private String entidad;
    private String radicado;

    public static ProcesoJuridicoBuilder juridico() {
        return new ProcesoJuridicoBuilder();
    }

    public ProcesoJuridicoBuilder en(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public ProcesoJuridicoBuilder con(String entidad) {
        this.entidad = entidad;
        return this;
    }

    public ProcesoJuridico y(String radicado) {
        this.radicado = radicado;
        return build();
    }

    @Override
    public ProcesoJuridico build() {
        return new ProcesoJuridico(ciudad, entidad, radicado);
    }
}
