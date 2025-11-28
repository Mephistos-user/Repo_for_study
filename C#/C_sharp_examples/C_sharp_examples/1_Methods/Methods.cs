//Рекурсия

int factorial_1(int n)
{
    if (n == 1)
    {
        return 1;
    } 
    else
    {
        return n * factorial_1(n - 1);
    }
}

int factorial_2(int n)
{
    return n == 1 ? 1 : n * factorial_2(n - 1);
}

int fibonachi_1(int n)
{
    if (n == 1 || n == 2)
    {
        return 1;
    }
    else
    {
        return fibonachi_1(n - 1) + fibonachi_1(n-2);
    }
}

int fibonachi_2(int n)
{
    return (n == 1 || n == 2) ? 1 : fibonachi_2(n - 1) + fibonachi_2(n-2);

}

//Без рекурсии эффективней
int fibonachi_3(int n)
{
    int fib1 = 1, fib2 = 1;
    int fib_sum = 0;

    for (int i = 0; i < n - 2; i++)
    {
        fib_sum = fib1 + fib2;
        fib1 = fib2;
        fib2 = fib_sum;
    }
    return fib_sum;
}



Console.WriteLine(factorial_1(4));

Console.WriteLine(factorial_2(5));

Console.WriteLine(fibonachi_1(8));

Console.WriteLine(fibonachi_2(9));

Console.WriteLine(fibonachi_3(7));