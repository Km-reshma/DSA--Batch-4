class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            // Agar words[i] me x milta hai
            if (words[i].indexOf(x) != -1) {     //Agar character milta hai → indexOf(...) != -1 → index add
                result.add(i);         
            }
        }
        return result;
    }
}