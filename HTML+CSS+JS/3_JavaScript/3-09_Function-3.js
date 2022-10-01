/* 09 함수의 특징 이해하기 */

/* 09-1 스코프 */
    /*
    스코프 : 변수나 함수와 같은 참조 대상 식별자를 찾아내기 위한 규칙
            (함수 스코프 방식이냐 블록 스코프 방식이냐에 따라, 전역 스코프와 지역 스코프의 참조 범위가 달라짐)
        - 함수 스코프 (function scope): 함수에서 정의한 블록문만 스코프의 유효 범위로 인정하는 방식
                                        (=> 함수 내부는 지역 스코프, 함수 외부는 전역 스코프 영역이 됨)
        - 블록 스코프 방식 (block scope) : 자바스크립트는 원래 함수  스코프를 따르는 언어였지만, ES6에서 let, const 키워드가 추가되면서 블록 스코프도 지원
                                            {}로 구성된 블록문 기준으로 스코프의 유효 범위를 나누는 방식 (let, const 키워드로 선언한 변수에 한해서만 적용)
        - 전역 스코프 (global scope) : 함수 외부는 전역 스코프이고, 전역 스코프는 스코프와 상관 없이 함수 내부와 외부 모두 참조 가능
        - 지역 스코프 (local scope) : 함수 내부에 선언한 변수가 접근 가능한 스코프. 함수 외부에서 참조하려고 하면 오류 발생
    */
    // 함수 스코프 방식 - 전역 스코프 예제
    let a1 = 10;    // 전역 스코프
    function f1(){
        console.log(`함수 내부: ${a1}`);
    }
    f1();                            // 실행결과 : 함수 내부: 10
    console.log(`함수 외부: ${a1}`); // 실행결과 : 함수 외부: 10

    // 함수 스코프 방식 - 지역 스코프 예제
    function f2(){
        let a2 = 10;    // 지역 스코프
        console.log(`함수 내부: ${a2}`);
    }
    f2();
    console.log(`함수 외부: ${a2}`);    // 오류 발생

    // 블록 스코프 예제
    let a = 10; // 전역 스코프 => 블록문 내부&외부에서 참조 가능
    {
        let b = 20; // 지역 스코프 -> 블록문 내부에서만 참조 가능 (외부에서는 참조 오류 발생)
        console.log(`코드 블록 내부 a: ${a}`);  // 실행결과 : 코드 블록 내부 a: 10
        console.log(`보드 블록 내부 b: ${b}`);  // 실행결과 : 코드 블록 내부 b: 20
    }
    console.log(`코드 블록 외부 a: ${a}`);      // 실행결과 : 코드 블록 외부 a: 10
    console.log(`코드 블록 외부 b: ${b}`);      // 오류 발생

    // 블록 스코프 제외 예제
    var aa = 10;    // 전역 스코프
    {
        var bb = 20;    // 블록 스코프는 오직 let, const 키워드에서만 발생하므로 bb는 전역 스코프
        console.log(`코드 블록 내부 aa: ${aa}`);    // 실행결과 : 코드 블록 내부 aa: 10
        console.log(`코드 블록 내부 bb: ${bb}`);    // 실행결과 : 코드 블록 내부 bb: 20
    }
    console.log(`코드 블록 외부 aa: ${aa}`);        // 실행결과 : 코드 블록 외부 aa: 10
    console.log(`코드 블록 외부 bb: ${bb}`);        // 실행결과 : 코드 블록 외부 bb: 20

    /*
    참조 우선순위 : 전역 스코프와 지역 스코프에 같은 식별자를 가지는 참조 대상이 있다면,
                    먼저 같은 지역 스코프의 식별자를 참조한 후, 찾지 못할 때만 전역 스코프에서 찾음
        (let, const 키워드는 '같은 스코프 영역에서' 같은 식별자의 중복 선언이 불가능 (다른 스코프 영역에서는 가능))
    */
    let n1 = 10;
    const n2 = 20;
    function sum(){
        let n1 = 50;    // let 키워드는 같은 스코프 영역에서만 같은 식별자의 중복 선언이 불가능한 것임
        const n2 = 70;  // const 키워드는 같은 스코프 영역에서만 같은 식별자의 중복 선언이 불가능한 것임
        console.log(`함수 내부 n1: ${n1}`);     // 실행결과 : 함수 내부 n1: 50
        console.log(`함수 내부 n2: ${n2}`);     // 실행결과 : 함수 내부 n2: 70
    }

/* 09-2 함수 호이스팅 */
    /*
    호이스팅 : 코드를 선언과 할당으로 분리해 선언부를 자신의 스코프 최상위로 끌어올리는 것 (함수도 호이스팅 됨)
                (var 키워드로 선언한 변수에만 적용됨 (let, const 키워드로 선언한 변수에는 적용되지 않음))
        - var 키워드로 선언한 변수 : 변수 선언부를 스코프 최상위로 끌어올림
        - 함수 선언문으로 정의된 함수 : 함수 전체를 선언부로 취급, 최상위로 끌어올림
        - 함수 표현식으로 정의된 함수 : 변수 선언부를 선언부로 취급하기 때문에 최상위에 올라와도 실행할 때 '함수가 아니다'라는 오류 발생
        - 화살표 함수 방식으로 정의된 함수 : 함수 표현식으로 정의된 함수와 같은 원리로 호이스팅됨
        - 함수 표현식이나 화살표 함수를 let이나 const 키워드로 선언했다면 호이스팅 자체가 되지 않음
    */
    console.log(num);
    var num = 10;
    // 위 코드에서 오류가 발생할 것 같지만, 호이스팅에 의해 아래와 같이 작동함
    var num;    // 선언부를 스코프 최상위로 끌어올림 (아직 변수에 값 할당 x)
    console.log(num);   // undefiend 출력
    num = 10;

    // 함수 선언문으로 정의된 함수의 호이스팅 예제
    printHello();
    function printHello(){
        console.log("Hello");
    }
    // 실행결과 : Hello
    // 위 코드는 아래와 같이 작동함
    function printHello(){  // 함수 선언문을 최상위로 끌어올림 (함수 선언문으로 정의된 함수는 호이스팅에서 선언부로 봄)
        console.log("Hello");
    }
    printHello();

    // 함수 표현식으로 정의된 함수의 호이스팅 예제
    printHello2();
    var printHello2 = function printHello2(){
        console.log("Hello");
    }
    // 실행결과 : 오류 발생
    // 위 코드는 아래와 같이 작동함
    var printHello2;
    printHello2();
    printHello = function printHello(){
        console.log("Hello");
    }

    // 활용 예제
    var text = "outside";
    function printScope(){
        console.log(text);
        var text = "inside";
    };
    printScope();   // 실행결과 : undefined (함수 내부에서 발생하는 호이스팅에 의해 text 변수는 선언만 되고 할당은 아직 안 된 undefined 출력)

/* 09-3 즉시 실행 함수 사용하기 */
    /*
    즉시 실행 함수 (IIFE, Immediately Invoked Function Expression) : 함수를 정의하면서 동시에 실행까지 하는 함수
    형식 : (function(){})();
    장점 : 전역 스코프가 오염되는 것을 방지할 수 있음 (한 번 실행되고 나면 메모리에 데이터가 남아 있지 않음 => 재호출 하면 참조 오류 발생)
            (사용할 함수인데 전역 스코프에 함수를 선언했기 때문에 해당 식별자를 더 이상 사용할 수 없는 경우 사용하는 표현)
    */
    (function sum(a, b){
        console.log(a + b);
    })(10, 20)  // 실행결과 : 30

    // 활용 예제
    const result = (function(a, b){
        function init(){
            return doSum(a, b);
        }
        function doSum(a, b){
            return a + b;
        }
        return init();
    })(10, 20);
    console.log(result);    // 실행결과 : 30
    