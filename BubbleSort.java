package Iot_Java.day09;

public class BubbleSort {
	public static void main(String[] args) {
		int numbers [] = {2, 1, 3, 4, 6};
		// ���� �迭 numbers�� �־����ϴ�.
		// ���� �迭�� ���� ������������ �����ϱ�
		// ���ĵ� �迭�� �� ����ϱ�
		// ����� ��
		// numbers result
		// {2,1,3,4,6} {1,2,3,4,6}
		// {5,0,2,7,8} {0,2,5,7,8}
		System.out.println("\n ������ ���� ��");
		for( int i = 0; i < numbers.length; i++ ) {
			System.out.printf("%d,\t", numbers[i]);
		}
		for( int i = 0; i < numbers.length - 1; i++ ) {
			for( int j = i + 1; j < numbers.length; j++ ) {
				// �迭 ����
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i]; // ������ ��ȯ ( Swap )
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("\n ������ ���� ��");
		for( int i = 0; i < numbers.length; i++ ) {
			System.out.printf("%d,\t", numbers[i]);
				}
			}
		}
