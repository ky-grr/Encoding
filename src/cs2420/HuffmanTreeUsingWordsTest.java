package cs2420;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;

import org.junit.Test;

public class HuffmanTreeUsingWordsTest {

	@Test
	public void testCompute_most_common_word_symbols() {
		
		File file = new File("Resources/constitution");
		
		//Create the ArrayList buffer of Characters.
		ArrayList<Character> buffer = HuffmanTreeUsingWords.read_file(file);
		
		Hashtable<String, Node> words = HuffmanTreeUsingWords.compute_most_common_word_symbols(buffer, 6);
		
		System.out.println(words);
	}

}
