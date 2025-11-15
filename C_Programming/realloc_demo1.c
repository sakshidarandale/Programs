#include<stdio.h>
#include<stdlib.h>

int main()
{
    
    int *Arr=NULL;
    
    //Step 1:Allocate the memory
    Arr=(int*)malloc(5 * sizeof(int));

    //Step2:Use the memory

    Arr=(int*)realloc(Arr,10*sizeof(int));


    //Step3:Free the memory
    free(Arr);

    return 0;
}