package com.miempresa.aplicacion.servicios;

import com.miempresa.aplicacion.modelos.MiEntidad;

import java.util.List;

public interface MiServicio {

    void guardar(MiEntidad miEntidad);
    MiEntidad buscar(Integer id);
    List<MiEntidad> listado();
    void eliminar(Integer id);
    void actualizar(MiEntidad miEntidad);

}
