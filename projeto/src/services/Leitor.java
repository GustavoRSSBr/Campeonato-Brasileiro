package services;

import java.io.IOException;
import java.util.List;

public interface Leitor {
	
	public List<String[]> ler(String filePath) throws IOException;

}
