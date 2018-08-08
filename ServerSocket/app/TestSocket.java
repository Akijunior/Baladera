import java.net.*;

public class TestSocket {

	public static void main(String[] args) {
		try {
//		ServerSocket, que ir� esperar conex�es na porta 12345 
		ServerSocket server = new ServerSocket(12345);
//		Socket, o qual ir� tratar da comunica��o com o cliente,
//		assim que um pedido de conex�o chegar ao servidor e a conex�o for aceita
		Socket client = server.accept();
//		A classe InetAdress nos permite obter informa��es sobre um computador conectado a rede
		byte[] b = InetAddress.getByName("localhost").getAddress();
//		getAddress(): Este m�todo retorna um array de bytes contendo o endere�o IP.
//		Para isso, o nome do host que se deseja obter o endere�o IP � fornecido ao m�todo
//		getByName da classe  InetAddress
		System.out.println(b[0] + "." + b[1] + "." + b[2] + "." + b[3]);
		}
		
		catch(Exception e) {
		       System.out.println("Erro: " + e.getMessage());
		}
	}

}
