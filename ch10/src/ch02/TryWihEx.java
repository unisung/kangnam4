package ch02;

public class TryWihEx {
  public static void main(String[] args) {
		try(FileInputStream1 fi=
				 new FileInputStream1("excel")){
		    fi.read();
			//������ ���ܹ߻�
		    throw new Exception();//���ܰ�ü ������ ȣ��
		}catch(Exception e) {
			System.out.println("���ܹ߻�");
		}
		/*
		 * finally { fi.close(); }
		 */
	}
}
