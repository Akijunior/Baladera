package baladera_app.app;

import java.io.IOException;
import java.net.UnknownHostException;

public interface ISender {
	public long send() throws UnknownHostException, IOException;
}
