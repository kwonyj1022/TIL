#include <stdio.h>
int main(void)
{
	int b[3][2] = { {0, 1}, {2, 3}, {4, 5} };
	int(*bpp)[2] = b;
	int* bp = b[0];
	int i, j;

	printf("b   : %p\t *b   : %p\t **b   : %d\n", b, *b, **b);
	printf("bpp : %p\t *bpp : %p\t **bpp : %d\n", bpp, *bpp, **bpp);
	printf("bp  : %p\t *bp  : %d\n", bp, *bp);
	printf("---------------------------------------------------------------------\n");
	printf("\n");

	for (i = 0; i < 3; ++i) {
		printf("\n\t*b[%d]: %d \tb[%d]: %p \tbpp+%d: %p \t*(bpp+%d): %p \n",
			i, *b[i], i, b[i], i, bpp + i, i, *(bpp + i));
		printf("\t---------------------------------------------------------------------------------------------------\n");
		for (j = 0; j < 2; ++j) {
			printf("\t\t\t &b[%d][%d]: %p \t*(bpp+%d)+%d: %p \t*(*(bpp+%d)+%d): %d \t(*bpp+%d))[%d]: %d\n\n",
				i, j, &b[i][j], i, j, *(bpp + i) + j, i, j, *(*(bpp + i) + j), i, j, (*(bpp + i))[j]);
		}
	}
	printf("--------------------------------------------------------------------------------------------------------------------------------\n\n");

	for (i = 0; i < 6; ++i) {
		printf("\t\tbp+%d   : %p\t *(bp+%d)   : %d\n", i, bp + i, i, *(bp + i));
		printf("\t\tb[0]+%d : %p\t *(b[0]+%d) : %d\n\n", i, b[0] + i, i, *(b[0] + i));
	}
	return 0;
}