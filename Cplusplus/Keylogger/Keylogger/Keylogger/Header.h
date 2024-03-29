#pragma once
#include <map>

class Key {
private:std::map<int, char*> enVocabulary = {
	{ 0x41, "A" },
	{ 0x42, "B" },
	{ 0x43, "C" },
	{ 0x44, "D" },
	{ 0x45, "E" },
	{ 0x46, "F" },
	{ 0x47, "G" },
	{ 0x48, "H" },
	{ 0x49, "I" },
	{ 0x4A, "J" },
	{ 0x4B, "K" },
	{ 0x4C, "L" },
	{ 0x4D, "M" },
	{ 0x4E, "N" },
	{ 0x4F, "O" },
	{ 0x50, "P" },
	{ 0x51, "Q" },
	{ 0x52, "R" },
	{ 0x53, "S" },
	{ 0x54, "T" },
	{ 0x55, "U" },
	{ 0x56, "V" },
	{ 0x57, "W" },
	{ 0x58, "X" },
	{ 0x59, "Y" },
	{ 0x5A, "Z" },
	{ 0xBA, ":;" },
	{ 0xBC, "," },
	{ 0xBE, "." },
	{ 0xDB, "[{" },
	{ 0xDD, "]}" },
	{ 0xDE, "\ '\"" },

};
private:std::map<int, char*> ruVocabulary = {
	{ 0x46, "�" },
	{ 0xBC, "�" },
	{ 0x44, "�" },
	{ 0x55, "�" },
	{ 0x4C, "�" },
	{ 0x54, "�" },
	{ 0xC0, "�" },
	{ 0xBA, "�" },
	{ 0x50, "�" },
	{ 0x42, "�" },
	{ 0x51, "�" },
	{ 0x52, "�" },
	{ 0x4B, "�" },
	{ 0x56, "�" },
	{ 0x59, "�" },
	{ 0x4A, "�" },
	{ 0x47, "�" },
	{ 0x48, "�" },
	{ 0x43, "�" },
	{ 0x4E, "�" },
	{ 0x45, "�" },
	{ 0x41, "�" },
	{ 0xDB, "�" },
	{ 0x57, "�" },
	{ 0x58, "�" },
	{ 0x49, "�" },
	{ 0x4F, "�" },
	{ 0xDD, "�" },
	{ 0x53, "�" },
	{ 0x4D, "�" },
	{ 0xDE, "�" },
	{ 0xBE, "�" },
	{ 0x5A, "�" },
};
private:std::map<int, char*> serVocabulary = {
	{ 0x08, "BACKSPACE" },
	{ 0x09, "TAB" },
	{ 0x0C, "CLEAR" },
	{ 0x0D, "ENTER" },
	{ 0x12, "ALT" },
	{ 0x13, "PAUSE" },
	{ 0x14, "CAPS LOCK" },
	{ 0x1B, "ESC" },
	{ 0x20, "SPACE" },
	{ 0x21, "PAGE UP" },
	{ 0x22, "PAGE DOWN" },
	{ 0x23, "END" },
	{ 0x24, "HOME" },
	{ 0x25, "������� �����" },
	{ 0x26, "������� �����" },
	{ 0x27, "������� ������" },
	{ 0x28, "������ ����" },
	{ 0x2C, "PRINT SCREEN" },
	{ 0x2D, "INSERT" },
	{ 0x2E, "DELETE" },
	{ 0x2F, "HELP" },
	{ 0x30, "0" },
	{ 0x31, "1" },
	{ 0x32, "2" },
	{ 0x33, "3" },
	{ 0x34, "4" },
	{ 0x35, "5" },
	{ 0x36, "6" },
	{ 0x37, "7" },
	{ 0x38, "8" },
	{ 0x39, "9" },
	{ 0x5B, "Left Windows" },
	{ 0x5C, "Right Windows" },
	{ 0x60, "�������� ���������� 0" },
	{ 0x61, "�������� ���������� 1" },
	{ 0x62, "�������� ���������� 2" },
	{ 0x63, "�������� ���������� 3" },
	{ 0x64, "�������� ���������� 4" },
	{ 0x65, "�������� ���������� 5" },
	{ 0x66, "�������� ���������� 6" },
	{ 0x67, "�������� ���������� 7" },
	{ 0x68, "�������� ���������� 8" },
	{ 0x69, "�������� ���������� 9" },
	{ 0x70, "F1" },
	{ 0x71, "F2" },
	{ 0x72, "F3" },
	{ 0x73, "F4" },
	{ 0x74, "F5" },
	{ 0x75, "F6" },
	{ 0x76, "F7" },
	{ 0x77, "F8" },
	{ 0x78, "F9" },
	{ 0x79, "F10" },
	{ 0x7A, "F11" },
	{ 0x7B, "F12" },
	{ 0x90, "NUM LOCK" },
	{ 0xA0, "Left Shift" },
	{ 0xA1, "Right Shift" },
	{ 0xA2, "Left Ctrl" },
	{ 0xA3, "Right Ctrl" },
	{ 0xBB, "+" },
	{ 0xBD, "-" },
	{ 0xBF, "/?" },
	{ 0xC0, "~" },
	{ 0xDC, "\|" },
};
public:void getKeys(System::Windows::Forms::TextBox^);
};
