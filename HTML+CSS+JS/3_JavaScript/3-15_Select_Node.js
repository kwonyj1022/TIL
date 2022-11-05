/* 15 노드 선택하기 */
    /*
    문서 객체 모델은 window 객체의 document 객체를 사용해 조작
    */

/* 15-1 속성으로 노드 선택하기 */
    /*
    모든 노드 탐색 속성
    - parentNode : 부모 노드 반환
    - childNodes : 모든 자식 노드 반환
    - firstChild : 첫 번째 자식 노드 반환
    - lastChild : 마지막 자식 노드 반환
    - previousSibling : 이전 형제 노드 반환
    - nextSibling : 다음 형제 노드 반환

    요소 노드 탐색 속성
    - parentElement : 부모 요소 노드 반환
    - children : 자식 요소 노드 반환
    - firstElementChild : 첫 번째 자식 요소 노드 반환
    - lastElementChild : 마지막 자식 요소 노드 반환
    - previousElementSibling : 이전 요소 노드 반환
    - nextElementSibling : 다음 요소 노드 반환

/* 15-2 메서드로 노드 선택하기 */
    /* 
    속성값과 태그명 사용하기 - get 메서드
    - getElementById("id 속성값") : id 속성값과 일치하는 요소 노드를 1개만 선택
    - getElementsByClassName("class 속성값") : class 속성값과 일치하는 요소 노드를 모두 선택
    - getElementsByTagName("태그명") : 태그명과 일치하는 요소 노드를 모두 선택

    CSS 선택자 사용하기 - query 메서드
    - querySelector("CSS 선택자") : 매개변수로 넘어오는 CSS 선택자에 해당하는 노드를 1개만 선택
    - querySelectorAll("CSS 선택자") : 매개변수로 넘어오는 CSS 선택자에 해당하는 노드를 모두 선택
    */
