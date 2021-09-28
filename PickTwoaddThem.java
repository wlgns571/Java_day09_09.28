package Iot_Java.day09;

public class PickTwoaddThem {
	public static void main(String[] args) {
		// ������ ��(result)���� �ߺ��� ���ڸ� ������ �����
		// ���ο� �迭(final)�� ��� ����Ͻÿ�
		// ��, ���� ������ �״�� �����ؾ���.
		int nums [] = {2, 1, 3, 4, 1};
		// �� �迭 numbers�� �־����ϴ�. numbers����
		// ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���մϴ�.
		// ���� ����� �迭�� ����ּ���
		// ����� ����ϱ�
		// ����� ��
		// [2,1,3,4,1] 
		// 2 + 1 = 3, .... 2 + 1 = 3 - 1cycle
		// 1 + 3 = 4, 1 + 4 = 5, 1 + 1 = 2 - 2cycle
		// 3 + 4 = 7, 3 + 1 = 4 - 3cycle
		// 4 + 1 = 5 - 4cycle
		// �� ������ ���� : 5
		// �������� ������ ���� : 10
		int n = nums.length - 1;
		int SIZE = ((n + 1) * n / 2);
		int [] result = new int [SIZE];
		for ( int i = 0, idx = 0; i < nums.length - 1; i++) {
			for ( int j = i + 1; j < nums.length; j++) {
				int total = nums[i] + nums[j];
				result[idx++] = total;
				// System.out.printf("%d + %d = %d\n", nums[i], nums[j], nums[i] + nums[j]);
			}
		}
		for ( int i = 0; i < result.length - 1; i++ )
			for (int j = i + 1; j < result.length; j++) {
				if ( result[i] > result[j]) {
					 int temp = result[i];
					 result[i] = result[j];
					 result[j] = temp;
					 // �迭�� ������ ����� �˾ƾ��Ѵ�.
				}
			}
		System.out.println();
		for(int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
		// [5,0,2,7]   [2,5,7,9,12]
	}
}