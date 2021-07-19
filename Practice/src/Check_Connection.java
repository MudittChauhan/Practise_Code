import java.net.*;
import java.io.*;
import javax.swing.*;

public class Check_Connection 
{
 public static void main(String args[]) throws IOException
 { 
 String s=null;
 try 
 {
         URL url = new URL("https://www.google.co.in");
         URLConnection connection = url.openConnection();
         connection.connect();   
         JOptionPane.showMessageDialog(null,"Internet Connected");   
             
  }catch (Exception e)
 {
   JOptionPane.showMessageDialog(null,"Sorry, No Internet Connection");     
 } 
 }
}