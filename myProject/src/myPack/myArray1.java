
package myPack;

public class myArray1 {

	public static void main(String[] args) {
		// ����		����			�ʱ�ȭ
		int b[] = new int[]{10,20,30,40,50}; // �迭 ����, ����, �ʱ�ȭ �� �� ������ �� �ٷ�(�� ��� �������� ���� ���� X)
		
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]+5); // �ٹٲ����� ����
		}
		
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+5);
			System.out.print(' '); // �������� ����
		}
		
		System.out.println();
		
		// �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
		String c[] = new String[10];
		c[0] = "���̸�";
		c[1] = "������";
		c[3] = "�̼���";
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]); // String �迭�� �⺻���� null
		}
		
		int f[][] = {{0,0,0,0,0,0,0,0},
					 {0,1,1,1,1,1,1,0},
					 {0,0,0,1,3,1,0,0},
					 {0,1,0,1,0,0,0,1},
					 {0,1,0,1,1,1,1,1},
					 {0,1,0,0,0,0,0,0},
					 {0,1,0,1,1,1,1,1},
					 {2,0,0,1,1,1,1,1}};
		for(int i=0; i<f.length; i++){
			for(int j=0; j<f[i].length; j++){
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
		
	}

}
