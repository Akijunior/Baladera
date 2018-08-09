package baladera_app.app;

import java.io.IOException;

public class GeneralMain {
	
	static BasicUDPClient buc;
	static BasicTCPClient btc;
	
	public static void main(String[] args) throws IOException {
		buc = new BasicUDPClient();
		btc = new BasicTCPClient();
		
		System.out.println("Envio de Teste");
		
		long tempoUDP = buc.send();
		long tempoTCP = btc.send();
		
		System.out.println(buc);
		System.out.println(btc);
		
		final ISender melhor;
		
		if(tempoUDP < tempoTCP) {
			System.out.println("UDP melhor");
			melhor = buc;
		}else {
			System.out.println("TCP melhor");
			melhor = btc;
		}
		
		System.out.println("Envio no protocolo melhor: ");
		//melhor.send();
		
		System.out.println(melhor);
	}
	
	
}
