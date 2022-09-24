/* 08 함수 기능 확장하기 */

/* 08-1 매개변수와 인수 */
    /*
    매개변수(parameter) : 함수를 정의할 때 외부에서 전달하는 데이터를 함수에서 받을 수 있도록 정의하는 변수
    인수(argument) : 정의한 함수를 호출할 때 전달하고 싶은 데이터
    즉, 인수는 함수의 매개변수에 자동으로 할당됨
    [형식]
    - 매개변수는 여러 개 만들 수 있고, 쉽표(,)로 구분해 나열
    - 함수 호출 시 인수 또한 매개변수의 개수에 맞춰 작성
    // 함수 선언문
    function 함수명(매개변수1, 매개변수2, ..., 매개변수n){}
    // 함수 표현식
    const 함수명 = function 식별자(매개변수1, 매개변수2, ..., 매개변수n){};
    // 화살표 함수
    const 함수명 = (매개변수1, 매개변수2, ..., 매개변수n) => {};
    // 함수 호출
    함수명(인수1, 인수2, ..., 인수n);
    */
    function gugudan(dan){  // 매개변수가 있는 함수 만들기
        for (let i = 1; i <= 9; i++){
            console.log(`${dan} * ${i} = ${dan * i}`);
        }
    }
    gugudan(3); // 3단 출력
    gugudan(5); // 5단 출력
    gugudan(8); // 8단 출력

/* 08-2 매개변수의 특징 */
    /*
    - 매개변수의 식별자도 변수의 식별자 명명 규칙에 따름
    - 매개변수는 함수 호출 시 전달되는 데이터와 일대일로 대응되어 데이터가 할당됨
        (첫 번째 인수는 첫 번째 매개변수에 할당되고, 두 번째 인수는 두 번째 매개변수에 할당됨)
    - 함수를 호출할 때 데이터를 전달하지 않는다고 해서 오류가 발생하지는 않음 (undefiend 값이 할당됨)
        - 기본값을 지정해놨다면 기본값이 할당됨
    - 함수를 호출할 때 데이터를 전달하지만, 매개변수가 정의되지 않은 경우에도 오류는 발생하지 않지만 전달받은 값을 활용할 수 없음
    */
    // 화살표 함수에서 매개변수 정의하기
    const sum1 = (num1, num2) => {
        console.log(num1 + num2);
    };
    sum1(10, 20);   // 함수 호출. 실행결과 : 30

    // 화살표 함수는 매개변수가 1개일 경우 () 생략 가능 (있어도 상관 없음)
    const sum2 = num1 => {
        console.log(num1);
    };
    sum2(10);   // 함수 호출. 실행결과 : 10

    // 매개변수 기본값 지정
    function sum3(a = 5, b = 10){
        console.log(a + b);
    }
    sum3();      // 실행결과 : 15
    sum3(5, 8);  // 실행결과 : 13 (전달한 데이터가 있다면 전달한 데이터가 할당됨)
    sum3(5);     // 실행결과 : 15 (5 + 10)

/* 08-3 return 문 */
    /*
    함수를 호출할 때 데이터를 전달하려면 매개변수를 정의해야 하듯이, 함수 외부로 데이터를 반환할 때는 return 문을 사용해야 함
    - 반환 : 함수 내에서 생성된 데이터를 함수를 호출한 곳으로 전달하는 것
    - 반환값 : 반환된 데이터
    - 반환된 데이터를 함수 외부에서 사용하려면 함수 호출 부분에서 반환값을 다시 변수에 할당해야 함
    - 데이터를 반환하지 않는 return 문은 단순히 함수 실행을 종료하는 역할만 함
    */
    function returnSum1(num1, num2){
        let result = num1 + num2;
        return result;  // result 반환
    }
    const result = returnSum1(10, 20); // 함수 호출 부분에서 반환값을 변수에 할당
    console.log("out: " + result);  // 실행결과 : out: 30

    // return문에 꼭 변수를 사용해야 하는 건 아니고, 표현식으로도 데이터 반환 가능
    function returnSum2(num1, num2){
        return num1 + num2;
    }
    console.log("out: " + returnSum2(5, 8));    // 실행결과 : out: 13

    // 데이터를 반환하지 않는 return 문
    function noReturnSum(num1, num2){
        if (typeof num1 !== "number" || typeof num2 !== "number"){
            return; // 매개변수가 숫자가 아니면 강제 종료
        }
        return num1 + num2;
    }
    console.log("out: " + noReturnSum('a', 'b'));   // 실행결과 : out: undefined

    // 화살표 함수에서는 {}를 생략하면 화살표 다음에 오는 코드는 return문으로 처리
    const arrowSum = (num1, num2) => num1 + num2;
    console.log("out: " + arrowSum(10, 20));    // 실행결과 : out: 30
    