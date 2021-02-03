package org.bento.directory;

import java.io.File;
import java.util.List;

/**
 * Main class to run the program
 */
public class Application {

    public static void main(String[] args){

        if(args == null || args.length==0){
            System.out.println("Please provide input path.");
            return;
        }

        boolean includeHidden = (args.length > 1 && args[1].equals("true")) ? true : false;

        File directoryPath = new File(args[0]);

        if(directoryPath==null || !directoryPath.exists()){
            System.out.println("Path not found. Please give correct path.");
            return;
        }

        List<Content> contents = new DirectoryContent(directoryPath, includeHidden).getContents();
        //List of all files and directories
        System.out.println("List of files and directories in the specified directory:");
        contents.forEach(c -> System.out.println(c.toString()));
    }
}
