import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// �Է� �޴� �κ�
		
		Scanner scan = new Scanner(System.in);
		
		int N, K;
		
		
		N = scan.nextInt();
		K= scan.nextInt();
		
		int[] array = new int[N];
		
		for (int i=0; i<N; i++) {
			array[i]= scan.nextInt();
			/*
			if (array[i]%array[i-1] != 0) {
				System.out.println("�����Դϴ�.");
			}
			*/
		}
		
		
		
		// ó���ϴ� �κ�
		int result=0;
		int mock=0;
		
		while(true) {
			N=N-1;
			mock = K/array[N];
			result+=mock;
			K=K%array[N];
			if (N==0) break;

		}
		
		System.out.println(result);

		
	}

}
