#include <stdio.h>

int main(void) {
	int numLines;
	scanf("%d", &numLines);

	for(int i = 0; i < numLines; i++) {
		int noAdRevenue, adRevenue, cost;
		scanf("%d", &noAdRevenue);
		scanf("%d", &adRevenue);
		scanf("%d", &cost);

		if (adRevenue - cost > noAdRevenue) {
			printf("advertise\n");
		} else if (adRevenue - cost == noAdRevenue) {
			printf("Does not matter\n");
		} else {
			printf("do not advertise\n");
		}
	}



	return 0;
}