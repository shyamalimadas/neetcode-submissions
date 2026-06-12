class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hash map to store the grouped anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each word in the input array
        for (String str : strs) {
            // Convert the word to a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // Convert the sorted character array back to a string
            String sortedStr = new String(charArray);
            
            // If the sorted string is not in the map, add it with an empty list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original word to the list corresponding to the sorted string
            map.get(sortedStr).add(str);
        }
        
        // Return the values of the map as the result
        return new ArrayList<>(map.values());
        
    }
}
