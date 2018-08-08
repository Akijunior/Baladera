import java.net.*;

public class TestSocket {

	public static void main(String[] args) {
		try {
//		ServerSocket, que irá esperar conexões na porta 12345 
		ServerSocket server = new ServerSocket(12345);
//		Socket, o qual irá tratar da comunicação com o cliente,
//		assim que um pedido de conexão chegar ao servidor e a conexão for aceita
		Socket client = server.accept();
//		A classe InetAdress nos permite obter informações sobre um computador conectado a rede
		byte[] b = InetAddress.getByName("localhost").getAddress();
//		getAddress(): Este método retorna um array de bytes contendo o endereço IP.
//		Para isso, o nome do host que se deseja obter o endereço IP é fornecido ao método
//		getByName da classe  InetAddress
		System.out.println(b[0] + "." + b[1] + "." + b[2] + "." + b[3]);
		}
		
		catch(Exception e) {
		       System.out.println("Erro: " + e.getMessage());
		}
	}

}
