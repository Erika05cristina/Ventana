/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanas.servicio;

import com.mycompany.ventanas.modelo.Viaje;
import java.util.List;

/**
 *
 * @author Kristina
 */
public interface ViajeService {
    
    public void crear(Viaje viaje);
    public List<Viaje> listar();
}
