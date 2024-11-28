/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordetareas;

/**
 *
 * @author USUARIO
 */
public class TareaComplejaFactory implements TareaFactory{
    
    @Override
    public Tarea factoryMethod(){
        return new TareaCompleja();
    }
}

