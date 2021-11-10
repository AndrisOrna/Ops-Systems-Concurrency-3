package lab3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ReadFileClientApp {

	public static void main(String args[]) throws Exception {
		// TODO Auto-generated method stub
		InetAddress inet = InetAddress.getLocalHost();
//		InetAddress inet = InetAddress.getByName("192.168.23.126");// enter IP address in brackets
		
		Socket s =  new Socket(inet, 3001);// the server should be the same if you want to connect to server
		
		InputStream in = s.getInputStream();
		Scanner r = new Scanner(in);
		OutputStream o = s.getOutputStream();
		PrintWriter p = new PrintWriter(o);
		
		p.println("greating.txt");
		p.flush();

		String line;
		while(r.hasNextLine()) {
			line = r.nextLine();
			System.out.println(line);
		}	
	}
}
