package ch03_Map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//������Ƽ�� ��ü ����
		Properties properties = new Properties();
		//���� ��� ���
		String path 
		  = PropertiesEx.class.getResource("test.properties").getPath();
		 System.out.println(path);
		 //���ڼ� ����
		 path = URLDecoder.decode(path,"utf-8");
		 //~.properties���Ϸκ��� Properties��ü�� ���� �о���̱� load(�����Է½�Ʈ��);
		 properties.load(new FileReader(path));
		 //properties�κ��� �� ��� getProperties(Ű);
		 String db=properties.getProperty("db");
		 System.out.println(db);
		 String user=properties.getProperty("user");
		 System.out.println(user);
	}
}