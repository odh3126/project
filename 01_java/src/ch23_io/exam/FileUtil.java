package ch23_io.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {

	public static void copy(String ori, String dest) throws Exception {
		File dFile = new File(dest);
		if (dFile.isDirectory()) {
			File oFile = new File(ori);
			dest += "/" + oFile.getName();
		} else {
			File dir = new File(dFile.getParent());
			dir.mkdirs();
		}

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(ori);
			fos = new FileOutputStream(dest);
			while (true) {
				int ch = fis.read();
				if (ch == -1)
					break;

				fos.write(ch);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
			}
			try {
				fos.close();
			} catch (Exception e) {
			}
		}
	}
}
