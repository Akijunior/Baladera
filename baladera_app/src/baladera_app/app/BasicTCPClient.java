package baladera_app.app;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.*;
import java.util.Date;

import javax.swing.JOptionPane;

public class BasicTCPClient implements ISender{
	public long rate;
	public long fileSize;
	public long time;
	
	public static long received = 0;
	

	

	@Override
	public String toString() {
		return "BasicTCPClient [rate=" + rate + ", fileSize=" + fileSize + ", time=" + time + ",perda: "+received+ "]";
	}

	public long send() throws UnknownHostException, IOException {
		  Socket s = new Socket("localhost", 3248);
		  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		  long timeoutMillis = 0;
		  long start = System.currentTimeMillis();
		  
		  File outputStream = new File("C:\\Users\\ljuni\\Downloads\\arquivo.pdf");
		  this.fileSize = outputStream.length();
		  byte[] bytes = new byte[(int) this.fileSize];
		  
		  s.getOutputStream().write(bytes);
		  
		  s.close();

		  long stop = System.currentTimeMillis();

		  timeoutMillis = stop - start;

		  System.out.println(timeoutMillis);
		  this.time = timeoutMillis;
		  this.rate = this.fileSize / this.time;
		  return this.time;
	}
	
  public static void main(String[] args) throws Exception {
	  Socket s = new Socket("localhost", 9999);
	  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	  long timeoutMillis = 0;
	  long start = System.currentTimeMillis();

	  while(true) {
		  String so = br.readLine();
		  dout.writeUTF(so);
		  if (so.equalsIgnoreCase("exit"))
			  break;
	  }

	  s.close();

	  long stop = System.currentTimeMillis();

	  timeoutMillis = stop - start;

	  System.out.println(timeoutMillis);
  }
}

//try {
//Socket cliente = new Socket("paulo", 12345);
//ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
//Date data_atual = (Date)entrada.readObject();
//JOptionPane.showMessageDialog
//(null,"Data recebida do servidor:" + data_atual.toString());
//entrada.close();
//System.out.println("Conex�o encerrada");
//}
//catch(Exception e) {
//System.out.println("Erro: " + e.getMessage());
//}