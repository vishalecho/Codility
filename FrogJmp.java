class Solution {
    public int solution(int x, int y, int d) {
      int distanceToJump = y - x;
		  int jumpsRequired  = distanceToJump / d;
		  if (distanceToJump % d != 0) jumpsRequired++;
		  return jumpsRequired;
    }
}
