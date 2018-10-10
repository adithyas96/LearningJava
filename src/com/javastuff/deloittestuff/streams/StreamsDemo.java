package com.javastuff.deloittestuff.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class StreamsDemo {
	public static void main(String[] args) {
			
		FileInputStream in = null;
		FileOutputStream out = null;
			try{
				in = new FileInputStream("C:\\Users\\admin\\Desktop\\Adithya\\html\\test.html");
				
				out = new FileOutputStream("C:\\Users\\admin\\Desktop\\Adithya\\html\\test1.html");
				
				int t;
				while((t = in.read()) != -1){
					System.out.print((char) t);
					out.write(t);
				}
				
			
			}catch(FileNotFoundException fnfe){
				
			}catch(IOException ioe){
				System.out.println("Error in reading file");
			}finally{
				if(in != null){
					try{
						in.close();
					} catch (IOException e){
						
					}
				}	
				if(Objects.nonNull(out)){
					try{
						out.close();
					}catch(IOException e){
						
					}
				}
			}
			
	}
}
