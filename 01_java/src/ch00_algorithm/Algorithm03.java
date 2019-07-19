/*
설명>

I M N            
모든 픽셀이 흰색(O)으로 칠해진 M X N 이미지를 새로 만든다 

C
모든 픽셀을 흰색(O)으로 칠해서 표를 지운다. 이미지의 크기는 바뀌지 않는다.

L X Y C
(X, Y) 픽셀을 주어진 색(C)으로 칠한다.

V X Y1 Y2 C
X열에 Y1행과 Y2행 (Y1, Y2 포함) 사이에 주어진 색(C)으로 수직 방향 직선을 긋는다.
 
H X1 X2 Y C
Y행에 X1열과 X2열 (X1, X2 포함) 사이에 주어진 색(C)으로 수평 방향 직선을 긋는다.

K X1 Y1 X2 Y2 C
주어진 색(C)으로 채워진 직사각형을 그린다. (X1, Y1)은 왼쪽 위 끝점, (X2, Y2)는 
오른쪽 아래 끝 점을 의미한다.

F X Y C
R 영역을 주어진 색(C)으로 채우는데 영역 R은 다음과 같이 정의된다. (X,Y)픽셀은 R에 속한다. 
(X,Y) 픽셀과 색이 같고 R에 포함된 픽셀과 맞닿은 부분이 하나라도 있다면 그 픽셀도 
R 영역에 포함된다. 

S NAME
파일명은 입력받은 그대로 출력하고 그 뒤에 현재 이미지의 내용을 출력한다.

X
세션을 종료한다.


출력 >>
S NAME 이라는 명령이 있을 때마다 NAME으로 주어진 파일명을 출력하고 현재 이미지의 내용을 출력한다.
각 행은 각 픽셀의 색을 나타내는 문자로 표시된다. 출력 예를 참고하자
I, C, L, V, H ,K, F, S, X를 제외한 문자로 정의된 명령이 있으면 그 줄 전체를 무시하고
다음 명령으로 넘어간다. 다른 오류에 대해서는 프로그램의 행동을 예측할 수 없다.


제공되는 algorithm03.txt 파일의 내용을 이용하여 데이터를 입력받고 아래의 결과가 나오도록 코딩 작성


출력결과>
one.bmp
OOOOO
OOOOO
OAOOO
OOOOO
OOOOO
OOOOO
two.bmp
JJJJJ
JJZZJ
JWJJJ
JWJJJ
JJJJJ
JJJJJ
three.bmp
OMMMO
OMMMO
OMMMO
OOOOO
OOOOO
OOOOO
four.bmp
JJZZJ
JJZZJ
WWZZJ
WWJJJ
JJJJJ
JJJJJ
      
 */
package ch00_algorithm;

public class Algorithm03 {

}
