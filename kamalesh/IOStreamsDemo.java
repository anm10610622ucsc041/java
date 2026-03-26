import java.io.*;



import javax.swing.plaf.synth.SynthScrollBarUI;

public class IOStreamsDemo 
{
    static void fileWriterExample()
    {
        System.out.println("\n---filewriter Example --- ");

        try 
            {
               FileWriter fw = new FileWriter("sample.txt");
               fw.write("hello from filewrite!\n");
               fw.write("java io streams are easy.");
               fw.close();

               System.out.println("data write successfully.");


            }catch(IOException e )
            {
                System.out.println("error writing file: " + e.getMessage());
            }
    }
    static void fileReadExample()
    {
        System.out.println("\n--- Eileread Example ---");
        try
        {
           FileReader fr = new FileReader("sample.txt");

           int ch ;

           while((ch = fr.read()) != -1) 
           {
              System.out.print((char) ch);
           }

           fr.close();

        }catch(IOException e)
        {
            System.out.println("error reading file : " + e.getMessage());
        }
    }
        static void bufferedWriterExample()
        {
            System.out.println("\n--- buffer by ---");
            try 
            {
                BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"));

                bw.write("this is buffer writing./n");
                bw.write(" it is faster than filewriter.");
                bw.newLine();

                bw.close();

                System.out.println("buffered write completed.");
            }catch(IOException e)
            {
                System.out.println("buffered write error : " + e .getMessage());
            }
        }
         static void bufferedReaderExample()
         {
            System.out.println("\n--- bufferedreader Example---");

            try 
            {
                BufferedReader br = new BufferedReader(new FileReader("buffer.txt")) ;

                String line;
                while((line = br.readLine( ))!=null)

                    {
                        System.out.print(line);
                    }

                    br.close();
            }catch(IOException e)
            {
                System.out.println("buffered read error:" + e.getMessage());
            }
         }
         static void byteStreamExample()
         {
            System.out.println("\n---byte stream Example ---");

            try 
            {
                FileOutputStream fos = new FileOutputStream("bytefile.txt");
                String data = "byte stream example" ;
                fos.write(data.getBytes());
                fos.close();

                FileInputStream fis = new FileInputStream("bytefile.txt");
                int b ;
                while((b=fis.read())!= -1)
                {
                    System.out.print((char)b);
                }
                fis.close();
            }catch(IOException e)
            {
                System.out.println("byte stream error: " + e . getMessage());
            }
         }
         public static void main(String[] args) {
            System.out.println("===== java IO STREAMS DEMO =====");

            fileWriterExample();
            fileReadExample();
            bufferedWriterExample();
            bufferedReaderExample();
            byteStreamExample();
            System.out.println("\n===== PROGRAM END =====");
         }
          
         
             

    
    
}