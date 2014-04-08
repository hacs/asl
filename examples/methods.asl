func main()
  a = [];

  i = 0;
  while i < 10 do
    a.append(i);
    i = i + 1;
  endwhile;

  i = 0;
  while i < a.size() do
    write a[i]; write "%n";
    i = i + 1;
  endwhile;
endfunc

/* Output:
0
1
2
3
4
5
6
7
8
9
*/