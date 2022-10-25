#include <iostream>
#include "SparseMatrix.h"

SparseMatrix SparseMatrix::Transpose()
{ // Return the transpose of *this
	SparseMatrix b(cols, rows, terms);	// capacity of b.smArray is terms
	if (terms > 0)
	{ // nonzero matrix
		int currentB = 0;
		for (int c = 0; c < cols; c++)	// transpose by columns
			for (int i = 0; i < terms; i++)
				// find and move terms in column c
				if (smArray[i].col == c) {
					b.smArray[currentB].row = c;
					b.smArray[currentB].col = smArray[i].row;
					b.smArray[currentB++].value = smArray[i].value;
				}
	} // end of if (terms > 0)
	return b;
}