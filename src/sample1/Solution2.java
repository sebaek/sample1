package sample1;

public class Solution2 {
	
	// 주사위 두 수의 합이 6이 되는 경우 출력
	
	public static void main(String[] args) {
		
		for (int d1 = 1; d1 <= 6; d1++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				
//				System.out.println(d1 + "," + d2);
				
				int sum = d1 + d2;
				
				if (sum == 6) {
					System.out.println(d1 + "+" + d2 + "=" + sum);
				}
				
			}
		}
		
	}
}
