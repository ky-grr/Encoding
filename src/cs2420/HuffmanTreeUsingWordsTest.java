package cs2420;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;

import org.junit.Test;

public class HuffmanTreeUsingWordsTest {

//	@Test
//	public void testCompute_most_common_word_symbols() {
//		
//		File file = new File("Resources/constitution");
//		
//		//Create the ArrayList buffer of Characters.
//		ArrayList<Character> buffer = HuffmanTreeUsingWords.read_file(file);
//		
//		Hashtable<String, Node> words = HuffmanTreeUsingWords.compute_most_common_word_symbols(buffer, 6);
//		
//		System.out.println(words);
//	}
	
	@Test
	public void readFileHeaderWithSymbolFrequencys(){
		
		Path path = Paths.get("Resources/a_few_letters");
		try {
			byte [] data =Files.readAllBytes(path);
			ByteBuffer byteBuffer = ByteBuffer.wrap(data);
			System.out.println(data);
			Hashtable<String, Node> table = HuffmanTreeUsingWords.read_file_header_with_symbol_frequencies(byteBuffer);
		
			System.out.println(table);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}