import java.net.*;
import java.io.*;
import java.util.Scanner;
public class MyClient{
	
	
	public static void main(String[] args)
	{
		try{
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Message: ");
			String message;
			message= sc.nextLine();
		Socket cs= new Socket("localhost",2048);
		DataOutputStream os= new DataOutputStream(cs.getOutputStream()); 
		os.writeUTF(message);
		DataInputStream is= new DataInputStream(cs.getInputStream()); 
		System.out.println(is.readUTF());
		os.close();
		
		}
		catch(IOException e){}
	}
}




















