// ДОДЕЛАТЬ!!!
// красно-черное дерево

#include <iostream>

using namespace std;

void deleteNode(Node* z)
{
    Node* x, * y;
    // у "y" ребенок является пустым (NIL)
    if (!z || z == NIL) return;

    if (z->left == NIL || z->right == NIL)
    {
        y = z;
    }
    else
    {
        y = z->right;
        while (y->left != NIL) y = y->left;
    }
    // "x" является одним ребенком "y"
    if (y->left != NIL) x = y->left;
}

Node* findNode(T data)
{
    Node* current = root;
    while (current != NIL)
    {
        if (compEQ(data, current->data)) return (current);
        else
        {
            current = compLT(data, current->data) ? current->left : current->right;
        }
    }
    return (0);
}

void main(int argc, char** argv)
{
    int a, maxnum = 100, ct;
    Node* t;
    
    // test:
   for (ct = maxnum; ct; ct--)
   {
    a = rand() % 9 + 1;
    if ((t = findNode(a)) != NULL)
    {
        deleteNode(t);
    }
    else
    {
        insertNode(a);
    }
   }
}