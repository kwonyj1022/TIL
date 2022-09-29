/* Self Check 5 */
// 매개변수로 배열을 전달받아 배열의 요소 중 가장 큰 수를 찾아 반환하는 함수 (배열 안의 데이터는 모두 0보다 큰 정수)
function max(arr){
    let m = 0;
    for (let i = 0; i < arr.length; i++){
        if (m < arr[i]) {
            m = arr[i];
        }
    }
    return m;
}