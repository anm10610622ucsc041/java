import java.io.*;
import java.net.*;
import java.util.Scanner;

public class addres 
{
    public static void main(String[] args)throws IOException
    
    {
        System.out.println(" === java addres === ");
        urlExample();
    }

static void urlExample () throws IOException


{
    System.out.println("2. url Example ");

    URL url = new URL("https://www.example.com");
    BufferedReader br = new BufferedReader
    (
       new InputStreamReader(url.openStream())
    );

    String line ;
    while ((line = br.readLine()) != null)
    {
        System.out.println(line);
    }
    br.close();

    System.out.println();
}
}
   
    