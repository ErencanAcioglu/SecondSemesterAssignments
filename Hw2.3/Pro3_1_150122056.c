//
//  main.c
//  Pro3_1_150122056
//
//  Created by Erencan Acıoğlu on 17.05.2023.
//
//  Erencan Acıoğlu 150122056


#include <stdio.h>


void reverseN(int *number, int N) {
        
    //We find number of digits with this code block.
    int countDigits = 0;
    int tempNum;
    for (tempNum = *number; tempNum > 0; tempNum /= 10) {
        countDigits++;
    }
    
    //Checking if N > digit number.
    if (N > countDigits) {
        printf("N must be less than %d!\n", countDigits+1);
        return;
    }
    
    
    //We reverse last N digits with this code block.
    int reversedNum = 0;
    int temp = *number;
    while (N > 0) {
        reversedNum = reversedNum * 10 + temp % 10;
        temp /= 10;
        N--;
    }
    
    //We rereverse the number in this code block.
    int tempReversed = reversedNum;
    int reReverseNum = 0;
    while (tempReversed != 0) {
        reReverseNum = (reReverseNum * 10) + tempReversed % 10;
        tempReversed /=  10;
    }
    
    //In this codeblock we do 63712-712+217= 63217. (N = 3)
    int finalNum = (*number) - (reReverseNum) + (reversedNum) ;
    printf("Reversed number: %d\n", finalNum);
    
}

int main(void) {
   
    int firstNum, secondNum;

    printf("Enter a number: ");
    scanf("%d", &firstNum);

    printf("Enter a number to reverse the last digits: ");
    scanf("%d", &secondNum);

    reverseN(&firstNum, secondNum);


    return 0;

}



