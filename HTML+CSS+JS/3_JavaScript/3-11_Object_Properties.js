/* 11 객체 속성 다루기 */

/* 11-1 객체 속성에 접근하기 */
    /*
    대괄호 연산자로 접근하기
    - 대괄호 연산자를 사용해 객체에 속성에 접근 가능 (키는 따옴표로 감싸야 함)
    - 객체의 속성값이 배열이나 객체 리터럴일 때는 대괄호를 연속으로 사용해서 접근
    - 객체의 메서드를 호출할 때는 () 사용
    */
    const person = {
        fullname:"Hong Gildong",
        name:{
            firstName:"Gildong",
            lastName:"Hong"
        },
        age:20,
        likes:["apple", "samsung"],
        printHello:function(){
            return "hello";
        },
        "phone number":"010-000-0000"
    };
    console.log(person["fullname"]);            // 출력결과 : Hong Gildong
    console.log(person["age"]);                 // 출력결과 : 20
    console.log(person["name"]);                // 출력결과 : { firstName: 'Gildong', lastName: 'Hong }
    console.log(person["name"]["firstName"]);   // 출력결과 : Gildong
    console.log(person["likes"]);               // 출력결과 : [ 'apple', 'samsung' ]
    console.log(person["likes"][0]);            // 출력결과 : apple
    console.log(person["likes"][1]);            // 출력결과 : samsung
    console.log(person["printHello"]);          // 출력결과 : [Function: printHello]
    console.log(person["printHello"]());        // 출력결과 : hello
    console.log(person["phone number"]);        // 출력결과 : 010-000-0000

    /*
    마침표 연산자로 접근하기
    - 따옴표로 감싸지 않고 키를 바로 적음
    - 키 식별자에 공백이 있다면 마침표 연산자는 사용 불가 (대괄호 연산자로만 접근 가능)
    */
    console.log(person.name.lastName);  // 출력결과 : Hong
    console.log(person.age);            // 출력결과 : 20
    console.log(person.likes[0]);       // 출력결과 : apple
    console.log(person.printHello());   // 출력결과 : hello

/* 11-2 객체 속성 값 변경하기 */
    /*
    객체로 정의된 값을 바꾸고 싶다면 키로 속성에 접근해서 값을 재할당하면 됨
    */
    person.name = "Kim";
    console.log(person.name);   // 출력결과 : Kim

/* 11-3 객체 속성 동적으로 추가하기 */
    /*
    속성을 동적으로 추가한다 : 이미 만들어진 객체에 나중에 속성을 추가하는 것
    객체 속성에 키로 접근해 값을 재할당할 때 해당 키가 객체에 없다면 해당 키와 값으로 구성된 새로운 속성이 객체에 추가됨
    */
    const obj = {};         // 빈 객체 생성
    console.log(obj);       // 출력결과 : {}
    obj.job = "teacher";    // job 속성 추가
    console.log(obj);       // 출력결과 : { job: 'teacher' }

/* 11-4 객체 속성 동적으로 삭제하기 */
    /*
    객체 속성에 접근할 때 앞에 delete 키워드를 명시하면 해당 속성이 삭제됨
    */
    const obj2 = {
        name:"Hong Gildong"
    };
    delete obj2.name;
    console.log(obj2);  // 출력결과 : {}

/* 11-5 객체의 데이터 관리 방법 이해하기 */
    /*
    깊은 복사 : 복사한 값을 재할당할 때 한쪽 데이터가 변경되어도 서로 영향을 미치지 않게 복사되는 것
    얕은 복사 : 데이터를 복사했을 때 한쪽 데이터가 변경되면 다른 쪽 데이터도 변경되어 서로 영향을 받는 것
    
    기본 자료형의 데이터 관리 : 깊은 복사
        - 변수에 데이터를 할당할 때 데이터 그 자체가 할당됨
    
        참조 자료형의 데이터 관리 : 얕은 복사
        - 변수 공간에 데이터가 할당되는 것이 아니라, 데이터가 위치하고 있는 메모리의 주소 값만 할당됨 ('참조한다'라고 표현)
        - 객체의 경우, 객체의 데이터는 별도의 메모리에 저장되고, 변수는 객체의 데이터가 저장된 메모리 주소만 가지고 있게 됨
            따라서, const로 객체를 선언해도 속성을 추가, 삭제, 값을 변경할 수 있음
            같은 변수에 다른 객체를 재할당하는 것은 불가능
    */
    // 깊은 복사 예시
    let num = 10;
    let copyNum = num;      // 변수 num의 데이터를 변수 conpyNum에 할당
    num = 20;               // 변수 num을 재할당
    console.log(num);       // 출력결과 : 20
    console.log(copyNum);   // 출력결과 : 10
    
    // 얕은 복사 예시
    const man = {
        name: "Hong Gildong"
    };
    const copyMan = man;        // 변수 man에 할당된 객체를 변수 conpyMan에 복사
    man.name = "Hong";          // 변수 man에 할당된 객체의 값을 변경
    console.log(man.name);      // 출력결과 : Hong
    console.log(copyMan.name);  // 출력결과 : Hong
    // man과 copyMan은 같은 주소값을 가지기 때문에 man의 데이터를 변경하면 같은 주소를 바라보는 변수 copyMan의 데이터도 변경됨