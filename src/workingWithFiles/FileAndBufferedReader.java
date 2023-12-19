package workingWithFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAndBufferedReader {

	public static void main(String[] args) {
		
		String path = "/home/rogerfsl/Documentos/Java/Curso Nelio/CursoBasico/in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);//é instanciado a partir do FileReader.
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error! " + e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
