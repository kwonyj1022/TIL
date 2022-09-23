/* 04 연산자 */

/* 04-1 산술 연산자 */
    /* 
    산술 연산자 : 덧셈, 뺄셈, 곱셈, 나눗셈과 같은 수학 연산을 수행하는 연산자
            - 이항 산술 연산자 (+, -, *, /, %, **)
            - 단항 산술 연산자 (++, --)
            - 단항 부정 연산자 (-)
    */
        /* 
        이항 산술 연산자 : 연산을 수행하는 데 피연산자가 2개 필요한 연산자
        */
        let sum = 10 + 20;      // 30 (+는 문자열 연결 연산자로도 사용)
        let sub = 20 - 10;      // 10
        let multi = 10 * 20;    // 200
        let div = 10 / 2;       // 5
        let remain = 10 % 3;    // 1 (10을 3으로 나눈 나머지)
        let expon = 2 ** 3;     // 8 (2의 3제곱)

        /*
        단항 산술 연산자 : 연산을 수행하는 데 피연산자가 1개만 필요한 연산자
        - 변수나 상수에 할당된 데이터로만 연산할 수 있고, 숫자에 바로 사용하는 건 안 됨
        - 전치 연산 : 단항 산술 연산자를 피연산자 앞에 사용 -> 변수에 값을 할당하기 전에 증감시킴
        - 후치 연산 : 단항 산술 연산자를 피연산자 뒤에 사용 -> 변수에 값을 할당한 후에 증감시킴
        */
        let increment = 10;
        increment++;
        let decrement = 10;
        decrement--;
        console.log(increment); // 11
        console.log(decrement); // 9
        // let incre = 10++; 는 불가능

        let num1 = 10;
        let subNum1 = ++num1;   // 전치 연산 (subNum1에 할당하기 전에 증가시키고 num1=11을 할당)
        console.log(subNum1);   // 11

        let num2 = 10;
        let subNum2 = num2++;   // 후치연산 (subNum2에 10을 할당한 후에 num2를 증가시킴)
        console.log(subNum2);   // 10

        /*
        단항 부정 연산자 : 항상 피연산자 앞에 위치하며 피연산자의 부호를 부정하는 연산 수행
                          (음수 -> 양수) (양수 -> 음수)
        */
        let num3 = -10;
        num = -num;
        console.log(num);   // 10

/* 04-2 대입 연산자와 복합 대입 연산자 */
    /*
    - 대입 연산자 : 데이터를 대입(할당)하는 연산을 수행하는 연산자 (=)
    - 복합 대입 연산자 : 산술 연산자와 대입 연산자를 함께 사용해 산술과 할당을 한 번에 수행하는 연산자
                        (+=, -=, *=, /=, %=, **=)
    */
    let x = 10;
    x += 5; // 15 (x = x + 5)
    let y = 10;
    y -= 5; // 5 (y = y - 5)
    let z = 10;
    z *= 5; // 50 (z = z * 5)
    let u = 10;
    u /= 5; 2 ( u = u / 5)
    let v = 10;
    v %= 3; // 1 (v = v % 3)
    let t = 10;
    t **= 2;    // 100 (t = t ** 2)

/* 04-3 비교 연산자 */
    /*
    비교 연산자 : 피연산자를 비교한 뒤 논리형 값인 참(true), 거짓(false)을 반환하는 연산 수행
                 (==, ===, !=, !==, <, <=, >, >=)
        - x == y : x와 y의 값이 같으면 true 반환
        - x === y : x와 y의 값과 자료형이 같으면 true 반환
        - x != y : x와 y의 값이 다르면 true 반환
        - x !== y : x와 y의 값과 자료형이 다르면 true 반환
        - x < y : x가 y보다 작으면 true 반환
        - x <= y : x가 y보다 작거나 같으면 true 반환
        - x > y : x가 y보다 크면 true 반환
        - x >= y : x가 y보다 크거나 같으면 true 반환
    */
    10 == '10';     // true
    10 === '10';    // false
    10 != '10';     // false
    10 !== '10';    // true
    10 < 10;        // false
    10 <= 10;       // true
    10 > 10;        // false
    10 >= 10;       // true;

/* 04-4 논리 연산자 */
    /*
    논리 연산자 : 피연산자를 논리적으로 평가한 뒤, 조건에 맞는 피연산자를 반환하는 연산 수행
                (&&, ||ㅡ !)
        - x && y : x가 참이면 y를 반환하고, 거짓이면 x 반환 (AND 연산) 
        - x || y : x가 참이면 x를 반환하고, 거짓이면 y 반환 (OR 연산) (왼쪽부터 평가해 참으로 평가된 피연산자 즉시 반환, 모든 피연산자가 거짓이라면 마지막에 평가된 피연산자 반환)
        - !x     : x가 참이면 false를 반환하고, 거짓이면 true 반환
    - ""(빈 문자열), undefined, 0, null만 거짓으로 평가되고 나머지는 참으로 평가됨
    - 논리 연산자가 반드시 true, false를 반환하는 것이 아니라, 평가 결과에 따라 피연산자를 반환
    */
    // AND 연산자(&&) 예시
    "" && "cat";                // "" 반환
    undefined && "cat";         // undefined 반환
    0 && "cat";                 // 0 반환
    null && "cat";              // null 반환
    "cat" && "dog";             // "dog" 반환
    "cat" && "dog" && "bird";   // "bird" 반환
    // OR 연산자(||) 예시
    false || true || false;     // true 반환
    false || false;             // false 반환
    false || "cat";             // "cat" 반환
    "" || "cat";                // "cat" 반환
    "dog" || "cat";             // "dog" 반환
    // NOT 연산자(!) 예시
    !false;                     // true 반환
    !(10 < 20);                 // false 반환
    !(10 < 20 && 20 < 10);      // true 반환
    // NOT 연산자는 괄호를 어떻게 묶는지에 따라 결과 다름
    !true && false;             // false 반환
    !(true && false);           // true 반환

/* 04-5 삼항 연산자 */
    /*
    삼항 연산자 : 세 항 중 가장 왼쪽에 있는 피연산자의 참, 거짓에 따라 나머지 두 항에 있는 피연산자를 선택적으로 반환하는 연산 수행 (?:)
                 -> 조건문을 사용하지 않아도 간단한 조건식 처리 가능
        - (x ? y : z) : x가 참이면 y를 반환하고, x가 거짓이면 z 반환
    */
    let score = 90;
    let grade = score >= 90 ? 'A+' : 'B';
    console.log(grade);     // A+

/* 04-6 연산자 우선순위 */
    /*
    연산자 우선순위 : 연산자를 여러 개 사용했을 때 어떤 연산자를 먼저 연산할지를 결정하는 기준
                     우선순위가 같은 연산자들을 사용했으면 결합 순서에 따라 연산이 수행됨
        - 우선순위(1)   그룹 연산자                  ( )                결합순서(좌 -> 우)
        -               대괄호 연산자                [ ]                결합순서(좌 -> 우)
        -               마침표 연산자                 .                 결합순서(좌 -> 우)
        - 우선순위(2)   증가 연산자                   ++                결합순서(우 -> 좌)
                        감소 연산자                  --                 결합순서(우 -> 좌)
                        단항 부정 연산자              -                 결합순서(우 -> 좌)
                        NOT 연산자                    !                 결합순서(우 -> 좌)
                        delete 연산자               delete              결합순서(우 -> 좌)
                        new 연산자                    new               결합순서(우 -> 좌)
                        typeof연산자                typeof              결합순서(우 -> 좌)
        - 우선순위(3)   나눗셈 연산자                   /                결합순서(좌 -> 우)
                        곱셈 연산자                     *               결합순서(좌 -> 우)
                        나머지 연산자                   %               결합순서(좌 -> 우)
        - 우선순위(4)   덧셈 연산자                     +                결합순서(좌 -> 우)
                        뺄셈 연산자                     -               결합순서(좌 -> 우)
        - 우선순위(5)   비교 연산자                 <=, <, >, >=         결합순서(좌 -> 우)
        - 우선순위(6)   동등, 일치, 부등, 불일치    ==, ===, !=, !==     결합순서(좌 -> 우)
        - 우선순위(7)   AND 연산자                      &&              결합순서(좌 -> 우)
        - 우선순위(8)   OR 연산자                       ||              결합순서(좌 -> 우)
        - 우선순위(9)   삼항 연산자                     ?:              결합순서(좌 -> 우)
        - 우선순위 (10) 대입(할당)연산자                =               결합순서(우 -> 좌)
                        복합 대입 연산자       +=, -=, *=, /=, %=, **=  결합순서(우 -> 좌)
        - 우선순위(11)  멀티 연산자                     ,               결합순서(좌 -> 우)
    */
    let sum1 = 10 + 20 * 3;
    console.log(sum1);   // 70
    let sum2 = (10 + 20) * 3;
    console.log(sum2);  // 90
    let num = 10;
    let result = num *= 3;  // 대입 연산자와 복합 대입 연산자는 모두 결합 순서가 우 -> 좌 이므로 
                            // num *= 3 이 먼저 연산된 후 result에 값이 할당 됨
    console.log(result);    // 30

/* 04-7 형 변환 */
    /*
    형 변환 : 데이터의 자료형이 다른 자료형으로 바뀌는 것
    - 암시적 형 변환 : 사용자가 형 변환을 의도하지 않았지만, 자바스크립트에서 자체적으로 형 변환하는 것
    - 명시적 형 변환 : 드러나게 형 변환 처리
    */
   // 암시적 형 변환 (숫자형 -> 문자열) 예시
    const conversion = 10 + "10";   // 자바스크립트가 내부적으로 숫자형 데이터를 문자열 데이터로 형 변환 함
    console.log(conversion);        // 1010
    // 암시적 형 변환 (문자열 -> 숫자형) 예시
    let intNum1 = 10;
    let strNum1 = "10";
    if (intNum1 == strNum1){  // 문자열을 숫자형으로 형 변환
        console.log('equals');
    }
    // 명시적 형 변환 (문자열 -> 숫자형) 예시
    let intNum2 = 10;
    let strNum2 = "10";
    if (String(intNum2) == strNum2){
        console.log('equals');
    }