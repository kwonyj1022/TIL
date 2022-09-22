/* Self Check 1 */
// 숫자 1부터 999까지 짝수가 몇 개인지 출력하는 코드
let cnt = 0;
for (let i = 1; i <= 999; i++){
    if (i % 2 === 0){
        cnt++;
    }
}
console.log(`짝수의 개수는 ${cnt}개입니다.`);