/* 16 노드 조작하기 */

/* 16-1 콘텐츠 조작하기 */
    /*
    콘텐츠 조작 속성은 접근한 노드의 콘텐츠를 가져올 뿐만 아니라 속성에 값을 할당하면 각 노드의 콘텐츠를 바꿀 수도 있음
    - textContent : 요소 노드의 모든 텍스트에 접근
    - innerText : 요소 노드의 텍스트 중 웹 브라우저에 표시되는 텍스트에만 접근
    - innerHTML : 요소 노드의 텍스트 중 HTML 태그를 포함한 텍스트에만 접근
    */

/* 16-2 스타일 조작하기 */
    /*
    style 속성으로 요소에 스타일(CSS) 지정 가능
    - 노드.style.css속성명 = 속성값;
    - 속성명에 대시(-)가 있는 속성은 카멜 표기법으로 변경해서 작성해야 함
    */

/* 16-3 클래스 속성 조작하기 */
    /*
    선택한 요소에 class 속성 지정 가능 (-> CSS에 저장된 스타일을 적용할 수 있음)
    - 노드.classList.add("class 속성값");       // 추가
    - 노드.classList.remove("class 속성값");    // 삭제
    - 노드.classList.toggle("class 속성값");    // 추가와 삭제 반복
    */

/* 16-4 데이터 속성 조작하기 */
    /*
    data-* 속성 : HTML 문법에서 사용할 수 있는 속성 외에 사용자가 원하는 속성을 추가할 수 있게 한 사용자 정의 속성
                    자바스크립트의 dataset 속성을 사용해 조작 가능
                    - dataset 속성 : HTML 문서에서 data-* 속성을 가져오거나 지정
                    - dataset 속성으로 노드의 data-* 속성에 대한 정보를 가져오면, 정보가 DOMStringMap 객체에 담겨 반환됨
                    - data-abc 속성의 값만 가져오고 싶으면 노드.dataset.abc 형식으로 접근 가능
                    - data-abc 속성의 값을 바꿀 수도 있음
    */

/* 16-5 메서드로 속성 조작하기 */
    /*
    - 노드.getAttribute("속성명"); : 속성값 가져옴
    - 노드.setAttribute("속성명", "속성값"); : 속성값 설정
    - 노드.removeAttribute("속성명"); : 속성 삭제
    - getAttribute() 메서드와 setAttribute() 메서드는 모든 속성의 상위 메서드이기 때문에
        classList 속성이나 dataset 속성으로 하는 조작을 전부 할 수 있음
    */

/* 참고) classList 속성과 setAttribute() 메서드 */
    /*
    classList 속성으로 class 속성값을 추가하거나 삭제하면 기존 요소가 가지고 있던 class 속성값을 보존하면서 추가하거나 삭제
    setAttribute() 메서드는 아예 속성값을 새로 설정하는 것이어서 기존 class 속성값을 보존하지 않음
    classList 속성의 remove() 메서드와 removeAttribute() 메서드도 마찬가지
    */