package com.shivani.test;
 
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.junit.jupiter.api.Test;
import com.shivani.service.Service;

public class Junit
{
      @Test
	  public void test() throws FileNotFoundException
	{
		   Service s = new Service();
		   s.webPage();
		   FileReader  File = new FileReader("E://web-content.txt");
		   assertNotNull(File);
	}

}

