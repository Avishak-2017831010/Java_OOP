/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;

import counting_total_word.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Avi
 */
public class creating_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        File file =new File("D:\\Java_OOP\\Java_file\\src\\java_file\\test.html");
        
       FileWriter writer= new FileWriter(file);
       writer.write(
               "<!DOCTYPE/>\n" +
               "<html>\n" +
               "\n" +
               "\n" +
               "<body>\n" +
               "\n" +
               "\n" +
               "\"Around 100 million years of darkness.\n" +
               "\n" +
               "When the cosmos eventually lit up its very first stars, they were bigger and brighter than any that have followed. They shone with UV light so intense, it turned the surrounding atoms into ions. The Cosmic Dawn -- from the first star to the completion of this 'cosmic reionization', lasted roughly one billion years.\n" +
               "\n" +
               "\"Where did these stars come from? And how did they become the galaxies -- the Universe teeming with radiation and plasma -- that we see today? These are our driving questions,\" says Professor Michael Norman, Director of the San Diego Supercomputer Center and lead author of a new review published in Frontiers in Astronomy and Space Sciences.\n" +
               "\n" +
               "The Universe in a Box\n" +
               "\n" +
               "Researchers like Professor Norman solve mathematical equations in a cubic virtual universe.\n" +
               "\n" +
               "\"We have spent over 20 years using and refining this software, to better understand the Cosmic Dawn.\"\n" +
               "\n" +
               "To start, code was created which allowed formation of the first stars in the universe to be modeled. These equations describe the movement and chemical reactions inside gas clouds in a universe before light, and the immense gravitational pull of a much larger but invisible mass of mysterious dark matter.\n" +
               "\n" +
               "\"These clouds of pure hydrogen and helium collapsed under gravity to ignite single, massive stars -- hundreds of times heavier than our Sun,\" explains Norman.\n" +
               "\n" +
               "The very first heavy elements formed in the pressure-cooker cores of the first stars: just a smidgen of lithium and beryllium. But with the death of these short-lived giants -- collapsing and exploding into dazzling supernovae -- metals as heavy as iron were created in abundance and sprayed into space.\n" +
               "\n" +
               "\n" +
               "</body>\n" +
               "</html>\n" +
               "\n");
       
       writer.close();
       
        
        
        
        
    }
    
}
