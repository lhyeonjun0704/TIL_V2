package ImageOIFile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageIOFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("C:/Users/ih919/Desktop/코딩/test.jpg");
		BufferedImage buffimage1 = ImageIO.read(file1);
		
		File file2 = new File("C:/Users/ih919/Desktop/코딩/test.jpg");
		ImageIO.write(buffimage1, "jpg", file2);
		System.out.println("이미지 저아됨");
		
		File file3 = new File("C:/Users/ih919/Desktop/코딩/test.jpg");
		ImageIO.write(buffimage1, "gif", file3);
		System.out.println("이미지 저장됨");
		
		File file5 = new File("C:/Users/ih919/Desktop/코딩/test.jpg");
		ImageIO.write(buffimage1, "png", file5);
		System.out.println("png 저장");
	}

}
