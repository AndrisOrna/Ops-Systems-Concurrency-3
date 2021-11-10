package lab3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HelloServer {

	public static void main(String[] args) throws Exception {
		
		Socket socket;
		ServerSocket serverSocket = new ServerSocket(2000); // creates new server
		
		while(true){// waits for connection
			
			System.out.println("Server: Waiting for a connection");
			socket = serverSocket.accept();							//waits for a client
			
			
			// need thread here for each client
			
			
			InputStream in = socket.getInputStream();				// receiving something
			Scanner scanner = new Scanner(in);
			OutputStream out = socket.getOutputStream();
			PrintWriter p = new PrintWriter(out);
			
			String inputLine = scanner.nextLine();
			
			//Send string back to client
			p.println("Hello " + inputLine + " from Hello Server");
			p.close();
		}

	}

}
