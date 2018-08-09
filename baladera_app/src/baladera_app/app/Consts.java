package baladera_app.app;


import java.io.RandomAccessFile;

class Consts
{
    public static RandomAccessFile fileToSend;

    public Consts(){
        try {
            this.fileToSend = new RandomAccessFile("t", "rw");
            this.fileToSend.setLength(10 * 1024 * 1024);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}