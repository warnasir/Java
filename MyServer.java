import java.net.*;
import java.io.*;
public class MyServer{
	
	
	public static void main(String[] args)
	{
		try{
		ServerSocket ss= new ServerSocket(2048);
		Socket s= ss.accept();
		DataInputStream is= new DataInputStream(s.getInputStream()); 
		
		System.out.println(is.readUTF());
		DataOutputStream os= new DataOutputStream(s.getOutputStream()); 
		os.writeUTF("Hello Client got your message.");
		is.close();
		
		}
		catch(IOException e){}
	}
}