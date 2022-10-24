#pragma once
class Polynomial;	// 전방 선언

class Term {
	friend Polynomial;
private:
	float coef;		// 계수
	int exp;		// 지수
};

class Polynomial {
	Term* termArray;	// 0이 아닌 항의 배열
	int capacity;		// termArray의 크기
	int terms;			// 0이 아닌 항의 수

	void NewTerm(const float theCoeff, const int theExp);
	Polynomial Add(Polynomial b);
};