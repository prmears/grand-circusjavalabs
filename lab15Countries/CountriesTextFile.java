package lab15Countries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {

	private String country;
	private String countries;
	private ArrayList<String> CountriesList;
	
	
	public CountriesTextFile() {
		this("src\lab15Countries\ListOfCountries");
	}
	
	
	public List<String> readCountries() {
		List<String> country = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return country;
		}
		
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
		 
			String line = reader.readLine();
			while (line != null) {
				country.add(line);
				line = reader.readLine();
			}
			
			reader.close();
			return country;
		} catch (IOException ex) {
			throw new RuntimeException(" can't add Country", ex);
		}
	}
	
	
	public String getcountryName() 
	{
		return countryName;
	}

	public void setCounrtyName(String countryName) 
	{
		this.countryName = countryName;
	}

	public Batter(String countryName) 
	{
		this.countryName = countryName;
	
}
