/* Self Check 3 */
// 100부터 999까지 정수 중에서 암스트롱 수에 해당하는 숫자를 모두 출력하는 코드
for (let i = 100; i < 1000; i++){
    let hundred = parseInt(i / 100);
    let ten = parseInt((i % 100) / 10);
    let one = i % 10;
    if ((hundred ** 3) + (ten ** 3) + (one ** 3) === i){
        console.log(i);
    }
}