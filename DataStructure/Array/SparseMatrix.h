#pragma once
class SparseMatrix;

class MatrixTerm {
	friend class SparseMatrix;
private:
	int row, col, value;
};

class SparseMatrix {
private:
	int rows;		// 행의 수
	int cols;		// 열의 수
	int terms;		// 0이 아닌 항의 총 수
	int capacity;	// smArray의 크기
	MatrixTerm* smArray;

public:
	SparseMatrix Transpose();
    SparseMatrix FastTranspose();
};