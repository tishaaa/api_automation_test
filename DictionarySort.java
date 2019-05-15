package practice;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionarySort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  FileInputStream fin=new FileInputStream("G:\\alice.txt");    
          int i ,j;
          String t;
         String filecontent = "";
         while((i=fin.read())!=-1){ 
        	  char ch = (char)i;
        	  filecontent = filecontent + ch;
            
          }
          
         // System.out.println(filecontent.substring(0, 100));
        String [] arrOfStr = filecontent.trim().replaceAll("(\\t+|\\r?\\n)+", " ").replaceAll(" +", " ").replaceAll("\\s*\\p{Punct}+\\s*", "").split(" ");
        System.out.println(arrOfStr.length);
        for(i=0;i<arrOfStr.length;i++)
        {    
        	arrOfStr[i]=arrOfStr[i].toLowerCase();
        	
        }
        Arrays.sort(arrOfStr); 
        
      /*  for(i=0;i<2000;i++)
        {   
        	System.out.println(arrOfStr[i]);
        }*/
        
        PrintWriter writer = new PrintWriter("G:\\alice_dict.txt");
        Map<String, Integer> freq = new HashMap<String, Integer>();
        
        for(i=0;i<arrOfStr.length;i++)
        {   
        	writer.println(arrOfStr[i]);
        	
        	if(freq.containsKey(arrOfStr[i])) {
        		freq.put(arrOfStr[i], freq.get(arrOfStr[i]) + 1);
        	} else {
        		freq.put(arrOfStr[i], 1);
        	}
        }
        int max=0;
        String most = "";
        Set<String> keys = freq.keySet();
        for(String key: keys){
            if(max < freq.get(key)) {
            	max = freq.get(key);
            	most = key;
            }
        }

        System.out.println(most + " : " + max);
        writer.close();
	}

	}
