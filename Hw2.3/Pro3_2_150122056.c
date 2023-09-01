//
//  main.c
//  Pro3_2_150122056
//
//  Created by Erencan Acıoğlu on 16.05.2023.
//
//Erencan Acıoğlu 150122056

#include <stdio.h>

//In the first version, we implement it with ITERATION.
double calculateWeightBackv1(int row, int col) {
    //We assume that there might be at most 30 levels.
    double humanPyramid[30][30];
    int i;
    for (i = 0 ; i <= row; i++) {
        int j;
        for (j = 0; j <= i; j++) {
            
            double weight = 80.0;
            double weight2 = humanPyramid[i - 1][j];
            double weight3 = humanPyramid[i - 1][j - 1];
            double weight4 = (weight2 + weight3)/2;

            humanPyramid[i][j] = weight + weight4;
           
        }
    }

    return humanPyramid[row][col]-80;
}

//In the second version, we implement it with RECURSION.
double calculateWeightBackv2(int row, int col) {
    //We assume that there might be at most 30 levels.
    if(row > 30 ||col > 30){
        return -1;
    }
    else{
        double weight = 80.0;
        //0,0 is 0.
        if(row == 0 && col == 0){
            return 0.0;
            
        } else if(col == 0){
            return (calculateWeightBackv2(row - 1, col) + weight)/2;
            
        } else if(row == col){
            return (calculateWeightBackv2(row - 1, col - 1) + weight)/2;
            
        } else {
            double weight2 = calculateWeightBackv2(row - 1, col)/2 + calculateWeightBackv2(row - 1, col - 1)/2;
                            
            return weight + weight2;
            
        }
        
    }
}


int main(void) {
    int row, col;
    
    printf("Enter row and column numbers with comma between numbers: : ");
        scanf("%d,%d", &row, &col);

    printf("ITERATION version: %.2lf\n", calculateWeightBackv1(row, col));

    printf("RECURSION version: %.2lf\n", calculateWeightBackv2(row, col));

    return 0;
    
}



