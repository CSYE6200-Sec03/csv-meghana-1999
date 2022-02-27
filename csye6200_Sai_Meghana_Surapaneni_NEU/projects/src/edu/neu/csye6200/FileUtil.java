package edu.neu.csye6200;
import java.util.*;
import java.io.*;
import java.io.IOException;
// FileUtil class demonstrated reading a csv valued text file for inputing. Then file Reading is done using BufferedReader.Then try-catch block is implemented.
public class FileUtil {
public List<String> filereader(){
	final String inroot="/Users/meghana/Documents/git/csye6200_Sai_Meghana_Surapaneni_NEU/projects/src/edu/neu/csye6200/StudentIn.txt";
	List<String> lo=new ArrayList<>();
	try(BufferedReader br=new BufferedReader(new FileReader(inroot))){
		String currentline=null;
		while((currentline=br.readLine())!=null){
			lo.add(currentline);	
		}
	}
	catch(IOException e){
		e.printStackTrace();
}
	return lo;
}
}
