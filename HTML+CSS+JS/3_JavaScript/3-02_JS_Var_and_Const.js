/* 02 변수와 상수 */

/* 02-1 변수 */
var num = 10 + 20;  // 변수를 생성하고 10 + 20을 계산한 결과 저장
// var은 키워드, num은 식별자, =은 연산자, 10+20은 표현식, 30은 값, ;은 세미콜론

/*
    키워드 : 어떤 역할이나 기능이 정해진 특별한 단어 (예약어)
    async, await, break, case, catch, class, const, continue, debugger, default,
    delete, do, else, enum, export, extends, false, finally, for, function, if, 
    implement, important, in, instatnceof, interface, let, new, null, package, 
    private, protected, public, return, static, super, switch, this, throw, try, 
    true, typeof, void, while, with, yield

    식별자 : 변수, 함수 등에 부여되는 이름 (키워드는 식별자로 사용할 수 없음)

    연산자 : 연산 작업을 하는 데 사용하는 기호

    표현식 : 평가(표현식을 실행해 하나의 값을 만드는 과정)되어 하나의 값을 반환하는 식 또는 코드

    값 : 더 이상 평가할 수 없는 데이터

    세미콜론 : 하나의 문(문법)이 끝났음을 의미

    변수 선언 : 키워드를 사용해 변수의 식별자를 지정하는 행위 (ex. var num;)

    값 할당 : 할당 연산자인 = 기호로 우변에 있는 값을 변수 공간에 대입(저장)하는 것

    변수 초기화 : 선언과 할당을 한번에 하는 것 (ex. var num = 10;)
*/

/* 02-2 새로우 변수 선언 키워드 let */
let num = 10 + 20;  // var 키워드 말고 let으로도 변수 선언 가능
/*
    var : 변수명 중복 가능
    let : 변수명 중복 불가능
*/
var num = 10 + 20;
var num = 50;       // 기존에 할당된 데이터(30)은 사라지고 50이라는 새로운 값이 할당됨
                    // -> 다른 사람이 선언한 변수명을 실제로 재선언하게 될 수 있음
let num = 10 + 20;
let num = 50;       // num 식별자가 이미 선언됐다는 오류 메시지 발생

/* 02-3 상수 */

/* 02-4 식별자 명명 규칙 */