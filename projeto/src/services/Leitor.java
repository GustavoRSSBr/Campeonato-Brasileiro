package services;

import java.io.IOException;
import java.util.List;

public interface Leitor <T> {
	
	public List<T> ler(String filePath) throws IOException;

}
