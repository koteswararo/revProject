import java.io.*;
class copy1{
public static void main(String[] ar){
InputStream in=null;
OutputStream out=null;

try{
	in=new FileInputStream("input.txt");
	out=new FileOutputStream("output1.txt"); 
	int C;
	while((C=in.read())!= -1){
	out.write(C);
	}
        }catch(IOException e){}
	
	
	}
