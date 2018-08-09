package baladera_app.app;
import java.io.*;
import java.net.*;

public class TCPClientTransfer {
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("localhost", 4500);
		InputStream inputStream = socket.getInputStream();
		FileOutputStream outputStream = 
				new FileOutputStream("C:\\Users\\ljuni\\Downloads\\nova.jpeg");
		
		byte[] bytes = new byte[204800];
		inputStream.read(bytes, 0, bytes.length);
		outputStream.write(bytes, 0, bytes.length);
		
	}

}
