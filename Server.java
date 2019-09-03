import java.net.*;
import java.io.*;
class Server{
	public static void main(String args[]){
		try{
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("server started");
		// keep the server running
		for(;;){
			Socket s = ss.accept();
			System.out.println("clinet connected at port"+s.getInetAddress());
			ObjectInputStream oos = new ObjectInputStream(s.getInputStream());
			String st = (String)oos.readObject();
			System.out.println(st);
			oos.close();
		}
		}
		catch(Exception e){
			
		}
	}
}