import java.util.*;

class Solution {
    public int solution(int[] A) {
        int missingInt = 0;
		    int max = A.length + 1;
		    Set set = new HashSet();
		    for (int i=0; i<A.length; i++) {
			    set.add(A[i]);
		    }
		    for (int i=1; i<=max; i++) {
			    if (!set.contains(i)) {
				    missingInt = i; break;
			    }
		    }
		  return missingInt;
    }
}
