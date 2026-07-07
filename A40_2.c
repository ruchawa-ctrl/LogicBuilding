#include<stdio.h> 
#include<stdlib.h> 
#include<stdbool.h>

struct Node     // Structre Defination 
{ 
    int data; 
    struct Node * next; 
}; 

typedef struct Node NODE; 
typedef struct Node * PNODE; 
typedef struct Node ** PPNODE; 
/*---------------------------------------------------------- 
            Old Name                    New Name 
 ---------------------------------------------------------- 
            struct Node                     NODE 
            struct Node *                  PNODE 
            struct Node **                PPNODE 
 ----------------------------------------------------------*/ 
/////////////////////////////////////////////////////////////////// 
// 
// Function name  : InsertFirst 
// Description       : Used to insert at first position of Linked List 
// Parameters       : Addreass of First pointer & data of node 
// Return Value     : void 
// 
/////////////////////////////////////////////////////////////////// 
void InsertFirst(PPNODE Head, int no) 
{ 
    PNODE newn = NULL; 
    newn = (PNODE)malloc(sizeof(NODE)); // Allocate memory 
    newn-> data = no;   // Iniitialise data 
    newn-> next = NULL; // Initialise pointer 
     
    if(*Head == NULL) // Linkedlist is empty 
    { 
        *Head = newn; 
    } 
    else  // LL contains atleast one node 
    { 
        newn -> next = *Head; 
        *Head = newn; 
    } 
} 
/////////////////////////////////////////////////////////////////// 
// 
// Function name  : InsertLast 
// Description       : Used to insert at last position of Linked List 
// Parameters       : Addreass of First pointer & data of node 
// Return Value     : void 
// 
/////////////////////////////////////////////////////////////////// 
void InsertLast(PPNODE Head, int no) 
{ 
    PNODE newn = NULL; 
    PNODE temp = *Head; 
     
    newn = (PNODE)malloc(sizeof(NODE)); // Allocate memory 
    newn-> data = no;   // Iniitialise data 
    newn-> next = NULL; // Initialise pointer 
     
    if(*Head == NULL) // Linkedlist is empty 
    { 
        *Head = newn; 
    } 
    else  // LL contains atleast one node 
    { 
            while(temp->next != NULL) 
            { 
                temp = temp->next;                                                                             
            } 
        temp -> next = newn; 
    } 
} 
/////////////////////////////////////////////////////////////////// 
// 
// Function name  : Display 
// Description       : Used to idisplay elements of Linked List 
// Parameters       : First pointer 
// Return Value     : void 
// 
/////////////////////////////////////////////////////////////////// 
void Display(PNODE Head) 
{ 
    while(Head != NULL) 
    { 
        printf("%d\t",Head->data); 
        Head = Head -> next; 
    } 
} 

/////////////////////////////////////////////////////////////////// 
// 
// Function name  : FirstOccur
// Description       : Used to find the first occurrence of an odd element in the Linked List
// Parameters       : First pointer 
// Return Value     : void 
// 
///////////////////////////////////////////////////////////////////
int FirstOccur(PNODE Head, int iNo)
{
    int iCnt = 1;
    while(Head != NULL)
    {
        if(Head->data == iNo)
        {
            return iCnt;
        }
        Head = Head->next;
        iCnt++;
    }
    return -1; // Return -1 if the element is not found
}

int main() 
{ 
    int iRet = 0; 
     
    PNODE First = NULL; 
    InsertFirst(&First, 51); 
    InsertFirst(&First, 21); 
    InsertFirst(&First, 11); 
     
    Display(First); 
     
    InsertLast(&First,101); 
    InsertLast(&First,111); 
     
    Display(First); 
     
    iRet = FirstOccur(First, 21);
    printf("First occurrence of 21 is at position: %d\n", iRet);
     
    return 0; 
} 