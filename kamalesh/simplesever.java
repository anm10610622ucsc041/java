import java.util.*;
import java.io.*;
import java.net.*;

public class simplesever
{
    public static void main(String[] args)
     {
        
        try
        {
           ServerSocket server = new ServerSocket(5000);
           System.out.println("server started");
           System.out.println("waiting for client");

           Socket socket = server.accept();
           System.out.println("clients connected");

           DataInputStream input = new  DataInputStream(socket.getInputStream());

           String message = input.readUTF();
           System.out.println("message from client : " + message);

           input.close();
           socket.close();
           server.close();
           
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}