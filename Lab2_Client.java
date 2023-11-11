import java.io.*;
import java.net.*;

public class Lab2_Client
{
    public static void main (String arg[]) throws IOException
    {
        try{
        Socket s = new Socket("localhost", 6767);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hello TH!");
        dos.flush();
        dos.close();
        }catch(Exception e) 
        {
            System.out.println(e);
        }       
    }
}