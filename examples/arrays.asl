func main()
    array = [1, 2, 3, [1, 2], "hello"];
    write array[3]; write "%n";

    array[2] = true;

    if array[2] then
        write array; write "%n";
    endif;

    array[1] = false;
    if array[1] then
        write "Ooops..."; write "%n";
    endif;

    write "hello"[1]; write "%n";
endfunc
