/* 05 조건문 */

/* 05-1 if, else, else if문 */
    /*
    - if문 : if 뒤에 오는 소괄호(()) 안의 조건식이 참으로 평가되면 중괄호 안의 코드를 실행하는 조건문
    - else문 : if문의 조건식이 거짓일 때 실행되는 블록문
               (if문 없이 단독으로 사용할 수 없으며, 하나의 if문에는 하나의 else문만 사용 가능)
    - else if문 : if문에 조건을 추가하고 싶을 때 사용 
                  (항상 if문 다음에 사용하고 else문보다는 먼저 사용해야하며, 개수 제한은 없음)
    - 작성하려는 코드의 분기 처리에 따라 중첩해서 사용 가능 (중첩 횟수에는 제한 없음)
    */
    // if문 예시
    let num1 = 10;
    if (num1 % 2 == 0){ // 조건이 참이므로 아래 문장이 출력됨
        console.log("변수 num1에 할당된 숫자는 짝수입니다.");
    }
    // else문 예시
    let num2 = 5;
    if (num2 % 2 == 0){ // 거짓이므로 else문으로 넘어감
        console.log("변수 num2에 할당된 숫자는 짝수입니다.");
    }
    else{
        console.log("변수 num2에 할당된 숫자는 홀수입니다.");
    }
    // else if문 예시
    let num3 = 0;
    if (num3 > 0){  // 거짓이므로 else if문으로 넘어감
        console.log("양수");
    }
    else if (num3 < 0){ // 거짓이므로 else문으로 넘어감
        console.log("음수");
    }
    else{
        console.log("0");
    }
    // 중첩 예시
    if(true){
        if(true){
            // 블록문
        }
        else{
            // 블록문
        }
    }
    else if(true){
        if(true){
            // 블록문
        }
    }
    else{
        if(true){
            // 블록문
        }
        else if(true){
            // 블록문
        }
        else{
            if(true){
                // 블록문
            }
        }
    }

/* 05-2 switch문 */
    /*
    switch문 : switch 뒤에 오는 소괄호 안의 값과 일치하는 case 문이 있을 때 해당 코드를 실행하는 조건문
    - 일치 여부 확인은 일치 연산자(===)를 사용한 비교 연산처럼 값과 자료형을 함께 비교
    - 하나 이상의 case문과 default문, break문 사용
    - default문은 생략해도 되지만, case문과 default문 중 하나 이상은 있어야 함
    */
    let food = "melon";
    switch(food){
        case "melon":   // food === "melon" 일 때 실행할 블록문
            console.log("fruit");
            break;
        case "apple":   // food === "apple" 일 때 실행할 블록문
            console.log("fruit");
            break;
        case "banana":  // food === "banana" 일 때 실행할 블록문
            console.log("fruit");
            break;
        case "carrot":  // food === "carrot" 일 때 실행할 블록문
            console.log("vegetable");
            break;
        default:        // 아무것도 일치하지 않을 때 실행할 블록문
            console.log("It's not fruits and vegetables.");
            break;
    }   // 실행결과 : fruit

    // break문을 의도적으로 생략해서 작성하기도 함
    // melon이든, apple이든, banana든 fruit을 출력하게 하는 코드
    let food2 = "melon";
    switch(food2){
        case "melon":   // food2 = "melon"인데 break가 없으므로 break문을 만날 때까지 밑으로 감
        case "apple":   // break문이 없으므로 밑으로 감
        case "banana":
            console.log("fruit");   // "fruit" 출력하고
            break;                  // break문을 만났으므로 종료
        case "carrot":
            console.log("vegetable");
            break;
        default:
            console.log("It's not fruits and vegetables.");
            break;
    }   // 실행결과 : fruit

/* 05-3 if문과 조건식 */
    // 점수가 90점 이상이면 A++ 학점이라고 출력하는 조건문
    let score1 = 90;
    if (score1 >= 90){
        console.log("A++ 학점");
    }
    // 위의 조건문에 점수가 100점 이하라는 조건 추가
    let score2 = 90;
    if (score2 >= 90 && score2 <= 100){ // 수학에서 사용하듯이 90 <= score2 <= 100 으로 작성하면 안됨
        console.log("A++ 학점");
    }

/* 05-4 if문 vs switch문 */
    /*
    if문과 switch문의 차이
    - if문은 조건에 식(statement)을 사용하고, switch문은 조건에 값(value)을 사용
    - switch문은 조건으로 값을 받기 때문에 조건이 범위일 때는 모든 값을 일일이 case문으로 정의해야 함
        - 조건이 범위인 경우에는 if문이 적합
        - 조건의 값이 하나일 때는 switch문이 더 적합
    */
    let score = 90;
    // 조건이 범위일 때 if문을 쓰면
    if (score >= 90 && score < 100){
        console.log("A++ 학점");
    }
    // 조건이 범위일 때 switch문을 쓰면
    switch(score){
        case 90:
        case 91:
        // (중략)
        case 99:
            console.log("A++ 학점");
            break;
        default:
            break;
    }
