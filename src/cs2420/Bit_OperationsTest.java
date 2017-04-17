package cs2420;

import static org.junit.Assert.*;

import java.util.BitSet;

import org.junit.Assert;
import org.junit.Test;

public class Bit_OperationsTest {

	@Test
	public void getBytesTest() {

		BitSet input = BitSet.valueOf(new byte[] {(byte) 0b10110111, (byte) 0b00000110});
		
		byte[] output = Bit_Operations.get_bytes(input);
		
		Assert.assertArrayEquals(new byte[] {(byte) 0b11101101,  (byte) 0b01100000}, output);
		
	}
	
	@Test
	public void allZeroes() {
		
		BitSet input = BitSet.valueOf(new byte[] {(byte) 0x0});
		byte[] output = Bit_Operations.get_bytes(input);
		Assert.assertArrayEquals(new byte[] {(byte) 0x0}, output);
		
	}
	
	@Test
	public void noBytes() {
		
		BitSet input = BitSet.valueOf(new byte[0]);
		byte[] output = Bit_Operations.get_bytes(input);
		Assert.assertArrayEquals(new byte[0], output);
		
	}

}
