package jp.co.aforce.lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		try(Reader reader = new FileReader("src/jp/co/aforce/lib/input.csv")){
		    BufferedReader br = new BufferedReader(reader);
			
		    int i = 0;
		    String line;
		    
		    while((line = br.readLine()) != null) {
		    	//一行目は除外するためcontinue
		    	if(i == 0) {
		    		i++;
		    		continue;
		    	}
		    	String[] datas = line.split(",", 0);
		    	Person person = new Person();
		    	person.setId(Integer.parseInt(datas[0]));
		    	person.setName(datas[1]);
		    	person.setGender(datas[2]);
		    	person.setAge(Integer.parseInt(datas[3]));
		    	person.setProfession(datas[4]);
		    	persons.add(person);
		    }
		}catch(IOException e) {
			e.printStackTrace();
		}
		for(Person person : persons) {
			person.getInformation();
		}
		
	}
}