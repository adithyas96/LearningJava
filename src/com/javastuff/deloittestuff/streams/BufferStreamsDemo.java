package com.javastuff.deloittestuff.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class BufferStreamsDemo {
	public static void main(String[] args) {
		BufferedReader in = null;
		
		try{
			in = new BufferedReader(new FileReader
					("C:\\Users\\admin\\Desktop\\Adithya\\html\\stylle.css"));
			
			/*int t;
			
			while((t = in.read()) != -1){
				System.out.print((char)t);
			}	*/
			
			String input;
			
			while((input = in.readLine()) != null ){
				System.out.println(input);
			}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(Objects.nonNull(in)){
				try{
					in.close();
				}catch(IOException ioe){
					
				}
			}
		}
	}
}
