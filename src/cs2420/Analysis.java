package cs2420;

import java.io.File;
import java.nio.file.Path;

/**
 * This class contains the timing code needed to test the time complexity
 * of compressing and decompressing files based on the number of words
 * treated as symbols.
 * 
 * @author Chloe Josien & Kylee Fluckiger
 */
public class Analysis {

	public static void main(String args[]) {

		//Data reading and writing variables.
		File inFile = new File("Resources/two_cities");
		File outFileCompression = new File("Resources/two_cities_compressed");
		Path path = outFileCompression.toPath();
		File outFileDecompression = new File("Resources/two_cities_decompressed");
		
		//Timing variables.
		long startTime;
		long endTime;
		long totalTime;
		
		HuffmanTreeUsingWords huffman = null;

		//Compress A Tale of Two Cities with N number of words.
		for (int numOfWords = 1000; numOfWords < 10000; numOfWords += 1000) {
			
			huffman = new HuffmanTreeUsingWords(numOfWords);

			startTime = System.nanoTime();
			huffman.compress_file(inFile, outFileCompression);
			endTime = System.nanoTime();
			
			//Find the time to compress.
			totalTime = (endTime - startTime);
			System.out.println("Number of words: "+numOfWords +" time: " + totalTime);
		}
		
		//Decompress A Tale of Two Cities with N number of words.
		for (int numOfWords = 1000; numOfWords < 10000; numOfWords += 1000) {
			
			huffman = new HuffmanTreeUsingWords(numOfWords);

			startTime = System.nanoTime();
			huffman.decompress_file(path, outFileDecompression);
			endTime = System.nanoTime();
			
			//Find the decompression time.
			totalTime = (endTime - startTime);
			System.out.println("Number of words: "+numOfWords +" time: " + totalTime);
		}
		
	}
}
