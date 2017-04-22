package cs2420;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;

/**
 * This Junit test suite contains methods to test our HuffmanTreeUsingWords class.
 * The function names are self-explanatory, and can be commented or uncommented
 * to print helpful debugging information.
 * 
 * @author Kylee Fluckiger & Chloe Josien
 */
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
		
		HuffmanTreeUsingWords tree = new HuffmanTreeUsingWords(10);
		
		Path path = Paths.get("Resources/a_few_letters");
		
		tree.compress_file(path.toFile(), new File("Resources/output"));
		tree.decompress_file(Paths.get("Resources/output"), new File("Resources/decompressed"));	
	}
	
//	//Debugger variable view shows that everything is arranged as it should be; dotview is broken.
//	@Test
//	public void dotFileTest() {
//		
//		Node root;
//		
//		List<String> ordered_list_of_symbols = new ArrayList<>();
//
//		Hashtable<String, Node> top_words;
//		Hashtable<String, Node> all_symbols; 
//
//		ArrayList<Character> buffer  = HuffmanTreeUsingWords.read_file(new File("Resources/a_few_letters"));
//			
//		top_words   = HuffmanTreeUsingWords.compute_most_common_word_symbols(buffer, 10);
//		all_symbols = HuffmanTreeUsingWords.compute_remaining_single_character_symbols(buffer, top_words, ordered_list_of_symbols);
//
//		root = HuffmanTreeUsingWords.create_tree( all_symbols.values() );
//		
//		System.out.println(root.createDot());
//	}
//	
//	@Test
//	public void determine_bit_pattern_for_symbolTest() {
//		
//		Node root;
//		
//		List<String> ordered_list_of_symbols = new ArrayList<>();
//
//		Hashtable<String, Node> top_words;
//		Hashtable<String, Node> all_symbols; 
//
//		ArrayList<Character> buffer  = HuffmanTreeUsingWords.read_file(new File("Resources/a_few_letters"));
//			
//		top_words   = HuffmanTreeUsingWords.compute_most_common_word_symbols(buffer, 10);
//		all_symbols = HuffmanTreeUsingWords.compute_remaining_single_character_symbols(buffer, top_words, ordered_list_of_symbols);
//
//		root = HuffmanTreeUsingWords.create_tree( all_symbols.values() );
//		
//		System.out.println(HuffmanTreeUsingWords.determine_bit_pattern_for_symbol(root.right.left.right.right));
//	}

}