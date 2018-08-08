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
	  
	  while(true) {
		  String so = br.readLine();
		  dout.writeUTF(so);
		  if (so.equalsIgnoreCase("exit"))
			  break;
	  }
	  s.close();
  }
}

//try {
//Socket cliente = new Socket("paulo", 12345);
//ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
//Date data_atual = (Date)entrada.readObject();
//JOptionPane.showMessageDialog
//(null,"Data recebida do servidor:" + data_atual.toString());
//entrada.close();
//System.out.println("Conexão encerrada");
//}
//catch(Exception e) {
//System.out.println("Erro: " + e.getMessage());
//}