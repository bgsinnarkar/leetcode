/***********************************************

Time Complexity : O(m * n) m is length of word, n is total no of words in list
Space Complexity : O(m * n)

https://leetcode.com/problems/word-ladder/

https://www.youtube.com/watch?v=M9cVl4d0v04

***********************************************/

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> set = new HashSet();
        
        for(String word : wordList) {
            set.add(word);
        }
        
        if(!set.contains(endWord))
            return 0;
        
        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int level = 1;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                char[] charWord = currentWord.toCharArray();
                for(int j = 0; j < charWord.length; j++) {
                    char originalChar = charWord[j];
                    for(char c = 'a'; c <= 'z'; c++) {
                        if(charWord[j] == c)
                            continue;
                        charWord[j] = c;
                        String newWord = String.valueOf(charWord);
                        if(endWord.equals(newWord))
                            return level + 1;
                        else if(set.contains(newWord)) {
                            queue.offer(newWord);
                            set.remove(newWord);
                        }
                    }
                    charWord[j] = originalChar;
                }
            }            
            
            level++;
        }
        
        return 0;
    }
}