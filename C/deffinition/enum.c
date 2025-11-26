#include <stdio.h>

enum boolean {false, true};

enum boolean evenCheck(int n) {
    enum boolean checkResult;
    if (n % 2 == 0) checkResult = true;
    else checkResult = false;
    return checkResult;
}

int main() {
    int num;
    enum boolean result;

    scanf("%d", &num);
    result = evenCheck(num);

    if (result == true) 
        printf("even\n");
    else 
        printf("odd\n");

    return 0;
}

enum week {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};

int main()
{
    // creating today variable of enum week type
    enum week today;
    today = Sunday;
    printf("Day %d",today+1);
    return 0;
}

/*Penggunaan enum sebagai Stiker saja dan enum bersifat int
dan ini adalah contoh lainnya*/
enum designFlags {
	BOLD = 1,
	ITALICS = 2,
	UNDERLINE = 4
};

int main() {
	int myDesign = BOLD | UNDERLINE; 

        //    00000001 -> 1
        //  | 00000100 -> 4
        //  ___________     OR
        //    00000101 -> 5

	printf("%d", myDesign); // -> Hasilnya 5

	return 0;
}