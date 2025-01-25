import java.util.*;

public class TopKFrequentElements_347 {
    public static void main (String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        TopKFrequentElements_347 obj = new TopKFrequentElements_347();
        int[] result = obj.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
    //Second Approach

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> count.get(a) - count.get(b)
        );

        for (int num : count.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] resultArray = new int[heap.size()];
        int idx = 0;

        while (!heap.isEmpty()) {
            resultArray[idx++] = heap.poll();
        }
        return resultArray;
    }
    //First approach
//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> hashMap = new HashMap<>();
//
//        for (int num : nums) {
//            if (!hashMap.containsKey(num)) {
//                hashMap.put(num, 0);
//            }
//            hashMap.put(num, hashMap.get(num) + 1);
//        }
//
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
//
//        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//
//        int[] resultArray = new int[k];
//        int count = 0;
//        for (Map.Entry<Integer, Integer> entry : list) {
//            if (count < k) {
//                resultArray[count] = entry.getKey();
//            }
//            count++;
//        }
////
////        System.out.println(hashMap);
////        System.out.println(list);
//        return resultArray;
//    }
}
