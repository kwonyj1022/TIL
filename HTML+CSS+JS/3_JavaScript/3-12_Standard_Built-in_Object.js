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
    
    /* 12-3 날짜와 시간을 다루는 Date 객체 */
    
    
    /* 12-4 수학 연산을 다루는 Math 객체 */

