package org.bento.directory;

/**
 * Class to Store Single Content Information
 */
public class Content {

    private String fileName;
    private Long size;
    private String fullPath;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getSize() {
        return size;
    }

    public Double getSizeInKB() {
        return (double)size/1024;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    /**
     * Returns the content in formatted String
     * @return
     */
    @Override
    public String toString() {
        return "Name = " + fileName +
                ", Size = " + getSizeInKB() +
                " KB, Path = '" + fullPath + "'"
                ;
    }
}
