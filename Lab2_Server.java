import java.io.*;
import java.net.*;

public class Lab2_Server
{
    public static void main (String arg[]) throws IOException
    {
        try{
        ServerSocket ss = new ServerSocket(6767);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println(str);
        ss.close();
        }catch(Exception e) 
        {
            System.out.println(e);
        }       
    }
}