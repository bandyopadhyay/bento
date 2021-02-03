package org.bento.directory;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Finds and return all the contents in directory
 */
public class DirectoryContent {

    private boolean includeHidden;
    private List<Content> contents;
    private File directoryPath;

    /**
     * Constructor
     * @param directoryPath - path of the directory. Cannot be null/invalid
     * @param includeHidden - if true returns hidden file as well
     */
    public DirectoryContent(File directoryPath, boolean includeHidden) {
        validatePath(directoryPath);
        this.directoryPath = directoryPath;
        this.includeHidden = includeHidden;
    }

    /**
     * Return the content of the directory sorted in ascending order of size.
     * @return
     */

    public List<Content> getContents(){
        contents= new ArrayList<>();
        readDir(directoryPath);
        contents.sort(Comparator.comparing(Content::getSize));
        return contents;
    }

        private void readDir(File file) {
            if(file.isDirectory()){
                File[] allFilles = file.listFiles();
                for(File f: allFilles) {
                    readDir(f);
                }
            } else {
                if(includeHidden || !file.isHidden()) {
                    contents.add(mapToContent(file));
                }
            }
    }

    private Content mapToContent(File file) {
        Content content = new Content();
        content.setFileName(file.getName());
        content.setFullPath(file.getAbsolutePath());
        content.setSize(file.length());
        return content;
    }

    private void validatePath(File directoryPath) {
        if (directoryPath == null) {
            throw new IllegalArgumentException("directoryPath cannot be null.");
        }
        if(directoryPath.isDirectory()){
            throw new IllegalArgumentException("Not a valid directory path.");
        }
    }
}
