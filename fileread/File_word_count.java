
package fileread;

import counting_total_word.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class File_word_count {
    
    
    public static void main(String[] args) throws Exception {
        String line;
        int word_cnt=0;
        
        FileReader file =new FileReader("D:\\Java_OOP\\Java_file\\src\\java_file\\test.html");
        BufferedReader br= new BufferedReader(file);
        
        while((line=br.readLine())!=null)
        {
            String words[]=line.split("");
            word_cnt+=words.length;
            
        }
        System.out.println("Number of words in the file :"+word_cnt);
    }
}
