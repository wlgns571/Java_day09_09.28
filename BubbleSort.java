package Iot_Java.day09;

public class BubbleSort {
	public static void main(String[] args) {
		int numbers [] = {2, 1, 3, 4, 6};
		// 정수 배열 numbers가 주어집니다.
		// 정수 배열의 값을 오름차순으로 정렬하기
		// 정렬된 배열의 값 출력하기
		// 입출력 예
		// numbers result
		// {2,1,3,4,6} {1,2,3,4,6}
		// {5,0,2,7,8} {0,2,5,7,8}
		System.out.println("\n 데이터 정렬 전");
		for( int i = 0; i < numbers.length; i++ ) {
			System.out.printf("%d,\t", numbers[i]);
		}
		for( int i = 0; i < numbers.length - 1; i++ ) {
			for( int j = i + 1; j < numbers.length; j++ ) {
				// 배열 정렬
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i]; // 데이터 교환 ( Swap )
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("\n 데이터 정렬 후");
		for( int i = 0; i < numbers.length; i++ ) {
			System.out.printf("%d,\t", numbers[i]);
				}
			}
		}
