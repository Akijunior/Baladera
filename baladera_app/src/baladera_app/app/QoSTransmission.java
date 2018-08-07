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
public class QoSTransmission {
    private Float latencia;
    private Float banda;
    private Float jitter;

    public QoSTransmission(Float latencia, Float banda, Float jitter) {
        this.latencia = latencia;
        this.banda = banda;
        this.jitter = jitter;
    }

    public QoSTransmission() {
    }

    public Float getLatencia() {
        return latencia;
    }

    public void setLatencia(Float latencia) {
        this.latencia = latencia;
    }

    public Float getBanda() {
        return banda;
    }

    public void setBanda(Float banda) {
        this.banda = banda;
    }

    public Float getJitter() {
        return jitter;
    }

    public void setJitter(Float jitter) {
        this.jitter = jitter;
    }

    @Override
    public String toString() {
        return "QoSTransmission{" + "latencia=" + latencia + ", banda=" + banda + ", jitter=" + jitter + '}';
    }
}
