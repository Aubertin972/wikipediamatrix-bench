package fr.univrennes1.istic.wikipediamatrix;
import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Document doc = null;
		try {
			doc = Jsoup.connect("https://en.wikipedia.org/wiki/Comparison_of_Canon_EOS_digital_cameras").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// select les elements 
		Elements tableau = doc.select("tr");
		Elements tab = tableau.select("tr");
		Elements essao =  doc.getElementsByTag("tr");
		System.out.println(essao);

	
		/*for (Element ele : tab) {
			System.out.println(ele);
			
		}*/
		//System.out.println(tableau2);
		//String table = parcourir(test);
		//System.out.println(table.charAt(2));
    }
    
    
    
    
    
    
  /*  public void toCSV(String filePath) {
    	 // first create file object for file placed at location 
        // specified by filepath 
        File file = new File(filePath); 
        try { 
            // create FileWriter object with file as parameter 
            FileWriter outputfile = new FileWriter(file); 
      
            // create CSVWriter object filewriter object as parameter 
            CSVWriter writer = new CSVWriter(outputfile); 
      
            // adding header to csv 
            String[] header = { "Name", "Class", "Marks" }; 
            writer.writeNext(header); 
      
            // add data to csv 
            String[] data1 = { "Aman", "10", "620" }; 
            writer.writeNext(data1); 
            String[] data2 = { "Suraj", "10", "630" }; 
            writer.writeNext(data2); 
      
            // closing writer connection 
            writer.close(); 
        } 
        catch (IOException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
    }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   public static String toCSV(String tableau) {
    	int x =0;
    	int nombreCol = 0;
    	while (tableau.substring(x, x+4).compareToIgnoreCase("<tr>")==0) {
    		x++ ; // ici on va directement de tbody a la 1ere cellule
    	}
    	while (tableau.substring(x, x+5).compareToIgnoreCase("</tr>")==0) {
    		// on va recuperer toutes les colonnes 
    		if (tableau.substring(x, x+4).compareToIgnoreCase("<th>")==0) {
    			x =x+4;
    		}
    		
    	}
    }

         public static String parcourir(String valeur) {
         String result = "";
         for (int x=0; x<valeur.length(); x++)
             {
        	 
        	 	if (valeur.substring(x, x+6).compareToIgnoreCase("<tbody")==0) 
        	 	{
        	 		for( int k=x ; k<valeur.length();k++) {
        	 			
        	 			if (valeur.substring(k, k+7).compareToIgnoreCase("</table")==0) {
        	 				return(result);
        	 			}
        	 			result = result + valeur.charAt(x);
        	 		}
        	 	}
             
             
             
             }
         return(result);

           }
           
    
    
}




