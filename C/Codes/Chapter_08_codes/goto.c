#include <stdio.h>
int main(void)
{
	int num;
	printf("자연수 입력: ");
	scanf("%d", &num);

	if (num == 1)
		goto ONE;        // 레이블 ONE의 위치로 이동!
	else if (num == 2)
		goto TWO;        // 레이블 TWO의 위치로 이동!
	else
		goto OTHER;      // 레이블 OTHER의 위치로 이동!

ONE:            // 위치지정에 사용된 ONE이라는 이름의 레이블
	printf("1을 입력하셨습니다! \n");
	goto END;            // 레이블 END의 위치로 이동!
TWO:            // 위치지정에 사용된 TWO라는 이름의 레이블
	printf("2를 입력하셨습니다! \n");
	goto END;            // 레이블 END의 위치로 이동!
OTHER:          // 위치지정에 사용된 OTHER이라는 이름의 레이블
	printf("3 혹은 다른 값을 입력하셨군요! \n");

END:            // 위치지정에 사용된 END라는 이름의 레이블
	return 0;
}