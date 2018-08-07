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
public class Server {
    private Protocolo protocolo;
    private String host;
    private Integer port;
    private Integer packetSize;

    public Server(Protocolo protocolo, String host, Integer port, Integer packetSize) {
        this.protocolo = protocolo;
        this.host = host;
        this.port = port;
        this.packetSize = packetSize;
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

    public Integer getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(Integer packetSize) {
        this.packetSize = packetSize;
    }

    @Override
    public String toString() {
        return "Server{" + "protocolo=" + protocolo + ", host=" + host + ", port=" + port + ", packetSize=" + packetSize + '}';
    }
}
