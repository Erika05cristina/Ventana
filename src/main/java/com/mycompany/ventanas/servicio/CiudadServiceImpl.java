/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanas.servicio;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.ventanas.modelo.Ciudad;

/**
 *
 * @author Kristina
 */
public class CiudadServiceImpl implements CiudadService{
    
    private List<Ciudad> ciudadList=new ArrayList<>();

   
    @Override
    public List<Ciudad> listar() {
    return this.ciudadList;     
    }

    @Override
    public void crearCiudad(Ciudad ciudad) {
       this.ciudadList.add(ciudad);
    }

    @Override
    public Ciudad buscarPorCodigo(int codigo) {
        Ciudad retorno = null;
        for (var ciudad : this.ciudadList) {
            if (codigo == ciudad.getCodigo()) {
                retorno = ciudad;
                break;
            }
        }
        return retorno;
    }

    @Override
    public Ciudad buscarPorNombre(String nombre) {
        Ciudad retorno = null;
        for (var ciudad : this.ciudadList) {
            if (nombre.equals(ciudad.getNombre())) {
                retorno = ciudad;
                break;
            }
        }
        return retorno;
    }
    
    
}
