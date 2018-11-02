package hash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

 
public class Md5 { 
	public static void main(String args[]) throws NoSuchAlgorithmException, IOException { 
    	
    	ArrayList<String> hashes = new ArrayList<String>();//jashes
    	ArrayList<String> results = new ArrayList<String>();//dictionary
    	
    	File file = new File("D:/Eclipse/eclipse/Workspace/hash/pass.txt"); 
    	File file1 = new File("D:/Eclipse/eclipse/Workspace/hash/results.txt"); 
    	 
    	BufferedReader br = new BufferedReader(new FileReader(file)); 
    	BufferedReader br1 = new BufferedReader(new FileReader(file1));
    	  
    	String st = null; 
        while ((st = br.readLine()) != null) 
        hashes.add(st.split(" ")[0].toString()); 
    	
    	String st1 = null;     
        while ((st1 = br1.readLine()) != null)
        	results.add(st1);      
     	
        boolean exist = false;
        String hash;
        String pass;
        for(int i = 0; i<hashes.size(); i++){
        	 for(int j = 0; j<hashes.size(); j++){
        		 hash = results.get(j).split(" ")[0];
        		 
        		 if(hashes.get(i).equals(hash)){        			
        			 pass = results.get(j).split(" ")[1];
        			 System.out.println("MD5 Hash: " +hashes.get(i) +" --> Password: " +pass);
        			 exist = true;
        			 break;
        		 }
        		 else
        			 exist = false;        		 
        	 }
        	 if(!exist)
        		 System.out.println("The Hash: " +hashes.get(i) +" doesn't exist");
        }       
    } 
}
