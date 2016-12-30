package com.microstrategy.dataservice.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class EndianUtil {

	public static int[] byteArrayToIntArray(byte[] b, ByteOrder order)
	{
	    if (b.length % 4 != 0)
	        throw new IllegalArgumentException("Invalid size of byte[] b");
	    
	    final ByteBuffer bb = ByteBuffer.wrap(b);
	    bb.order(order);
	    
	    int size = b.length / 4;
	    int[] ia = new int[size];
	    
	    for (int i = 0; i < size; i++)
	    {
	        ia[i] = bb.getInt();
	    }        
	    return ia;
	}
}
