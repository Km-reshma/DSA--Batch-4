import java.util.*;

class Pair {
    int key;
    int freq;

    Pair(int key, int freq){
        this.key = key;
        this.freq = freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Min Heap (based on frequency)
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.freq - b.freq
        );

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Add to heap
        for(int element : map.keySet()){
            pq.add(new Pair(element, map.get(element)));

            if(pq.size() > k){
                pq.poll();  // remove smallest freq
            }
        }

        // Step 3: Build answer
        int[] ans = new int[k];
        int i = 0;

        while(!pq.isEmpty()){
            ans[i] = pq.poll().key;
            i++;
        }

        return ans;
    }
}