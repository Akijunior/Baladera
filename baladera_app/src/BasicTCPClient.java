import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.*;
import java.util.Date;

import javax.swing.JOptionPane;

public class BasicTCPClient{
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