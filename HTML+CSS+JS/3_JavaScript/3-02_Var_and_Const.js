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

    /*
    var : 호이스팅(hoisting) O      // 호이스팅 : 변수 선언을 자바스크립트의 스코프 맨 위로 올려 실행하는 것
    let : 호이스팅(hoisting) X
    */
    console.log(num);
    var num = 10;    // 실행결과 : undefined (에러 안남) (∵ 변수를 출력할 때는 값이 없을 뿐, 선언은 된 상태임)
    // 위 코드는 호이스팅에 의해 아래와 같이 작동
    var num;     // 선언이 최상위로 올라옴
    console.log(num);
    num = 10;    // 할당은 원래 자리에 있음

    console.log(num);
    let num = 10;   // 에러 발생

    /*
    var 키워드와 let 키워드는 참조하는 스코프가 다름
    (∴ 실무에서는 let 권장 but 모든 웹 브라우저에서 완벽하게 지원하지는 않음)

/* 02-3 상수 */
    /*
    const 키워드는 기본 내용은 let 키워드와 같지만, (변수명 중복 선언 안됨, 호이스팅 안됨)
    const 키워드는 재할당이 안 되고, 따라서 선언을 먼저하고 할당을 나중에 하는 것도 안 됨
    */

    let num = 10;
    num = 30;
    console.log(num);   // 실행결과 : 30

    const num = 10;
    num = 30;
    console.log(num);   // 에러 발생 (∵ const 키워드는 재할당 불가)

    //const num;
    //num = 10;           // 에러 발생 (∵ 선언을 먼저하고 할당을 나중에 하는 것도 안됨)

/* 02-4 식별자 명명 규칙 */
    /*
    강제적 식별자 명명 규칙
    - 식별자에 키워드 사용 불가
    - 식별자에 공백 포함 불가
    - 식별자의 첫 글자는 영문 소문자, _(언더스코어), $ 기호만 사용
    */
   /*
   관용적 식별자 명명 규칙
   - 식별자는 영문으로만 작성
   - 식별자는 의미 있는 단어로 작성
   */
  /*
  식별자 표기법
  - 카멜 표기법         : 변수명과 함수명 작성 시 사용  (firstName, lastName)
  - 언더스코어 표기법   : 상수명 작성 시 사용           (FIRST_NAME, last_name)
  - 파스칼 표기법       : 생성자 함수명 작성 시 사용    (FirstName, LastName)
  */
