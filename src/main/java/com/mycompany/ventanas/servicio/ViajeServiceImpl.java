/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanas.servicio;

import com.mycompany.ventanas.modelo.Viaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kristina
 */
public class ViajeServiceImpl implements ViajeService{

    private List<Viaje> viajeList;

    public ViajeServiceImpl() {
        viajeList= new ArrayList<>();
    }
    
    @Override
    public void crear(Viaje viaje) {
        this.viajeList.add(viaje);
    }

    @Override
    public List<Viaje> listar() {
        return this.viajeList;
    }
    
}
