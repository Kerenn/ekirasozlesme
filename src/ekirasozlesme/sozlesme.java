package ekirasozlesme;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class sozlesme {
	 public static void saveFilee(URL url, String file) throws IOException {
	        System.out.println("opening connection");
	        InputStream in = (InputStream) url.openStream();
	        FileOutputStream fos = new FileOutputStream(new File(file+".json"));

	        System.out.println("reading file...");
	        int length = -1;
	        byte[] buffer = new byte[1024];// buffer for portion of data from
	        // connection
	        while ((length = in.read(buffer)) > -1) {
	            fos.write(buffer, 0, length);
	        }


	        fos.close();
	        in.close();
	        System.out.println("file was downloaded");
	    }

	    public static void main(String args[])
	    {
	        try
	        {
	        	
	             URL url = new URL("https://api.typeform.com/v1/form/iD0XXO?key=23f005b609ccd78a8340319ae6a4123bb54204ba");
	             String fileName = "C:/Users/eren/workspace/ekirasozlesme/sozlesme";
	             saveFilee(url,fileName);
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	

}





