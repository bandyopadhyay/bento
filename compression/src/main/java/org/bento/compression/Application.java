package org.bento.compression;


/**
 * Main class to run the program
 */
public class Application {

    public static void main(String[] args){

        if(args == null || args.length==0){
            System.out.println("Please provide input String.");
            return;
        }

        System.out.println("Compressed String : " + new Compressor().compress(args[0]));
    }
}
