package org.bento.directory;

import java.io.File;
import java.util.List;

/**
 * Main application class to run the program
 */
public class Application {

    public static void main(String[] args){

        if(args == null || args.length==0){
            System.out.println("Please provide input path.");
            return;
        }

        File directoryPath = new File(args[0]);

        if(directoryPath==null || !directoryPath.exists()){
            System.out.println("Path not found. Please give correct path.");
            return;
        }

        // check whether to display hidden files within the directory
        boolean includeHidden = args.length > 1 && "true".equalsIgnoreCase(args[1]);

        List<Content> contents = new DirectoryContent(directoryPath, includeHidden).getContents();

        //List of all files and directories
        System.out.println("List of files and directories in the specified directory:");
        contents.forEach(c -> System.out.println(c.toString()));
    }
}
