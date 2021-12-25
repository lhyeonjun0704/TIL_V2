package DataInOutStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos1 = new FileOutputStream("C:/Users/ih919/Desktop/data1.txt");
		DataOutputStream dos1 = new DataOutputStream(fos1);
		
		// int, char �� ���� �⺻ �ڷ����� Byte ��Ʈ������ ����°���
		dos1.writeInt(35); // ���Ͽ��� 4����Ʈ Ȯ���Ͽ� 10���� 35�� ���Ͽ� 2������ �ְ�
		
		dos1.writeDouble(Double.MAX_VALUE); // 8����Ʈ�� ������
		dos1.writeByte(Byte.MIN_VALUE);
		dos1.writeChar('��'); // utf�̱� ������ 2����Ʈ�� ���� ���̴�.
		dos1.writeBoolean(false);
		
		dos1.writeUTF("��� is horse");
		dos1.close();
		fos1.close();
		
		FileInputStream fis1 = new FileInputStream("C:/Users/ih919/Desktop/data1.txt");
		DataInputStream dis1 = new DataInputStream(fis1);
		
		System.out.println(dis1.readInt() + "\t" + dis1.readDouble());
		System.out.println(dis1.readByte() + "\t" + dis1.readChar());
		System.out.println(dis1.readBoolean() + "\t" + dis1.readUTF());
		dis1.close(); fis1.close();
		
	}

}
