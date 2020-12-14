package baladera_app.app;
import java.io.*;
import java.net.*;

class BasicUDPClient implements ISender
{
	public long rate;
	public long fileSize;
	public long time;
	public static long received = 0;
		
	@Override
	public String toString() {
		return "BasicUDPClient [rate=" + rate + ", fileSize=" + fileSize + ", time=" + time + ",perda: "+received+  "]";
	}

	public long send() throws IOException {
		BufferedReader inFromUser =
				new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket clientSocket;
		clientSocket = new DatagramSocket();
		InetAddress IPAddress;
		IPAddress = InetAddress.getByName("localhost");
		

		long timeoutMillis = 0;
		long start = System.currentTimeMillis();

		File outputStream = new File("C:\\Users\\ljuni\\Downloads\\arquivo.pdf");
		
		this.fileSize = outputStream.length();
		 
		byte[] bytes = new byte[(int) this.fileSize];
		
		long times = this.fileSize / 60000;
		
		for(int i = 0; i < times; i++) {
			DatagramPacket sendPacket = new DatagramPacket(bytes, 60000, IPAddress, 9876);	
			clientSocket.send(sendPacket);
		}

		long stop = System.currentTimeMillis();
		timeoutMillis = stop - start;
		
		System.out.println(timeoutMillis);


		clientSocket.close();

		 this.time = timeoutMillis;
		  this.rate = this.fileSize / (this.time == 0l ? 1 : this.time);
		  return this.time;
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