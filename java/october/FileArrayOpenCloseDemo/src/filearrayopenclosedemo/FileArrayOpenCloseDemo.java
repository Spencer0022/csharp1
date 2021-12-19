/*
CH11P6
FileArray Class
Spencer Folgate
JDK Version 1.8
11-20-21
 */
package filearrayopenclosedemo;
import java.io.*;
public class FileArrayOpenCloseDemo {

    public static void main(String[] args) throws IOException{
        char array1[]={'a','b','c','d','e','f'};
        
//            FileOutputStream fstream=new FileOutputStream("Info.dat");
//            DataOutputStream outputFile=new DataOutputStream(fstream);
        
            RandomAccessFile outputFile=new RandomAccessFile("Info1.dat","rw");
            outputFile.seek(0);
            for (int i=0;i<array1.length;i++){
                outputFile.writeInt(array1[i]);
            }
            outputFile.close();
            
           RandomAccessFile outputFile2=new RandomAccessFile("Info1.dat","r");
           outputFile2.seek(0);
           System.out.println(outputFile2.readByte());
        
            
        
    }
}
    

