//
//  main.c
//  Pro4_150122056
//
//  Created by Erencan Acıoğlu on 3.06.2023.
//
//  Erencan Acıoğlu 150122056

#include <stdio.h>
#include <string.h>


struct String{

    //51 for null character.
    char ch[51];
    int stLength;

};

//calculates length of string
int stringLengthMethod(struct String* str){
    int len = 0;
    while (str->ch[len] != '\0') {
        len++;
    }

    return len;
}


int charAt(struct String*s, int index){
    if (index < 0 || index >= s->stLength) {
        return -1;
    }
    else{
        return s->ch[index];
    }
}

struct String* concat(struct String* s1, struct String* s2){

    struct String* copy = s1;
    int len1 = stringLengthMethod(s1->ch);
    int len2 = stringLengthMethod(s2->ch);

    //51+51+1, 1 is for space char.
    if (len1 + len2 < 103) {

        s1->ch[len1-1] = ' ';
        s1->stLength = len1;


        strcpy((*copy).ch + len1, s2->ch);
        (*copy).stLength = len1 + len2;
    }

    return copy;

}

unsigned int strSearch(struct String*s1,struct String*s2){

    int len1 = stringLengthMethod(s1->ch);
    int len2 = stringLengthMethod(s2->ch);

    int i;
    int j;
    for(i = 0; i <= len1; i++){
        for(j = 0; j < len2; j++){
            if(s1->ch[i] == s2->ch[j]){
                return len1;
            }else{
                return 0;;
            }

        }

    }



    return 0;

}

unsigned int findScore(struct String *s1){
    unsigned int len = s1->stLength;
    unsigned int score = 0;
    int i = 0;

    for(i = 0; i < len; i++){
        char scoreCh = s1->ch[i];

        if (scoreCh == 'A' || scoreCh == 'E' || scoreCh == 'I' || scoreCh == 'O' || scoreCh == 'U' || scoreCh == 'L' || scoreCh == 'N' || scoreCh == 'R' || scoreCh == 'S' || scoreCh == 'T') {
            score += 1;
        }
        else if (scoreCh == 'D' || scoreCh == 'G') {
            score += 2;
        }
        else if (scoreCh == 'B' || scoreCh == 'C' || scoreCh == 'M' || scoreCh == 'P') {
            score += 3;
        }
        else if (scoreCh == 'F' || scoreCh == 'H' || scoreCh == 'V' || scoreCh == 'W' || scoreCh == 'Y') {
            score += 4;
        }
        else if (scoreCh == 'K') {
            score += 5;
        }
        else if (scoreCh == 'J' || scoreCh == 'X') {
            score += 8;
        }
        else if (scoreCh == 'Q' || scoreCh == 'Z') {
            score += 10;
        }
        if (scoreCh == 'a' || scoreCh == 'e' || scoreCh == 'i' || scoreCh == 'o' || scoreCh == 'u' || scoreCh == 'l' || scoreCh == 'n' || scoreCh == 'r' || scoreCh == 's' || scoreCh == 't') {
            score += 1;
        }
        else if (scoreCh == 'd' || scoreCh == 'g') {
            score += 2;
        }
        else if (scoreCh == 'b' || scoreCh == 'c' || scoreCh == 'm' || scoreCh == 'p') {
            score += 3;
        }
        else if (scoreCh == 'f' || scoreCh == 'h' || scoreCh == 'v' || scoreCh == 'w' || scoreCh == 'y') {
            score += 4;
        }
        else if (scoreCh == 'k') {
            score += 5;
        }
        else if (scoreCh == 'j' || scoreCh == 'x') {
            score += 8;
        }
        else if (scoreCh == 'q' || scoreCh == 'z') {
            score += 10;
        }


    }

    return score;
}


int wordCount(struct String* s1){
    int len = s1->stLength;
    int wordCount = 0;
    
    int i;
    
    for (i = 0; i < len; i++) {
           if (s1->ch[i] == ' ') {
               wordCount++;
           }
       }
     

       return wordCount+1;
   }

int letterCount(struct String* s1){
    int len = s1->stLength;
    int letterCount = 0;
    int i;

       for (i = 0; i < len; i++) {
           if ((s1->ch[i] >= 'A' && s1->ch[i] <= 'Z') || (s1->ch[i] >= 'a' && s1->ch[i] <= 'z')) {
               letterCount++;
           }
       }

       return letterCount;
   }



int main(int argc, const char* argv[]) {
    
    FILE* inputFile = fopen("input.txt", "r");
    FILE* outputFile = fopen("output.txt", "w");
    
    if (inputFile == NULL) {
        printf("Could not find input file.\n");
        return 0;
    }
    if (outputFile == NULL) {
        printf("Could not find output file.\n");
        return 0;
    }
    
    
    struct String str;
    struct String temp;
    int totalWordCount = 0;
    int totalLetterCount = 0;
    
    while (fgets(str.ch, sizeof(str.ch), inputFile)) {
        
        str.stLength = stringLengthMethod(&str);
        
        int len = str.stLength;
        int i;
        for (i = 0; i < len; i++) {
            if (str.ch[i] == ':') {
                break;
            }
            else {
                temp.ch[i] = str.ch[i];
            }
        }
        
        temp.ch[i] = '\0';
        
        int option = 0;
        if (str.ch[i] == ':') {
            i++;
            while (i < len && str.ch[i] >= '0' && str.ch[i] <= '9') {
                option = option * 10 + (str.ch[i] - '0');
                i++;
            }
        }
        
        int afterCommaInt = 0;
        struct String afterCommaStr;
        if (str.ch[i] == ',') {
            i++;
            if (str.ch[i] >= '0' && str.ch[i] <= '9') {
                while (i < len && str.ch[i] >= '0' && str.ch[i] <= '9') {
                    afterCommaInt = afterCommaInt * 10 + (str.ch[i] - '0');
                    i++;
                }
            }
            else {
                int j = 0;
                while (i < len && str.ch[i] != '\n') {
                    afterCommaStr.ch[j] = str.ch[i];
                    i++;
                    j++;
                }
                afterCommaStr.ch[j] = '\0';
            }
        }
        
        
        
        if (strcmp(temp.ch, "exit\n") == 0 || strcmp(temp.ch, "quit\n") == 0) {
            fprintf(outputFile, "Program ends. Bye\n");
            break;
        }
        if (strcmp(temp.ch, "stat\n") == 0) {
            fprintf(outputFile, "The number of words: %d\n", totalWordCount);
            fprintf(outputFile, "The number of alphabetic letters: %d\n", totalLetterCount);
            
            
        }
            
        else if (option == 1) {
            fprintf(outputFile, "%c\n", charAt(&str, afterCommaInt));
        }
        else if (option == 2) {
            concat(&str, &afterCommaStr);
            fprintf(outputFile, "%s\n", str.ch);
        }
        else if (option == 3) {
            fprintf(outputFile, "%d\n", strSearch(&str, &afterCommaStr));
        }

        else if (option == 4) {
            fprintf(outputFile, "%d\n", findScore(&str));
        }
        
        totalWordCount += wordCount(&str);
        totalLetterCount += letterCount(&str);
    }
}
