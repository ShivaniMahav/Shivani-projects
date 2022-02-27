package com.shivani.service;
import java.io.*;
import java.net.*;
public class Service 
{

public void webPage ()
{
	    URL Webpage = null;
    	URLConnection conn= null;
	 try 
	{
		Webpage = new URL("https://www.google.com");
		conn= Webpage.openConnection();
		InputStreamReader reader = new InputStreamReader(conn.getInputStream(),"UTF8");
		BufferedReader buffer= new BufferedReader(reader);
		String line= "";
		while(true) 
		{
			   line = buffer.readLine();
			   if(line!=null)
		    {
			   PrintStream myConsole = new PrintStream(new File("E://web-content.txt"));
		       System.setOut(myConsole);
			   myConsole.print(line);
		    }
		        else 
		    {
			    break;
		    }
		}	
	}
            catch (Exception e)
           {
	          e.printStackTrace();
	       }
	
}
}
