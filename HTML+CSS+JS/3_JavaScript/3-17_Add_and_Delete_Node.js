/* 17 노드 추가/삭제하기 */

/* 17-1 노드 추가하기 */
    /*
    새로운 요소를 화면에 추가하려면 DOM 트리에 새로운 노드를 생성하고, 생성한 노드를 기존의 DOM 트리 노드와 연결해야 함
    - 노드 생성 메서드
        - createElement() : 요소 노드 생성
        - createTextNode() : 텍스트 노드 생성
        - createAttribute() : 속성 노드 생성
    - 노드 연결 메서드
        - 기준노드.appendChild(자식노드) : 기준노드에 자식노드 연결
        - 기준노드.setAttributeNode(속성노드) : 기준노드에 속성노드 연결
    */
    // a 요소 노드 추가
    const aEl = document.createElement("a");    // 요소 노드 생성
    document.body.appendChild(aEl);             // a 요소 노드를 body 요소 노드의 자식 노드로 연결
    // text 노드 추가
    const txEl = document.createTextNode("길벗");
    document.querySelector("a").appendChild(txEl);
    // href 속성 노드 추가
    const hrefAttr = document.createAttribute("href");
    hrefAttr.value = "https://www.gilbut.co.kr";
    document.querySelector("a").setAttributeNode(hrefAttr);

/* 17-2 노드 삭제하기 */
    /*
    노드를 삭제할 때는 removeChild() 메서드 사용
    - 부모 노드에서 사용해야 함
    <형식>
    부모노드.removeChild(자식노드) : 부모노드에 연결된 자식노드 삭제
    */
    // h1 요소 노드 찾아서 삭제
    const h1El = document.querySelector("h1");
    h1El.parentNode.removeChild(h1El);
    // DOM 트리 순회하면서 p 태그에 해당하는 요소 노드 모두 삭제
    const childNodes = document.body.childNodes; 
    childNodes.forEach((node)=>{
        if(node.nodeName === "P") 
            node.parentNode.removeChild(node);
    })