/* 19 이벤트 다루기 */
    /*
    이벤트 : 웹 브라우저와 사용자 사이에 상호작용이 발생하는 특정 시점
            이벤트 종류에 따라 어떤 작업을 하거나 미리 등록한 함수를 호출 가능
    */

/* 19-1 이벤트 종류 */
    /*
    - 마우스 이벤트
        - onclick : 마우스로 클릭하면 발생
        - ondblclick : 마우스로 빠르게 두 번 클릭하면 발생
        - onmouseover : 마우스 포인터를 올리면 발생
        - onmouseout : 마우스 포인터가 빠져나가면 발생
        - onmousemove : 마우스 포인터가 움직이면 발생
        - onwheel : 마우스 휠(wheel)을 움직이면 발생
    - 키보드 이벤트
        - onkeypress : 키보드 버튼을 누르고 있는 동안 발생
        - onkeydown : 키보드 버튼을 누른 순간 발생
        - onkeyup : 키보드 버튼을 눌렀다가 뗀 순간 발생
    - 포커스 이벤트
        - onfocus : 요소에 포커스가 되면 발생
        - onblur : 요소가 포커스를 잃으면 발생
    - 폼 이벤트
        - onsubmit : 폼이 전송될 때 발생
    - 리소스 이벤트
        - onload : 웹 브라우저의 리소스 로드가 끝나면 발생
    - 기타 다른 이벤트는 https://developer.mozilla.org/ko/docs/Web/Events#non-standard_events 에서 확인
    */

/* 19-2 이벤트 등록하기 */
    /*
    인라인 방식으로 이벤트 등록하기
        - HTML 태그에 속성으로 이벤트를 등록하는 방법
    프로퍼티 리스너 방식으로 이벤트 등록하기
        - 프로퍼티 리스너(property listener) : 요소 노드에 직접 속성으로 이베트를 등록하는 방법
    이벤트 등록 메서드로 이벤트 등록하기
        - DOM에서 제공하는 addEventListener() 메서드 사용
        - 가장 권장하는 방식임
        - 형식
            노드.addEventListener("이벤트타입", 이벤트함수);
    */