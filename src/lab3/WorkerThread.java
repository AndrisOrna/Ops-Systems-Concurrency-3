package lab3;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WorkerThread extends Thread {
	Socket s;
	WorkerThread (Socket s){
		this.s = s;
	}
	
	public void run() {
		try {
			InputStream in = s.getInputStream();	
			Scanner r = new Scanner(in);
			OutputStream out = s.getOutputStream();
			PrintWriter p = new PrintWriter(out);
			
			String fileName;
			fileName = r.nextLine();
			System.out.println(getName() + " handling " + fileName);
			
			FileInputStream fin = new FileInputStream(fileName);
			Scanner f = new Scanner(fin);
			
			String line;
			while (f.hasNextLine()) {
				line = f.nextLine();
				p.println(line);
			}
			sleep(15000);
			p.close();
			System.out.println(getName() + " finished handling " + fileName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
