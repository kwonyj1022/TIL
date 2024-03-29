# **Chapter 06 printf 함수와 scanf 함수 정리하기**
> ## 06-1 printf 함수 이야기

<br>

**printf 함수와 특수문자**

```c
printf("I like programming \n");
```

* C언어는 큰 따옴표를 사용해서 문자열 표현
* printf 함수는 첫 번째 인자로 전달된 문자열을 출력
* \\n은 특수문자(이스케이프 시퀀스(escape sequence))임

<br>

**특수문자의 출력이 필요한 이유**

```c
printf("앞집 강아지가 말했다. "멍~! 멍~!" 정말 귀엽다.");    // 에러 발생
```

* 큰 따옴표의 시작과 끝을 문자열의 시작과 끝으로 보기 때문에 다음과 같이 인식  
\- "앞집 강아지가 말했다. " &nbsp; --> 문자열  
\- 멍~! 멍~! &nbsp; --> ???  
\- " 정말 귀엽다." &nbsp; --> 문자열
* 큰 따옴표 자체의 출력을 원하는 경우, 큰 따옴표 앞에 \\를 붙여줘야 함  
(특수문자의 탄생 배경)  
    
    ```c
    printf("앞집 강아지가 말했다. \"멍~! 멍~!\" 정말 귀엽다.");    // 에러 안 남​
    ```

<br>

**특수문자의 종류**

| 특수문자 | 의미하는 바 |
| :---: | --- |
| \\a | 경고음 |
| \\b | 백스페이스 (backspace) |
| \\f | 폼 피드 (form feed) |
| \\n | 개 행 (new line) |
| \\r | 캐리지 리턴 (carriage return) |
| \\t | 수평 탭 |
| \\v | 수직 탭 |
| \\' | 작은 따옴표 출력 |
| \\" | 큰 따옴표 출력 |
| \\? | 물음표 출력 |
| \\\\ | 역슬래쉬 출력 |

* \\f와 \\v는 프린터 출력을 위한 특수문자이기 때문에 모니터 출력에 사용하면 이상한 문자가 출력됨

<br>

**printf 함수의 서식 지정**

```c
int age = 12;
printf("제 나이는 10진수로 %d살, 16진수로 %X살입니다. \n", age, age);
/* %d는 10진수 정수 출력을, %x는 16진수 정수이면서 알파벳은 대문자로 출력을 의미
%x는 대소문자 다 쓸 수 있고 X가 대문자면 알파벳이 대문자로, x가 소문자면 알파벳이 소문자로 출력됨 */
```

* printf의 f는 formatted(서식이 지정된)을 의미  
∴ printf는 서식이 지정된 형태의 출력을 의미  
&nbsp; (= 출력양식이 만들어진 상태에서 출력을 진행한다는 의미)
* printf 함수는 문자열 안에 서식문자를 포함해서 서식화 된 출력 가능
* 출력의 대상은 두 번째 인자와 그 다음 인자들 (첫 번째 인자는 문자열)  
\- 첫 번째 서식문자의 출력 대상은 두 번째 인자, 두 번째 서식문자의 출력 대상은 세 번째 인자)  
\- 문자열 안에 서식문자가 n개 존재한다면, printf의 인자는 총 (n+1)개임 (∵ 첫 번째 인자는 문자열)

<br>

**서식문자의 종류와 그 의미**

| 서식문자 | 출력 대상(자료형) | 출력 형태 |
| :---: | --- | --- |
| %d | &nbsp; char, short, int | 부호 있는 10진수 정수 |
| %ld | &nbsp; long | 부호 있는 10진수 정수 |
| %lld | &nbsp; long long | 부호 있는 10진수 정수 |
| %u | &nbsp; unsigned int | 부호 없는 10진수 정수 |
| %o | &nbsp; unsigned int | 부호 없는 8진수 정수 |
| %x, %X | &nbsp; unsigned int | 부호 없는 16진수 정수 |
| %f | &nbsp; float, double | 10진수 방식의 부동소수점 실수 |
| %Lf | &nbsp; long double | 10진수 방식의 부동소수점 실수 |
| %e, %E | &nbsp; float, double | e 또는 E 방식의 부동소수점 실수 |
| %g, %G | &nbsp; float, double | 값에 따라 %f와 %e 사이에서 선택 |
| %c | &nbsp; char, short, int | 값에 대응하는 문자 |
| %s | &nbsp; char\* | 문자열 |
|  %p | &nbsp; void\* | 포인터의 주소 값 |

* 정수의 출력을 위한 서식문자들: %d, %u, %o, %x  
    
    ```c
    #include <stdio.h>
    int main(void)
    {
        int num1 = 7, num2 = 13;
        printf("%o %#o \n", num1, num1);    // 7 07 출력
        printf("%x %#x \n", num2, num2);    // d 0xd 출력
        
        return 0;
    }
    ```
    
    \- 서식문자에 #을 삽입하면 8진수를 8진수답게(8진수 앞에 0), 16진수를 16진수답게(16진수 앞에 0x) 출력 가능
* 실수의 출력을 위한 서식문자들: %f, %e, %g  
\- %e 또는 %E는 e표기법으로 출력  
&nbsp; : 예를 들어 0.00001을 지수형태로 표현하면 1.0 x 10<sup>-20</sup> 이고 이를 e표기법으로 표현하면 1.0e-20이 됨  
&nbsp; &nbsp; ( 1.2 x 10<sup>12</sup> = 1.2e+12, &nbsp; &nbsp; 1.15 x 10<sup>-12</sup> = 1.15e-12 )  
\- %g는 소수점 이하의 자릿수가 늘어나면 e표기법으로 출력  
&nbsp; 예) printf("%g \\n", 0.0012);는 %f 스타일로 출력(0.0012)하고,  
&nbsp; &nbsp; &nbsp; &nbsp; printf("%g \\n", 0.0000012);는 %e 스타일로 출력(1.2e-006)
* %s를 이용한 문자열의 출력  
\- %s에서의 s는 sring의 약자로서 %s는 문자열의 출력을 지시하기 위한 서식문자  
\- printf("%s, %s \\n", "AAA", "BBB"); 의 출력결과는 AAA, BBB 임
* 필드 폭을 지정하여 정돈된 출력 보이기  
\- %8d &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 필드 폭을 8칸 확보하고, 오른쪽 정렬해서 출력 진행  
\- %-8d &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 필드 폭을 8칸 확보하고, 왼쪽 정렬해서 출력 진행  

    ```c
    #include <stdio.h>
    int main(void)
    {
        printf("%-8s %14s %5s \n", "이 름", "전공학과", "학년");
        printf("%-8s %14s %5s \n", "권예진", "컴퓨터학부" "1");
        
        return 0;
    }
    ```
    ```
    [출력결과]
    이  름                              전공학과      학년
    권예진                            컴퓨터학부        1
    ```

<br>

> ## 06-2 scanf 함수 이야기

<br>

**정수 기반의 입력형태 정의하기**

```c
#include <stdio.h>
int main(void)
{
    int num1, num2, num3;
    printf("정수 세 개 입력: ");
    scanf("%d %o %x", &num1, &num2, &num3);
    
    printf("입력된 정수 10진수 출력: %d %d %d \n", num1, num2, num3);
    
    return 0;
}
```
```
[출력결과]  
세 개의 정수 입력: 12 12 12  
입력된 정수 10진수 출력: 12 10 18
```
* %d, %o, %x는 입력 대상 자료형이 printf의 출력 대상 자료형과 동일
* 위 예제에서 입력받을 때는 각각 10진수, 8진수, 16진수로 입력받고 출력은 모두 10진수로 출력함  
\- 10진수 12는 10진수로 12, &nbsp; &nbsp; 8진수 12는 10진수로 10, &nbsp; &nbsp; 16진수 12는 10진수로 18임

<br>

**실수 기반의 입력형태 정의하기**
* printf 함수에서는 %f, %e, %g의 의미가 각각 달랐지만,  
scanf 함수에서는 모두 'float형 데이터를 입력 받겠다'는 동일한 의미
* 실수의 입력과정에서 e표기법을 사용해도 됨
* double형 입력에 사용되는 서식문자는 %lf, <br> long double형 입력에 사용되는 서식문자는 %Lf
* **float , &nbsp; double , &nbsp; long double**의 데이터 **출력**에 사용되는 서식문자는 각각 **%f , &nbsp; %f , &nbsp; %Lf** <br> **float , &nbsp; double , &nbsp; long double**의 데이터 **입력**에 사용되는 서식문자는 각각 **%f , &nbsp; %lf , &nbsp; %Lf**

<br>
<br>
<br>
<br>
<br>
출처: 윤성우의 열혈 C 프로그래밍
