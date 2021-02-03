package org.bento.compression;

/**
 * Class to compress string
 */
public class Compressor {

    /**
     * Compress an input String by replacing subsequent duplicate characters by its count.
     * eg: aaaabbccdeeee -> a3b2c2de4
     * @param input - given string.
     * @return - compressed string.
     */
    public String compress(String input){

        if(input==null || input.length()==0) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        int pos = 0;
        int count = 0;

        while(pos < input.length() - 1) {
            count++;
            if (input.charAt(pos) != input.charAt(pos + 1)) {
                result.append(input.charAt(pos));
                appendcount(result, count);
                count = 0;
            }
            pos++;
        }
        result.append(input.charAt(pos));
        appendcount(result, count+1);
        return result.toString();
    }

    private void appendcount(StringBuilder result, int count) {
        if(count>1) {
           result.append(count);
        }
    }
}
