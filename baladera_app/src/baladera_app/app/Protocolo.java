/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baladera_app.app;

/**
 *
 * @author daniel.farias
 */
public enum Protocolo {
    UDP("Udp"),
    TCP("Tcp");
    
    private String nome;
    
    private Protocolo(String nome){
        this.nome = nome;
    }
    
}
