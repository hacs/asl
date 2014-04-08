

func main()
	L = [[],[]];
	L = [] ++ [];
	L = [1,2,3] ++ [] ++ [4,5] ++ 6; //semantically incorrect (because 6 is not a list)
	L = L ++ [1] ++ id1 ++ [true] ++ id2
endfunc

/*
func main()
	L = [1];
	while i != 0 do
		L = L ++ [i];
		read i
	endwhile;
	max = 0;
	i = 1;
	while i < len(L) do
		if L[i] > L[max] then max = i endif
	endwhile;
	write "The maximum is "; write L[max]; write "%n"
endfunc
*/

/*
func main()
	L = []
	L = [1,2,34,4]
	L = [true,false,1,2,3]
	L = [[],[1,2],[true,false]]
	L = L ++ [[[]]]
	len(L)
	L[i]
	L[2+3]
	func(L)
	func([2,3])
*/