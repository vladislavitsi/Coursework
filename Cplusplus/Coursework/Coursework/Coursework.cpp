// Coursework.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include <Windows.h>
#include <iostream>  


int main()
{
	POINT pt;
	while (true)
	{  
		GetCursorPos(&pt);

		if (GetAsyncKeyState(VK_SPACE)) {
			std::cout << "Space  " << std::dec << pt.x << std::endl;
		}
		if (GetAsyncKeyState(VK_ESCAPE)) {
			exit(0);
		}
		for (int i = 1; i < 136; i++) {
			if (GetAsyncKeyState(i)) {
				std::cout << std::hex << i << std::endl;
			}
		}
		Sleep(100);
	}
    return 0;
}

