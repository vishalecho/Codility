import java.util.*;
import java.util.Map.*;
import java.io.*;

class Solution {
    public int solution(int[] A) {
        return findOddOccurrencesInArray(A);
    }
    
    public int findOddOccurrencesInArray(int[] arr) {
        int size = arr.length;
		if (size == 1) {
			return arr[0];
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<size; i++) {
			if (!map.containsKey(Integer.valueOf(arr[i]))) {
				map.put(Integer.valueOf(arr[i]), 1);
			} else {
				map.put(Integer.valueOf(arr[i]), map.get(arr[i])+1);
			}
		}
		int result = 0;
		for (Entry<Integer, Integer> entry : map.entrySet() ) {
			if (entry.getValue() % 2 != 0) {
				result = entry.getKey();
				break;
			}
		}
	    return result;
    }
}
