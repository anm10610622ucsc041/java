import java.io.*;
import java.net.*;
import java.util.Scanner;

public class javanetworkingdemo
{
   public static void main(String[] args)throws UnknownHostException 
   
   {
     System.out.println("=== java network demo ===/n");
     inetAddressExample();
    
     
   }

static void inetAddressExample() throws UnknownHostException

{
   System.out.println("1. InetAddress Example");

   InetAddress localHost = InetAddress.getLocalHost();
   System.out.println("local Host name : " + localHost.getHostName());
   System.out.println("local ip Address : " + localHost.getHostAddress());

   InetAddress google = InetAddress.getByName("www.youtube.com");
   System.out.println("google Ip Address : " + google.getHostAddress());

   System.out.println();
}
}
