package ch02;

public class FileInputStream1 implements AutoCloseable{
   private String file;
   
   //������
	public FileInputStream1(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file+"�� �н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file+"�� �ݽ��ϴ�.");
	}

}
