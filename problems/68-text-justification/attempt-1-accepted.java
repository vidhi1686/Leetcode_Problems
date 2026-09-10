
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            // Find how many words can fit in this line
            int j = i;
            int lineLength = 0;

            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int numberOfWords = j - i;
            int spaces = maxWidth - lineLength;

            // Last line
            if (j == words.length || numberOfWords == 1) {

                String line = "";

                for (int k = i; k < j; k++) {

                    line = line + words[k];

                    if (k < j - 1) {
                        line = line + " ";
                    }
                }

                while (line.length() < maxWidth) {
                    line = line + " ";
                }

                result.add(line);
            }

            // Normal line
            else {

                int gaps = numberOfWords - 1;

                int spacesPerGap = spaces / gaps;
                int extraSpaces = spaces % gaps;

                String line = "";

                for (int k = i; k < j; k++) {

                    line = line + words[k];

                    if (k < j - 1) {

                        // Normal spaces
                        for (int x = 0; x < spacesPerGap; x++) {
                            line = line + " ";
                        }

                        // Extra spaces go to the left
                        if (extraSpaces > 0) {
                            line = line + " ";
                            extraSpaces--;
                        }
                    }
                }

                result.add(line);
            }

            i = j;
        }

        return result;
    }
}

