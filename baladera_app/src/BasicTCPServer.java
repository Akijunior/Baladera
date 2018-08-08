import java.net.*;
import java.io.*;

public class BasicTCPServer {
	public static void main(String[] args) throws Exception {
		
		ServerSocket s = new ServerSocket(9999);
		Socket ss = s.accept();
		System.out.println("Conectado");
		DataInputStream dout = new DataInputStream(ss.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String yoo = dout.readUTF();
			System.out.println("client: " + yoo);
			if (yoo.equalsIgnoreCase("exit"))
				break;
		}
		ss.close();
	  }     
	}

//try {
//// Instancia o ServerSocket ouvindo a porta 12345
//ServerSocket servidor = new ServerSocket(12345);
//System.out.println("Servidor ouvindo a porta 12345");
//while(true) {
//  // o método accept() bloqueia a execução até que
//  // o servidor receba um pedido de conexão
//  Socket cliente = servidor.accept();
//  System.out.println("Cliente conectado: " +
//  cliente.getInetAddress().getHostAddress());
//  ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
//  saida.flush();
//  saida.writeObject(new Date());
//  saida.close();
//  cliente.close();
//}  
//}   
//catch(Exception e) {
// System.out.println("Erro: " + e.getMessage());
//}