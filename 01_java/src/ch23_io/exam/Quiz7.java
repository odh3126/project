/**
data 폴더 하위의 파일들의 정보를 아래와 같이 출력되도록 프로그램을 작성하시오 
(아래의 파일들은 단순한 예시입니다.)

data 폴더 하위의 구조
------------------------------
a.txt
day08
      test04.txt
day09
      quiz02.txt
      stream.txt
day13
      quiz02.txt
      quiz06.txt
day14
      a.txt
      a1.txt
      b.txt
      Kalimba.mp3
      Kalimba1.mp3
      Kalimba2.mp3
      lec01
            quiz
            	  Quiz01.java
            	  Quiz02.java
      Test.java  	
------------------------------
 */
package ch23_io.exam;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class Quiz7 {
	private static ArrayList<String> list = new ArrayList<String>(); 


		public static void main(String[] args) throws IOException {



	        String message = null;

	        String filePath = ".";

	        File path = new File( filePath );

	        

	        if( path.exists() == false ){

	            System.out.println("경로가 존재하지 않습니다");

	        }

	        File[] fileList = path.listFiles();

	        

	        int tab = 1;

	        for( int i = 0 ; i < fileList.length ; i++ ){

	            if( fileList[ i ].isDirectory() ){

	                message = "[디렉토리] ";

	                message += fileList[ i ].getName();

	                System.out.println( message );

	                subDirList(  fileList[ i ].getName(), tab);

	               

	                Collections.reverse(list); 

	                

	                for(String str:list) {

	                	System.out.println(str);

	                }

	                

	                list.clear();

	                                             

	            }else{

	                message = "[파일] ";

	                message += fileList[ i ].getName();

	                System.out.println( message );

	            }

	            

	        }

	        

	    } 

		

		private static void subDirList(String source, int tab){

			File dir = new File(source); 

			File[] fileList = dir.listFiles(); 

			  

			String sTab = "";

			for ( int i =0 ; i < tab ; i++){

				sTab +="\t";

			}

			

			

			try{

				for(int i = 0 ; i < fileList.length ; i++){

					File file = fileList[i]; 

					if(file.isFile()){

	    // 파일이 있다면 파일 이름 출력

						if( i==0 ){

							//System.out.println("[디렉토리 이름] = " + dir.getPath()   );

							list.add("[디렉토리 이름1] = " + dir.getPath() ) ;

						}

						//System.out.println(sTab + " 파일 이름 = " + file.getName());

						list.add(sTab + " 파일 이름 = " + file.getName() );

						

					}else if(file.isDirectory()){ 

						

						

	    // 서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색

						subDirList(file.getCanonicalPath().toString(),tab+1);

						list.add("[디렉토리 이름2] = " + dir.getPath() );

						//System.out.println("[디렉토리 이름] = " + dir.getPath()   );

						

					}

				}

			}catch(IOException e){

				

			}

			 

		}





	}
