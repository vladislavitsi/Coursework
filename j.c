#include "stdafx.h"
#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

char* FILENAME = "data.txt";

class Laptop {
private:
	string model;
	int capacity;
	double hours;
public:
	void setModel(string model);
	string getModel();
	void setCapacity(int capacity);
	int getCapacity();
	void setHours(double hours);
	double getHours();
	virtual void save(FILE*);
	virtual bool read(FILE*);
	Laptop(string, int, double);
	Laptop();
};
void Laptop::setModel(string model){
	this->model = model;
}
string Laptop::getModel(){
	return this->model;
}
void Laptop::setCapacity(int capacity){
	this->capacity = capacity;
}
int Laptop::getCapacity(){
	return this->capacity;
}
void Laptop::setHours(double hours){
	this->hours = hours;
}
double Laptop::getHours(){
	return this->hours;
}
Laptop::Laptop(string model ,int capacity ,double hours){
	this->setModel(model);
	this->setCapacity(capacity);
	this->setHours(hours);
}
Laptop::Laptop(){}

void Laptop::save(FILE *f) {
	fprintf(f, "%d %2.1lf ", this->getCapacity(), this->getHours());
	fputs(this->getModel().c_str(),f);
	fputc('\n', f);
}

bool Laptop::read(FILE* f) {
	char name[20];
	int capacity;
	double hours;
	if (fscanf(f, "%d %lf ", &capacity, &hours) == 2) {
		fgets(name,20,f);
		string *s = new string(name);
		s->resize(s->length()-1);
		this->setModel(*s);
		this->setCapacity(capacity);
		this->setHours(hours);
		return true;
	}
	return false;
}


vector<Laptop*> getListFromFile(){
	vector<Laptop*> laptops;
	FILE * f = fopen(FILENAME, "r");
	Laptop *rec;
	do {
		rec = new Laptop();
		if (rec->read(f)) laptops.insert(laptops.end(), rec);
		else {
			delete rec;
			rec = NULL;
		}
	} while (rec);
	fclose(f);
	return laptops;
}

void saveChanges(vector<Laptop*> list){
	FILE * f = fopen(FILENAME, "w");
	for (Laptop* rec : list) {
		rec->save(f);
	}
	fclose(f);
}

void printList(vector<Laptop*>& list) {
	int i = 1;
	cout << endl  << " ¹ |        Ìîäåëü        |   Åìêîñòü  |Âðåìÿ ðàáîòû|" << endl;
	for (Laptop* rec : list) {
		printf("%2d | %20s | %10d | %10.1lf |\n",i,rec->getModel().c_str(),rec->getCapacity(),rec->getHours());
		i++;
	}
}

void addRec(vector<Laptop*>* list) {
	cout << "Äîáàâëåíèå çàïèñè â ñïèñîê" << endl;
	string name;
	int capacity;
	double hours;
	cout << "Ââåäèòå íàçâàíèå íîâîãî íîóòáóêà /> ";
	getchar();
	getline(cin, name);
	cout << "Ââåäèòå åìêîñòü æåñòêîãî äèñêà /> ";
	cin >> capacity;
	cout << "Ââåäèòå âðåìÿ ðàáîòû /> ";
	cin >> hours;
	list->insert(list->end(), new Laptop(name, capacity, hours));
}

void redRec(vector<Laptop*>* list) {
	cout << "Ââåäèòå íîìåð çàïèñè äëÿ ðåäàêòèðîâàíèÿ />";
	int i = 0;
	cin >> i;
	i--;
	cout << "Âûáðàííàÿ âàìè çàïèñü:" << endl;
	cout << "Ìîäåëü " << (*list)[i]->getModel() << " Åìêîñòü: " << (*list)[i]->getCapacity() << " Âðåìÿ ðàáîòû: " << (*list)[i]->getHours() << endl;
	string name;
	int capacity;
	double hours;
	cout << "Ââåäèòå íîâîå íàçâàíèå íîóòáóêà /> ";
	getchar();
	getline(cin, name);
	cout << "Ââåäèòå íîâóþ åìêîñòü æåñòêîãî äèñêà /> ";
	cin >> capacity;
	cout << "Ââåäèòå íîâîå âðåìÿ ðàáîòû /> ";
	cin >> hours;
	(*list)[i]->setModel(name);
	(*list)[i]->setCapacity(capacity);
	(*list)[i]->setHours(hours);
}

void delRec(vector<Laptop*>* list) {
	cout << "Ââåäèòå íîìåð çàïèñè äëÿ óäàëåíèÿ />";
	int i = 0;
	cin >> i;
	i--;
	list->erase(list->begin() + i);
}

int main(){
	setlocale(LC_ALL, "Russian");
	//Âîññòàíîâëåíèå äàííûõ
	cout << "Âîññòàíîâëåíèå äàííûõ ñ äèñêà..." << endl;
	vector<Laptop*> list = getListFromFile();
	//Ðàáîòà ïðîãðàììû
	cout << "Îòêðûòèå ïðîãðàììû, \"ÁÀÇÀ ÍÎÓÒÁÓÊÎÂ\"" << endl;
	int selector = 0;
	while (true){
		cout << "==================================" << endl;
		cout << "1. Ïðîñìîòðåòü ñïèñîê" << endl << "2. Äîáàâèòü çàïèñü" << endl <<"3. Ðåäàêòèðîâàòü çàïèñü" << endl <<"4. Óäàëèòü çàïèñü" << endl << "0. Âûéòè èç ïðîãðàììû" << endl;
		cout << "Âûáåðåòå ïóíêò ìåíþ /> ";
		cin >> selector;
		switch (selector){
			case 1:
				printList(list);
				break;
			case 2:
				addRec(&list);
				break;
			case 3:
				redRec(&list);
				break;
			case 4:
				delRec(&list);
				break;
		}
		if (!selector) break;
	}
	//Ñîõðàíåíèå èçìåíåíèé
	saveChanges(list);
	cout << "Èçìåíåíèÿ ñîõðàíåíû..." << endl << "Íàæìèòå ENTER, ÷òîáû âûéòè èç ïðîãðàììû..." << endl;
	getchar(); getchar();
	return 0;
}