import java.io.*;
import java.net.*;

public class simpleClient
{
    public static void main(String[] args)
    {
      
      try{
          Socket socket = new Socket("localhost", 5000);

        System.out.println("Counnected to server ");

        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        output.writeUTF("hello sever! this is Client ");

        output.close();
        socket.close();
    } catch (IOException e) 
    {
        e.printStackTrace();
    }
}
}