/* 10 객체 */

/* 10-1 객체란 */
    /*
    - 자료형의 관점에서 객체는 키(key)와 값(value)으로 구성된 속성의 집합을 의미
    - {}를 이용해 객체를 생성하는 것을 리터럴(literal)방식으로 객체를 생성했다고 표현
    - 빈 객체 : 속성이 하나도 없는 객체
    - 보통 객체를 생성할 때는 빈 객체로 생성하지 않고 처음부터 속성을 지정한 상태로 생성
    - 객체는 모든 자료형의 데이터를 값으로 가질 수 있음 (ex. 한 객체의 속성으로 배열, 숫자, 논리 데이터 추가 가능)
    - 객체 안에 또 다른 객체나 함수가 들어갈 수 있음
    - 보통 객체의 키는 문자열로 작성하는데, 큰따옴표나 작은따옴표로 표시하지 않아도 됨 (키에 공백이 들어갈 경우에는 따옴표 사용해야 함)
    - 객체에서 속성의 값으로 함수가 들어갈 때는 보통 메서드(method)라고 함
    */
    const emptyObject = {}; // 빈 객체
    const person_n = {
        name:"Hong Gildong"
    };
    const person_nai = {
        name:["Hong", "Gildong"],
        age:20,
        isAdult:true
    };
    const person = {
        name:{  // 객체
            firstName:"Gildong",
            lastName: "Hong"
        },
        age:20,
        isAdult:true,
        printInfo:function(){   // 메서드
            console.log('printInfo');
        }
    };
    const person_call = {
        "phone number":"010-0000-0000"  // 키에 공백이 포함될 경우 따옴표로 묶어야 함
    };