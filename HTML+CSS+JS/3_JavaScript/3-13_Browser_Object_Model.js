/* 13 브라우저 객체 모델 사용하기 */
    /*
    브라우저 객체 모델 (BOM, Browser Object Model) : 자바스크립트 언어 사양에 포함되지 않고 웹 브라우저에서 제공하는 객체
        - 최상위에 window 객체가 있고 그 아래에 document, location, history, navigator, screen 객체가 있음
            - window 객체 : 웹 브라우저가 열릴 때마다 생성되는 최상위 관리 객체
            - document 객체 : 웹 문서와 관련 있는 기능이 모여 있음 (웹 브라우저에 표시되는 HTML 문서 정보가 포함된 객체)
            - location 객체 : 현재 페이지의 URL 정보가 담겨 있음
            - history 객체 : 방문 기록 정보가 담겨 있음
            - navigator 객체 : 웹 브라우저의 정보가 담겨 있음
            - screen 객체 : 방문자의 화면 정보를 담고 있음
    */
    /* 자바스크립트 사양에서 지원하는 기능이 아니므로 코드를 웹 브라우저로 실행해야 함 */
    /*
    다양한 브라우저 모델 객체
    https://developer.mozilla.org/ko/docs/Web/API
    */

/* 13-1 window 객체의 속성과 메서드 */
    /*
    자주 사용하는 속성
        - innerWidth : 웹 브라우저 화면의 너비를 px(픽셀) 단위로 나타냄
        - innerHeight : 웹 브라우저 화면의 높이를 px 단위로 나타냄
        - outerWidth : 웹 브라우저 창의 너비를 px 단위로 나타냄
        - outerHeight : 웹 브라우저 창의 높이를 px 단위로 나타냄
        - screenTop / screenY : 웹 브라우저의 위쪽 면과 모니터의 간격을 px 단위로 나타냄
        - screenLeft / screenX : 웹 브라우저의 왼쪽 면과 모니터의 간격을 px 단위로 나타냄
        - pageXOffset / scrollX : 웹 브라우저의 수평 스크롤 위치를 px 단위로 나타냄
        - pageYOffset / scrollY : 웹 브라우저의 수직 스크롤 위치를 px 단위로 나타냄
    자주 사용하는 메서드
        - alert() : 알림창 표시
        - confirm() : 확인창 표시
        - prompt() : 입력창 표시
        - open() : 새로운 웹 브라우저 창을 엶
        - close() : 웹 브라우저 창을 닫음
        - setTimeout() : 일정 시간(ms) 뒤에 콜백 함수를 한 번만 실행
        - setInterval() 일정 시간(ms)마다 콜백 함수를 반복적으로 실행
        - clearInterval() : setInterval() 메서드로 반복 실행되는 함수를 중지함
        - scrollTo() : 웹 브라우저의 스크롤을 특정 위치만큼 이동
        - scrollBy() : 웹 브라우저의 스크롤을 현재 위치에서 상대적 위치로 이동

/* 13-2 window 객체의 기본 속성 사용하기 */


/* 13-3 웹 브라우저에서 새 창 제어하기
    /*
    window.open(경로, 이름, 속성);
        - open() 메서드는 이름이 같은 창은 1개만 엶
        - 세 번ㅉ 매개변수에 사용할 수 있는 속성 (width, height, left, top)
        - open() 메서드로 열린 창은 close() 메서드로 닫을 수 있음
    */

/* 13-4 웹 브라우저의 스크롤 이동하기 */
    /*
    scrollTo() 메서드 : 웹 브라우저의 스크롤 위치를 특정 좌표로 이동하게 함
    scrollBy() 메서드 : 웹 브라우저의 스크롤을 현재 위치에서 상대적인 위치로 이동하게 함

    scrollTo(100, 200);     // 메서드를 여러 번 호출해도 (100, 200) 위치로 스크롤이 이동함
    scrollBy(100, 200);     // 메서드를 호출할 때마다 웹 브라우저의 스크롤이 계속 이동
    
    함수의 인자로 객체 리터럴을 전달받을 수 있음
    behavior 속성값을 smooth로 하면 웹 브라우저 스크롤이 해당 위치로 마우스 휠을 굴리듯이 부드럽게 이동 (IE, 사파리 웹 브라우저에서는 지원 X)
    */