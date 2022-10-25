#include <iostream>
#include "SparseMatrix.h"

SparseMatrix SparseMatrix::FastTranspose()
{ // Return the transpose of *this in O(terms+cols) time
	SparseMatrix b(cols, rows, terms);
	if (terms > 0)
	{ // nonzero matrix
		int* rowSize = new int[cols];
		int* rowStart = new int[cols];
		// compute rowSize[i] = number of terms in row i of b
		fill(rowSize, rowSize + cols, 0);
		// rowStart[i] = starting position of row i in b
		rowStart[0] = 0;
		for (int i = 1; i < cols; i++)
			rowStart[i] = rowStart[i - 1] + rowSize[i - 1];
		for (int i = 0; i < terms; i++)
		{ // copy from *this to b
			int j = rowStart[smArray[i].col];
			b.smArray[j].row = smArray[i].col;
			b.smArray[j].col = smArray[i].row;
			b.smArray[j].value = smArray[i].value;
			rowStart[smArray[i].col]++;
		} // end of for
		delete[] rowSize;
		delete[] rowStart;
	} // end of if
	return b;
}