/* 18 폼 조작하기 */

/* 18-1 form 태그 선택하기 */
    /*
    - 방법1 : forms 속성으로 선택
        - 모든 form 태그의 노드 정보를 HTMLCollection 객체에 담아 반환
        - 화면에 있는 form 요소 노드를 쉽게 선택할 수 있음
        - HTMLCollection 객체는 유사 배열이라서 인덱스를 사용해 form 요소 노드에 하나씩 접근할 수 있음
        - form 태그 위치가 바뀌면 잘못 참조하게 되어 예기치 않게 오류가 발생할 수 있다는 단점 존재
    - 방법2 : name 속성으로 선택
        - form 태그의 순서가 바뀌어도 문제가 발생하지 않음
    */
    // forms 속성 사용하기
    document.forms;     // HTMLCollection 객체에 모든 form 요소 노드의 정보가 담김
    document.forms[0];

    // name 속성 사용하기
    document.frm1;      // form 태그의 name 속성값이 frm1인 노드
    document.frm2;      // form 태그의 name 속성값이 frm2인 노드
    document.frm3;      // form 태그의 name 속성값이 frm3인 노드

/* 18-2 폼 요소 선택하기 */
    /*
    form 요소에 있는 input 태그, select 태그, button 태그 등을 선택하는 방법
    - elements 속성으로 선택
        - form 요소 노드의 하위 노드 중 폼 요소 노드의 정보를 HTMLFormControlsCollection 객체에 담아 반환
        - 접근할 때는 인덱스를 사용하거나 name 속성값 사용
    */
    // elements 속성 - 인덱스 사용
    document.fm.elements[0];     // 0번 인덱스 노드
    // elements 속성 - name 속성값 사용
    documents.form1['uname'];      // form 요소 노드의 하위 노드 중에서 name 속성값이 uname인 노드
    // elements 속성 생략하고 name 속성값으로 바로 접근
    document.fm.uname;
    document.fm.age;
    document.forms[1].gender;

/* 18-3 폼 요소의 입력값 다루기 */
    /*
    한 줄 입력 요소 다루기
    - 한 줄 입력 요소 : input 태그의 type 속성값을 text, password, number, url, search, email 등으로 지정했을 때 표시되는 폼 요소
    - 사용자가 입력한 값을 가져오려면 해당 요소 노드에서 value 속성을 사용하면 됨
    - value 속성에 값을 할당해 원하는 값을 자바스크립트로 입력 요소에 직접 삽입 가능
    */
    // 사용자가 입력한 값 가져오기
    document.form1.id.value;
    document.frm.pw.value;
    // 입력 요소에 값 직접 삽입
    document.form1.id.value = 'jscoding';
    document.form1.pw.value = 'aaaccc';

    /*
    여러 줄 입력 요소 다루기
    - 여러 줄 입력 요소 : textarea 태그를 사용하면 표시되는 폼 요소
    - 요소의 값을 가져오거나 설정하는 방법은 한 줄 입력 요소와 같음
    */
    // 사용자가 입력한 값 가져오기
    document.form2.desc.value;
    // 입력 요소에 값 직접 삽입
    document.form2.desc.value = 'setting!';

    /*
    체크박스 다루기
    - 체크박스도 value 속성으로 값을 가져올 수 있음
    - but, 체크박스에 체크 표시가 있는 것만 값을 가져와야하는 경우가 많음
        - 체크박스에 체크 표시가 있는지는 checked 속성으로 확인할 수 있음
        - 반복문으로 체크박스 노드에 하나씩 접근한 뒤에 checked 속성이 있는지 확인하고 있으면 value 속성으로 값을 가져오면 됨
    */
    // 체크 표시가 있는 것만 값을 가져오기
    const checkboxEls = document.querySelectorAll("[type='checkbox']");
    for (let i = 0; i < checkboxEls.length; i++) {
        if (checkboxEls[i].checked === true) {
            console.log(checkboxEls[i].value);
        }
    }
    // 체크박스를 모두 체크된 상태로 바꾸기
    const checkboxEls2 = document.querySelectorAll("[type='checkbox']");
    for (let i = 0; i < checkboxEls2.length; i++) {
        checkboxEls2[i].checked = true;
    }

    /*
    라디오버튼 다루기
    - 라디오버튼은 여러 개의 항목 중 하나만 선택하게 할 때 사용하는 폼 요소
    - 체크박스와 같은 방식으로 값을 다룸
    - 체크박스처럼 checked 속성으로 라디오버튼이 선택됐는지 확인하고 value 속성으로 값을 가져옴
    - 라디오버튼을 선택된 상태로 만드는 방법도 checked 속성에 true 값 할당
        (라디오버튼은 여러 개를 선택하는 요소가 아니므로 원하는 항목만 선택될 수 있게 if문으로 처리)
    */
    // 선택된 항목의 value 속성값 출력
    const radioEls = document.querySelectorAll("[type='radio']");
    for (let i = 0; i < radioEls.length; i++) {
        if (radioEls[i].checked === true) {
            console.log(radioEls[i].value);
        }
    }
    // 라디오 버튼을 선택된 상태로 만들기
    const radioEls2 = document.querySelectorAll("[type='radio']");
    for (let i = 0; i < radioEls2.length; i++) {
        if (radioEls2[i].value === 'banana') {
            radioEls2[i].checked = true;
        }
    }

    /*
    콤보박스 다루기
    - select 태그로 만듦
    - 여러 항목에서 하나를 선택하는 형태의 폼 요소
    - selected 속성으로 선택된 항목 확인 가능
    - 콤보박스로 선택된 상태로 만드는 방법은 라디오버튼과 비슷
        (기본으로 한 항목만 선택 가능하므로 if문으로 원하는 항목을 선택하게 처리)
    */
    // 현재 선택된 콤보박스의 value 속성값 가져오기
    const optionEls = document.querySelectorAll("option");
    for (let i = 0; i < optionEls.length; i++) {
        if (optionEls[i].selected === true) {
            console.log(optionEls[i].value);
        }
    }
    // 콤보박스를 선택된 상태로 만들기
    const optionEls2 = document.querySelectorAll("option");
    for (let i = 0; i < optionEls2.length; i++) {
        if (optionEls2[i].value === 'banana') {
            optionEls2[i].selected = true;
        }
    }

    /* 파일 업로드 요소 다루기
    - 파일 업로드 요소 : input 태그의 type 속성값을 file로 지정하면 표시되는 요소
    - FileList 객체를 반환하는 files 속성 사용
    */
    // FileList 객체 생성 및 속성에 접근
    const fileObj = document.form6.upload.files;    // FileList 객체 반환
    console.log(filesObj);  // FileList 객체 출력됨
    fileObj[0].name;                // 파일 이름
    fileObj[0].size;                // 파일 크기
    fileObj[0].type;                // 파일 타입
    fileObj[0].lastModifiedDate;    // 파일 마지막 수정일

    /* 폼 요소 관련 메서드
    - submit() : 폼 요소의 값을 전송(submit)
    - focus() : 폼 요소에 포커스(커서)를 이동
    - 폼 요소 관련 메서드 전체 : https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormElement
    */