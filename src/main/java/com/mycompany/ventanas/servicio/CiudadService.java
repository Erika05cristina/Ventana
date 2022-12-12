/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ventanas.servicio;

import java.util.List;

import com.mycompany.ventanas.modelo.Ciudad;

/**
 *
 * @author Kristina
 */
public interface CiudadService  {
    public void crearCiudad(Ciudad ciudad);
    public Ciudad buscarPorCodigo(int codigo);
    public Ciudad buscarPorNombre(String nombre);
    public List<Ciudad> listar();
    
    
}
