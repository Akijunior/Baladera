/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baladera_app.app;

import java.io.RandomAccessFile;

/**
 *
 * @author daniel.farias
 */
public class Client {
    
    private Protocolo protocolo;
    private String host;
    private Integer port;
    private RandomAccessFile fileToSend;
    

    public Client(Protocolo protocolo, String host, Integer port) {
        this.protocolo = protocolo;
        this.host = host;
        this.port = port;
        try {
            this.fileToSend = new RandomAccessFile("t", "rw");
            this.fileToSend.setLength(10 * 1024 * 1024);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public RandomAccessFile getFileToSend() {
        return fileToSend;
    }
}
