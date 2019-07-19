package ch09_string.exam;

import java.util.Arrays;
public class Sub02 {
	//             "홍길동:22:서울특별시 마포구", ":"
	String[] split(String data, String comp) {
		String[] temp = new String[data.length()];
		int pos = 0;
		while (true) {
			int sIndex = data.indexOf(comp);
			if (sIndex == -1) {
				temp[pos++] = data;
				break;
			}
			temp[pos++] = data.substring(0, sIndex);
			data = data.substring(sIndex + 1);
		}
		return Arrays.copyOfRange(temp, 0, pos);
	}	
}


