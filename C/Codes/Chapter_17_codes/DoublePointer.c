 #include <stdio.h>

 int main(void)
 {
     double num = 3.14;
     double **ptr = &num;     // 변수 num의 주소값 저장
     double **dptr = &ptr;    // 포인터 변수 ptr의 주소값 저장
     double *ptr2;

     printf("%9p %9p \n", ptr, *dptr);     // *dptr은 ptr을 의미하므로 출력결과 동일
     printf("%9g %9g \n", num, **dptr);    // **dptr은 num을 의미하므로 출력결과 동일
     
     ptr2 = *dptr;     // ptr2 = ptr 과 같은 문장. 따라서 ptr2도 변수 num을 가리킴
     *ptr2 = 10.99;    // 변수 num의 값을 10.99로 변경
     
     printf("%9g %9g \n", num, **dptr);

     return 0;
 }