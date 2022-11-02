function popup(){
    const left = (screen.availWidth - 500) / 2 + window.screenX;
    const top = (screen.availHeight - 300) / 2;
    window.open('https://google.com', 'popup', 'width=500, height=300, left=' + left + ', top=' + top);
}
