package sample1;

//1부터 10까지의 합이 55가 나올 수 있도록
//class를 활용하여 작성하시오
public class Solution1 {
	
	public static void main(String[] args) {
		//
		int s = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		System.out.println(s);
		
		//
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}
