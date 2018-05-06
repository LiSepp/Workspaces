import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss=new ServerSocket(8080);
			//
			while(true)
			{
				Socket socket=ss.accept();
				InputStream in =socket.getInputStream();
				OutputStream out =socket.getOutputStream();
				InputStreamReader reader=new InputStreamReader(in);
				BufferedReader bufReader=new BufferedReader(reader);
				String readLine=bufReader.readLine();
				System.out.println(readLine);
				PrintStream ps =new PrintStream(out);
				ps.print("Hello");
				ps.flush();
				bufReader.close();
				ps.close();
				ss.close();
			}
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
