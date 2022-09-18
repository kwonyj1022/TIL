/* 03 자료형 */
    /*
    - 기본 자료형 : 문자(string), 숫자(number), 논리(boolean), undefined, null, Symbol 자료형
    - 참조 자료형 : 객체(object)
    */

/* 03-1 문자열 */
    /*
    문자열 : 큰따옴표("")나 작은따옴표('')로 둘러싸인 값의 형태
            (큰따옴표로 시작했으면 큰따옴표로 끝나야 하고, 작은따옴표로 시작했으면 작은따옴표로 끝나야 함)
    */
    
    let string1 = "Hello, World!";
    let string2 = 'Hello, World!';
    console.log(string1);
    console.log(string2);

    // let string1 = "Hello, World!';   // 에러 발생
    
    /*
    문자열 안에 따옴표를 포함해야 한다면?
    - 방법 1 : 문자열에 포함되지 않은 따옴표로 문자열을 감싸서 정의
    - 방법 2 : 문자열 연결 연산자(+) 사용
    - 이스케이프 문자 사용 (역슬래시(\))
        - \'    : 작은따옴표
        - \"    : 큰따옴표
        - \n    : 줄 바꿈
        - \t    : 수평 탭
        - \\    : 역슬래시
    */
    
    let string3 = '문자열은 큰따옴표(")나 ' + "작은따옴표(')로 감싸면 됩니다.";
    console.log(string3);   // 실행결과 : 문자열은 큰따옴표(")나 작은따옴표(')로 감싸면 됩니다.

    let string4 = '문자열은 큰따옴표(")나 작은따옴표(\')로 감싸면 됩니다.';
    console.log(string4);   // 실행결과 : 문자열은 큰따옴표(")나 작은따옴표(')로 감싸면 됩니다.

    // let string5 = "엔터키로 줄 바꿈 하면
    // 에러가 나요" // 에러 발생

    let string5 = "이스케이프 문자를 이용해서\n줄 바꿈 할 수 있습니다."
    console.log(string5);    // 실행결과 : 이스케이프 문자를 이용해서
                            //           줄 바꿈 할 수 있습니다.
    /*
    템플릿 문자열 : 백틱(`)으로 문자열을 정의하는 방법
        - 문자열에 큰따옴표나 작은따옴표가 있어도 영향이 없음
        - Enter를 눌렀을 때 줄 바꿈이 적용됨 (이스케이프 문자를 사용하지 않아도 됨)
        - ${} 문법을 이용해 문자열에 변수 또는 식을 넣을 수 있음
    */
    
    let string6 = `문자열은 큰따옴표(")나 작은따옴표(')로 감싸면 됩니다.`;

    let string7 = `문자열은 큰따옴표(")나
    작은따옴표(')로 감싸면 됩니다.`;

    let dan = 3;
    let gugu = 8;
    let string = `${dan} 곱하기 ${gugu}은 ${dan * gugu}입니다.`;
    console.log(string);    // 실행결과 : 3 곱하기 8은 24입니다.

/* 03-2 숫자형 */
    /*
    자바스크립트는 정수와 실수를 구분하지 않고 전부 하나의 숫자 자료형(숫자형)으로 취급
    but, 실수 사용 시 주의해야 함 (실수를 부동 소수점 방식으로 표현하기 때문에 정확 X)
    */
    let num1 = 10;
    let num2 = 0.1;
    console.log(num1);  // 실행결과 : 10
    console.log(num2);  // 실행결과 : 10

    let sum = 0.1 + 0.2;
    console.log(sum);   // 실행결과 : 0.30000000000000004

/* 03-3 논리형 */
    /*
    논리 자료형(논리형) : 참 또는 거짓에 해당하는 논리 값인 true, false 의미
                         논리형은 오직 true와 false 두 값만 존재
                         논리적인 연산으로 구할 수 있음
    */
    let boolean1 = true;
    let boolean2 = false;
    console.log(boolean1);      // 실행결과 : true
    console.log(boolean2);      // 실행결과 : false
    
    let boolean3 = 10 < 20; // 논리적으로 참
    let boolean4 = 10 > 20; // 논리적으로 거짓
    console.log(boolean3);      // 실행결과 : true
    console.log(boolean4);      // 실행결과 : false

/* undefined */
    /*
    undefiend : 변수나 상수를 선언하면 반드시 값을 할당해야 하는데, 할당하지 않을 경우 임시로 할당되는 값
                사용자가 임의로 정의하고 할당하는 자료형이 아님
    */
    let empty1;          // empty에 undefiend 할당됨
    console.log(empty1); // 실행결과 : undefiend

/* null */
    /*
    null : 변수나 상수를 의도적으로 선언한 공간을 비워둘 때 할당
    */
    let empty2 = null;
    console.log(empty2);    // 실행결과 : null

/* 객체 */
    /*
    객체 : 기본 자료형을 제외하고 자바스크립트에서 거의 모든 데이터와 자료구조는 객체라고 보면 됨
          (배열, 객체 리터럴, 함수)
    */
        /* 배열 */
            /*
            배열 : 복수의 데이터를 정의할 수 있는 자료형
                   - 자바스크립트의 모든 자료형 정의 가능
                   - 비어있는 배열 정의 가능
            */
            let koreanScore = 80;
            let englishScore = 70;
            let mathScore = 90;
            let scienceScore = 60;
            // 위 코드는 아래와 같이 배열을 통해 하나의 자료형에 여러 개의 데이터를 정의하는 코드로 바꿀 수 있음
            let studentScore = [80, 70, 90, 60];    // 국어, 영어, 수학, 과학 점수

            /*
            요소 : 배열로 정의한 데이터
            인덱스 : 배열에서 각 데이터가 있는 위치를 가리키는 숫자 (0부터 시작)
            */
            let score = [80, 70, 90, 60];   // 국어, 영어, 수학, 과학 점수
            console.log(score[1]);          // 1번 인덱스의 데이터에 접근 (2번째 데이터)
                                            // 실행결과 : 70
            let array = ['ab', 3, true, undefined, null, [], {}, foo()];   // 모든 자료형 정의 가능
            let emptyArray = [];    // 비어 있는 배열 정의 가능
        
        /* 객체 리터럴 */
            /*
            객체 리터럴 : 객체를 정의하는 가장 간단한 방법 (중괄호({}) 사용)
                         중괄호 안에는 키(key)와 값(value)의 한쌍으로 이루어진 속성(property)가 들어감
                         (장점) 값을 키로 구분
                         값에 접근할 때는 대괄호([])나 마침표(.) 사용
            */
            let scoreObject = {
                koreanScore:80,
                englishScore:70,
                mathScore:90,
                scienceScore:60
            };
            console.log(scoreObject.koreanScore);       // 실행결과 : 80
            console.log(scoreObject['englishScore']);   // 실행결과 : 70