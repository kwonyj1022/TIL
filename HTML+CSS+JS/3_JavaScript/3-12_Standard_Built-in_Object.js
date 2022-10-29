/* 12 표준 내장 객체 사용하기 */
    /*
    자바의 다양한 표준 내장 객체를 알고 싶다면 아래의 주소 참고
    https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects
    */

/* 12-1 문자열을 다루는 String 객체 */
    /*
    String 객체의 모든 속성과 메서드 보기
    https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String 
    */
    /*
    자주 사용하는 속성 : length (문자열의 길이 반환)
    자주 사용하는 메서드 : includes(), replace(), replaceAll(),
                            split(), toUpperCase(), trim(), indexof()
        - includes() : 매개변수에 전달되는 문자열이 대상 문자열에 포함되어 있으면 true, 아니면 false 반환
        - replace() : 매개변수에 전달되는 문자열과 일치하는 한 부분을 찾아서 다른 데이터로 변경한 새로운 문자열 반환
        - replaceAll() : 매개변수에 전달되는 문자열과 일치하는 모든 부분을 찾아서 다른 데이터로 변경한 새로운 문자열 반환
        - split() : 매개변에 전달되는 구분자를 이용해 대상 문자열을 여러 개의 문자열로 분리해서 새로운 배열로 반환
        - toUpperCase() : 대상 문자열을 대문자로 변경해 반환
        - trim() : 대상 문자열의 앞뒤 공백을 제거한 값 반환
        - indexOf() : 대상 문자열과 일치하는 첫 번째 문자의 인덱스 반환 (못 찾으면 -1 반환)
    */

        const pw = "124";
        console.log(pw.length); // 실행결과 : 3
     
        const email = "test!naver.com";
        if (email.includes("@") === false) {
            console.log("올바른 이메일 형식이 아닙니다.");  // 실행결과 : 올바른 이메일 형식이 아닙니다.
        }
        if (email.indexOf("@") === -1){
            console.log("올바른 이메일 형식이 아닙니다.");  // 실행결과 : 올바른 이메일 형식이 아닙니다.
        }
    
    /* 12-2 배열을 다루는 Array 객체 */
        /*
        Array 객체의 모든 속성과 메서드 보기
        https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array
        */
        /*
        자주 사용하는 속성 : length (배열의 요소 개수 반환)
        자주 사용하는 메서드
            - 파괴적 메서드 : 메서드를 사용했을 때 원본 데이터를 변경하는 메서드 
                            push(), pop(), unshift(), shift(), sort(), reverse()
                    - push() : 배열의 맨 뒤에 데이터 추가
                    - pop() : 배열의 맨 뒤에서 데이터 추출
                    - unshift() : 배열의 맨 앞에 데이터 추가
                    - shift() : 배열의 맨 앞에서 데이터 추출
                    - sort() : 배열의 요소 정렬
                    - reverse() : 배열의 요소 역순 정렬
            - 비파괴적 메서드 : 메서드를 사용했을 때 원본을 변경하지 않는 메서드
                                forEach(), filter(), find(), findIndex(), includes(), join()
                    - forEach() : 배열의 요소를 하나씩 순회하면서 요소마다 콜백(callback) 함수 호출
                    - filter() : 배열의 요소를 하나씩 순회하면서 요소마다 콜백함수를 호출해 true를 반환하는 요소만 추출해서 새로운 배열을 만들어서 반환
                    - find() : 배열의 
        */
        const arr = [10, 20, 30];
        for (let i = 0; i < arr.length; i++) {
            console.log(arr[i]);
        }
       
        arr.push(40);        // 배열 맨 뒤에 40 추가
        console.log(arr);    // 실행결과 : [10, 20, 30, 40]
        arr.pop();           // 배열 맨 뒤에서 요소 추출
        console.log(arr);    // 실행결과 : [10, 20, 30]
        arr.unshift(0);      // 배열 맨 앞에 0 추가
        console.log(arr);    // 실행결과 : [0, 10, 20, 30]
        arr.shift();         // 배열 맨 앞에서 요소 추출
        console.log(arr);    // 실행결과 : [10, 20, 30]

        arr.forEach(function(v){
            console.log(v);
        });  // 10 20 30 이 순서대로 출력됨

        // 배열에서 가장 큰 수 출력
        const array = [10, 120, 30, 50, 20];
        arr.sort(function(a, b){
            if (a < b) return 1;
            else if (a > b) return -1;
            else return 0;
        })
        console.log(arr[0]);    // 실행결과 : 120

    /* 12-3 날짜와 시간을 다루는 Date 객체 */
        /*
        인스턴스 만들기 : Date 객체를 호출하면 현재 날짜와 시간 정보를 기반으로 날짜와 시간 데이터가 생성됨
        Date 객체의 인스턴스를 생성하는 다른 방법
                - 연, 월, 일, 시, 분, 초 정보를 숫자로 전달해 생성
                    (월은 0부터 시작, 즉 1월은 0, 12월은 11)
                - 연, 월, 일, 시, 분, 초 정보를 문자열로 전달해 생성
                    (이때는 월을 그대로 전달하면 됨)
        */
        /*
        Date 객체의 모든 속성과 메서드 보기
        https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Date
        */
        const date0 = new Date();
        console.log(date0);
        const date11 = new Date(2022, 11, 25);    // Sun Dec 25 2022 00:00:00 GMT+0900 (한국 표준시)
        const date12 = new Date(2022, 11, 25, 18, 30, 50) // Sun Dec 25 2022 18:30:50 GMT+0900 (한국 표준시)
        
        const date21 = new Date("2022-12-25");   // Sun Dec 25 2022 00:00:00 GMT+0900 (한국 표준시)
        const date22 = new Date("2022/12/25/18:30:50");  // Sun Dec 25 2022 18:30:50 GMT+0900 (한국 표준시)

        /*
        매서드로 날짜와 시간 정보 가져와서 설정하기
            - get으로 시작하는 메서드는 날짜와 시간 정보를 가져옴
            - set으로 시작하는 메서드는 날짜와 시간 정보를 설정함

                - getFullYear() / setFullYear() : 연도를 4자리 숫자로 표시
                - getMonth() / setMonth() : 월을 0부터 11까지의 숫자로 표시
                - getDate() / setDate() : 일을 1붙 31까지의 숫자로 표시
                - getDay() : 요일을 0부터 6까지의 숫자로 표시 (0 -> 일요일)
                - getTime() / setTime() : 1970년 1월 1일 12:00 이후의 시간을 밀리초(1/1000초) 단위로 표시
                - getHours() / setHours() : 시를 0부터 23까지의 숫자로 표시
                - getMinutes() / setMinutes() : 분을 0부터 59까지의 숫자로 표시
                - getSeconds() / setSeconds() : 초를 0부터 59까지의 숫자로 표시
                - getMilliseconds() / setMilliseconds() : 밀리초를 0부터 999까지의 숫자로 표시
        */
        const date = new Date(2022, 11, 25, 18, 30, 50);
        const dateFormat = `${date.getFullYear()}-${date.getMonth() + 1}-${date.getDate()} ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;
        console.log(dateFormat);    // 실행결과 2022-12-25 18:30:50

    /* 12-4 수학 연산을 다루는 Math 객체 */
        /*
        Math 객체의 모든 속성과 메서드 보기
        https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Math
        */
        /*
        자주 사용하는 메서드
            - Math.floor() : 주어진 숫자와 같거나 작은 정수 중에서 가장 큰 수 반환 (내림)
            - Math.ceil() : 주어진 숫자와 같거나 큰 정수 중에서 가장 작은 수 반환 (dhffla)
            - Math.round() : 주어진 숫자를 반올림한 수와 가장 가까운 정수 반환 (반올림)
            - Math.random() : 0 이상 1 미만의 난수 반환 (같은 코드라도 실행할 때마다 값이 달라짐)

        Math 객체는 new 키워드 없이 바로 메서드 사용 (인스턴스 생성 X)
        */
        const floatNum = 10.52;
        Math.floor(floatNum);   // 10
        Math.ceil(floatNum);    // 11
        Math.round(floatNum);   // 11

        function getMaxRandom(max) { // 0 이상 max 이하의 무작위 정수
            return Math.floor(Math.random() * max) + 1;
        }
        const maxRandom = getMaxRandom(20);
        console.log(maxRandom); // 0 이상 20 이하의 무작위 정수

        function getMinMaxRandom(min, max) { // min 이상 max 이하의 무작위 정수
            return Math.floor(Math.random() * (max - min)) + 1 + min;   // max를 제외하고 싶으면  +1 삭제
        }
        const minmaxRandom = getMinMaxRandom(10, 20);
        console.log(minmaxRandom);  // 10 이상 20 이하의 무작위 정수