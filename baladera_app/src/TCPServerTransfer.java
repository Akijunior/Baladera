import java.io.*;
import java.net.*;

public class TCPServerTransfer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(4500);

		Socket socket = serverSocket.accept();
		FileInputStream fileInput = new FileInputStream("C:\\Users\\ljuni\\Downloads\\foto.jpeg");

		//Consts consts = new Consts();
		//consts.fileToSend;

		byte[] bytes = new byte[204800];

		fileInput.read(bytes, 0, bytes.length);
		
		OutputStream outputStream = socket.getOutputStream();

		outputStream.write(bytes, 0, bytes.length);
		
	}
}
