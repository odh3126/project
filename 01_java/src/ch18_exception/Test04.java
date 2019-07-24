
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
	try {
		System.out.println(1);
		Scanner sc = new Scanner(new File("a.txt"));
		System.out.println(2);
		/*
		java.lang.Object
			java.lang.Throwable
				java.lang.Exception
					java.io.IOException
						java.io.FileNotFoundException
						
		FileNotFoundException fnfe = new FileNotFoundException(..);
		IOExceptionException fnfe = new FileNotFoundException(..);
		Exception fnfe = new FileNotFoundException(..);
		Throwable fnfe = new FileNotFoundException(..);
		Object fnfe = new FileNotFoundException(..);	 
		 */
//	} catch (FileNotFoundException fnfe) {
//	} catch (IOExceptionException fnfe) {
//	} catch (Exception fnfe) {
	} catch (Throwable fnfe) {
		//catch 문에는 Throwable을 포함한 자식 클래만 올수 있다.
//	} catch (Object fnfe) {
		System.out.println(3);		
	}
	System.out.println(4);
	}
}
