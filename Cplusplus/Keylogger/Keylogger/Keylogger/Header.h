#pragma once
#include <map>

class Key {
private:std::map<int, char*> enVocabulary = { 
			{0x46,"F"},
		};
private:std::map<int, char*> ruVocabulary = {
			{ 0x46,"�" },
		};
private:std::map<int, char*> serVocabulary = {
			{ 0x1, "����� ������ ����" },
		};
public:void getKeys(System::Windows::Forms::TextBox^);
};
