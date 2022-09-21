/* 06 반복문 */
    /*
    반복문 : 지정한 조건이 참(true)으로 평가되는 동안 지정한 블록문을 반복해서 실행하는 문법
            (while, do...while, for문 등)
    */

/* 06-1 while문 */
    /*
    while문 : 특정 조건을 만족하는 동안 블록문 실행
    */
    let num1 = 1;
    while (num1 <= 9999){   // 조건이 참이면 실행 (num1이 9999 초과하는 순간 종료됨)
        console.log(num1);
        num1++;
    }
    // 실행결과 : 1 ~ 9999까지 출력됨

/* 06-2 무한 반복문 */
    /*
    무한 반복문 : 반복문의 조건이 계속 참으로 평가되어 반복문이 끝나지 않고 무한히 실행되는 것
    */
    let num2 = 1;
    while (num2 <= 9999){
        console.log(num2);
        // num2++;  // num2를 증가시키지 않으면 num2는 영원히 1이라 반복문이 종료되지 않음
    }

/* 06-3 do...while문 */
    /*
    do...while문 : 특정 조건이 참으로 평가되는 동안 do 다음에 오는 블록문을 반복 실행
                    while문은 블록문을 수행하기 전에 조건식을 평가하는 반면,
                    do...while문은 블록문을 한 번 수행한 후에 조건식 평가
    */
   do{              // do에 있는 블록문 일단 실행
    console.log("무조건 한 번은 실행");
   }while(false);   // while문의 조건이 항상 false, 즉 거짓으로 평가되므로 종료됨
   // 실행결과 : 무조건 한 번은 실행

/* 06-4 for문 */
   /*
   for문 : 횟수를 지정해 지정한 횟수가 끝날 때까지 블록문을 반복 실행하는 반복문
            for(초깃값; 조건식; 증감식) { // 블록문 }    형식으로 되어 있음
            - 초깃값 -> 조건식 -> 블록문(조건식이 참일 경우) -> 증감식 -> 조건식 .... 순서로 실행됨
    */
    for (let i = 0; i < 5; i++){
        console.log(i);
    }
    /* 실행결과
        0
        1
        2
        3
        4
        5
    */
    // for문 중첩 예제
    for (let i = 0; i < 2; i++){
        console.log('i: &{i}');
        for (let k = 0; k < 2; k++){
            console.log('k: &{k}');
        }
    }
    /* 실행결과
        i: 0
        k: 0
        k: 1
        i: 1
        k: 0
        k: 1
    */  /* 외부에 있는 for문의 초깃값은 반복문이 실행될 때 1번만 설정되지만,
           내부 반복문의 초깃값은 외부 블록문이 실행될 때마다 새로 설정됨 */

/* 06-5 for문과 배열 */
    /*
    for문은 횟수를 지정하는 반복문이라는 특징 때문에 배열과 같은 자료형을 반복 횟수 용도로 사용할 수 있음
    (while문과 do...while문도 배열을 사용할 수 있지만 보통 for문에서 주로 사용)
    */
    // for문으로 배열 요소에 접근해 값 출력
    let arr = ["banana", "apple", "orange"];
    for (let i = 0; i < arr.length; i++){   // 배열에 length 속성을 사용하면 배열의 데이터 개수(배열의 길이) 확인 가능
        console.log(arr[i]);
    }
    /* 실행결과
        banana
        apple
        orange
    */

/* 06-6 for...in */
    /*
    for...in 문 : 객체 리터럴이나 배열에 반복 접근할 수 있는 반복문 중 하나
    for(가변수 in 배열/객체리터럴){ // 블록문 } 형식으로 되어 있음
    - in 키워드 오른쪽에는 탐색의 대상이 되는 배열 또는 객체 리터럴이,
    - in 키워드 왼쪽에는 배열 또는 객체 리터럴을 탐색해서 키를 저장할 가변수(임시 변수) 배치
    */
    // 객체 리터럴을 반복할 경우 -> 탐색 결과로 가변수에 객체 리터럴의 키가 할당됨
    let obj = {name:"철수", age:"20"};
    for (let key in obj){
        console.log(key + ": " + obj[key]);
    }
    /* 실행결과
        name: 철수
        age: 20
    */
    // 배열을 반복할 경우
    let array = ["orange", "banana", "apple"];
    for (let index in arr){
        console.log(index + ": " + arr[index]);
    }
    /* 실행결과
        0: orange
        1: banana
        2: apple
    */
    /* 실행결과를 보면 인덱스 순서대로 배열에 반복 접근한 것처럼 보이지만,
       문법적으로는 for...in문으로 반복할 때 배열의 순서대로 접근하는 것을 보장하지 않음 */

/* 06-7 break문 */
    /*
    break문 : 종료 조건을 만조가지 않아도 인위적으로 반복문을 종료시킴
    */
    // for문에서 break문 사용
    for (let i = 0; i < 10; i++){
        console.log(i);
        if (i === 3) break;     // 변수 i가 3이 되는 순간 break문이 실행되어 반복문이 종료됨
    }
    /* 실행결과
        0
        1
        2
        3
    */
    // for...in 문에서 break문 사용
    let object = {name:"철수", age:20};
    for (let key in obj){
        if (key === "age") break;   // 가변수에 담기는 값이 age일 때 반복문 종료
        console.log(obj[key]);
    }
    // 실행결과 : 철수

/* 06-8 continue문 */
    /*
    continue문 : 반복문을 건너뛰고 실행하라는 명령어
                반복문의 블록문에서 continue문을 만나면 해당 반복 실행만 건너뜀
    */
    // 홀수일 때는 반복문을 건너뛰고, 짝수만 출력하는 예제
    for (let i = 1; i <= 10; i++){
        if (i % 2 === 1) continue;  // 홀수면 건너뜀
        console.log(i);
    }
    /* 실행결과
        2
        4
        6
        8
        10
    */