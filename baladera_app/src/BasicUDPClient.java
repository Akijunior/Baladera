import java.io.*;
import java.net.*;

class BasicUDPClient
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader inFromUser =
				new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket clientSocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName("localhost");

		long timeoutMillis = 0;
		long start = System.currentTimeMillis();

		try {

			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
			clientSocket.send(sendPacket);
		}catch (Exception e){

		}

		long stop = System.currentTimeMillis();
		timeoutMillis = stop - start;

		System.out.println(timeoutMillis);


		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);

		String modifiedSentence = new String(receivePacket.getData());
		System.out.println("FROM SERVER:" + modifiedSentence);

		clientSocket.close();
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