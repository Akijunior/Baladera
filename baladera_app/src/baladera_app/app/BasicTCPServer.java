package baladera_app.app;
import java.net.*;
import java.io.*;

public class BasicTCPServer {
	public static void main(String[] args) throws Exception {


		int firsttime = 1;
		while (true) {
			String clientSentence;
			String capitalizedSentence="";
			ServerSocket welcomeSocket = new ServerSocket(3248);
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			clientSentence = inFromClient.readLine();
			//System.out.println(clientSentence);
			if (clientSentence.equals("set")) {
				outToClient.writeBytes("connection is ");
				System.out.println("running here");
				//welcomeSocket.close();
				//outToClient.writeBytes(capitalizedSentence);
			}
			capitalizedSentence = clientSentence.toUpperCase() + "\n";
			//if(!clientSentence.equals("quit"))
			outToClient.writeBytes(capitalizedSentence+"enter the message or command: ");
			System.out.println("passed");
			//outToClient.writeBytes("enter the message or command: ");
			
			welcomeSocket.close();
			BasicTCPClient.received += capitalizedSentence.length();
			System.out.println("connection terminated");
		}
	}
}

//try {
//// Instancia o ServerSocket ouvindo a porta 12345
//ServerSocket servidor = new ServerSocket(12345);
//System.out.println("Servidor ouvindo a porta 12345");
//while(true) {
//  // o m�todo accept() bloqueia a execu��o at� que
//  // o servidor receba um pedido de conex�o
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