package jp.co.aforce.steram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
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
		
		//練習問題１
		List<Person> persons_sort = persons;
		persons_sort.stream().
			sorted(Comparator.comparing(Person::getAge)).
			forEach(person -> System.out.println(
					"ID："+person.getId()+" 名前："+person.getName()+" 性別："+person.getGender()+
					" 年齢："+person.getAge()+" 職業："+person.getProfession()
		));
		
		System.out.println();
		
		//練習問題２
		List<Person> person_filter = persons;
		person_filter.stream().
			filter(person -> person.getGender().equals("男")).
			forEach(person -> System.out.println(
					"ID："+person.getId()+" 名前："+person.getName()+" 性別："+person.getGender()+
					" 年齢："+person.getAge()+" 職業："+person.getProfession()
					));
		
		System.out.println();
		
		//練習問題３
		Path file = Paths.get("src/jp/co/aforce/lib/input.csv");
		Files.lines(file).forEach(System.out::println);
	}
}
