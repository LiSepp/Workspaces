
import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		try
		{
			Socket socket =new Socket("localhost",8080);
			DataInputStream dis=new DataInputStream(new BufferedInputStream(
				socket.getInputStream()));
			DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(
				socket.getOutputStream()));
			dos.writeUTF("Hello Server!");
			dos.flush();
			System.out.println(dis.readUTF());
			dis.close();
			dis.close();
			socket.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
