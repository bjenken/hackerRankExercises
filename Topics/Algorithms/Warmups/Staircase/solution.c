#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
	//Link to Problem: https://www.hackerrank.com/challenges/staircase
    int n; 
    scanf("%d",&n);
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            if (j >= n-1-i)
                printf("%s", "#");
            else
                printf("%s", " ");
        }
        printf("\n");
    }
    return 0;
}