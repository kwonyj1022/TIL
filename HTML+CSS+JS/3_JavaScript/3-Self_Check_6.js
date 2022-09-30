/* Self Check 6 */
// 입력받은 키와 몸무게로 체질량지수(BMI)를 계산해서 비만, 과체중, 정상, 저체중을 반환하는 함수
function bmi(cm, kg){
    let bmi = kg / ((cm / 100) ** 2);
    if (bmi >= 26) return "비만";
    else if (bmi >= 24) return "과체중";
    else if (bmi >= 18.5) return "정상";
    else return "저체중";
}