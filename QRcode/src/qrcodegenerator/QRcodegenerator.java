package qrcodegenerator;

import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;


import net.glxn.qrgen.*;
import net.glxn.qrgen.image.*;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRcodegenerator {

	public static void main(String[] args) throws Exception {
		
		String text = "Hello! Myself Pallab. Welcome to my QRcode generator GitHub page. Follow everywhere @bagpallab7";
		ByteArrayOutputStream out = QRCode.from(text).to(ImageType.JPG).stream();
		
		File f = new File("C:\\Users\\Pallab\\Desktop\\QRcode\\Your-QRcode.jpg");
		FileOutputStream fos =new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();

	}

}
