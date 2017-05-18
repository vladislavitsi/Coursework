#pragma once
#include <ctime>
#include <Windows.h>

namespace MouseLog {

	using namespace System;
	using namespace System::ComponentModel;
	using namespace System::Collections;
	using namespace System::Windows::Forms;
	using namespace System::Data;
	using namespace System::Drawing;
	using namespace std;

	/// <summary>
	/// Summary for MyForm
	/// </summary>
	public ref class MyForm : public System::Windows::Forms::Form{
	public:
		MyForm(void){
			InitializeComponent();
			pt = new POINT;
		}

	protected:
		/// <summary>
		/// Clean up any resources being used.
		/// </summary>
		~MyForm(){
			if (components){
				delete components;
			}
		}
	private: System::Windows::Forms::Label^  lX;
	private: System::Windows::Forms::Label^  lY;
	private: System::Windows::Forms::Label^  dX;
	private: System::Windows::Forms::Label^  dY;
	private: System::Windows::Forms::Timer^  posTimer;

	private: POINT * pt;
	private: time_t * t;

	private: System::Windows::Forms::TextBox^  log;
	private: System::Windows::Forms::Timer^  keyTimer;
	private: System::Windows::Forms::Timer^  saveTimer;
	private: System::ComponentModel::IContainer^  components;
	public:

	private:
		/// <summary>
		/// Required designer variable.
		/// </summary>


#pragma region Windows Form Designer generated code
		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		void InitializeComponent(void)
		{
			this->components = (gcnew System::ComponentModel::Container());
			this->lX = (gcnew System::Windows::Forms::Label());
			this->lY = (gcnew System::Windows::Forms::Label());
			this->dX = (gcnew System::Windows::Forms::Label());
			this->log = (gcnew System::Windows::Forms::TextBox());
			this->dY = (gcnew System::Windows::Forms::Label());
			this->posTimer = (gcnew System::Windows::Forms::Timer(this->components));
			this->keyTimer = (gcnew System::Windows::Forms::Timer(this->components));
			this->saveTimer = (gcnew System::Windows::Forms::Timer(this->components));
			this->SuspendLayout();
			// 
			// lX
			// 
			this->lX->AutoSize = true;
			this->lX->BackColor = System::Drawing::Color::Transparent;
			this->lX->Font = (gcnew System::Drawing::Font(L"Microsoft Sans Serif", 25.8F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(204)));
			this->lX->Location = System::Drawing::Point(31, 26);
			this->lX->Name = L"lX";
			this->lX->Size = System::Drawing::Size(63, 51);
			this->lX->TabIndex = 0;
			this->lX->Text = L"X:";
			// 
			// lY
			// 
			this->lY->AutoSize = true;
			this->lY->BackColor = System::Drawing::Color::Transparent;
			this->lY->Font = (gcnew System::Drawing::Font(L"Microsoft Sans Serif", 25.8F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(204)));
			this->lY->Location = System::Drawing::Point(204, 26);
			this->lY->Name = L"lY";
			this->lY->Size = System::Drawing::Size(63, 51);
			this->lY->TabIndex = 1;
			this->lY->Text = L"Y:";
			// 
			// dX
			// 
			this->dX->BackColor = System::Drawing::Color::Transparent;
			this->dX->Font = (gcnew System::Drawing::Font(L"Microsoft Sans Serif", 25.8F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(204)));
			this->dX->Location = System::Drawing::Point(79, 26);
			this->dX->Name = L"dX";
			this->dX->Size = System::Drawing::Size(119, 52);
			this->dX->TabIndex = 2;
			this->dX->Text = L"1000";
			// 
			// log
			// 
			this->log->AcceptsReturn = true;
			this->log->BackColor = System::Drawing::SystemColors::HighlightText;
			this->log->BorderStyle = System::Windows::Forms::BorderStyle::None;
			this->log->Cursor = System::Windows::Forms::Cursors::Arrow;
			this->log->Font = (gcnew System::Drawing::Font(L"Segoe UI", 7.8F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->log->HideSelection = false;
			this->log->Location = System::Drawing::Point(13, 81);
			this->log->Multiline = true;
			this->log->Name = L"log";
			this->log->ReadOnly = true;
			this->log->ScrollBars = System::Windows::Forms::ScrollBars::Vertical;
			this->log->Size = System::Drawing::Size(375, 407);
			this->log->TabIndex = 4;
			// 
			// dY
			// 
			this->dY->BackColor = System::Drawing::Color::Transparent;
			this->dY->Font = (gcnew System::Drawing::Font(L"Microsoft Sans Serif", 25.8F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(204)));
			this->dY->Location = System::Drawing::Point(251, 26);
			this->dY->Name = L"dY";
			this->dY->Size = System::Drawing::Size(124, 52);
			this->dY->TabIndex = 3;
			this->dY->Text = L"1000";
			// 
			// posTimer
			// 
			this->posTimer->Enabled = true;
			this->posTimer->Interval = 50;
			this->posTimer->Tick += gcnew System::EventHandler(this, &MyForm::timer1_Tick);
			// 
			// keyTimer
			// 
			this->keyTimer->Enabled = true;
			this->keyTimer->Interval = 500;
			this->keyTimer->Tick += gcnew System::EventHandler(this, &MyForm::keyTimer_Tick);
			// 
			// saveTimer
			// 
			this->saveTimer->Enabled = true;
			this->saveTimer->Interval = 3000;
			this->saveTimer->Tick += gcnew System::EventHandler(this, &MyForm::saveTimer_Tick);
			// 
			// MyForm
			// 
			this->AutoScaleDimensions = System::Drawing::SizeF(8, 16);
			this->AutoScaleMode = System::Windows::Forms::AutoScaleMode::Font;
			this->BackColor = System::Drawing::Color::White;
			this->ClientSize = System::Drawing::Size(400, 500);
			this->Controls->Add(this->log);
			this->Controls->Add(this->dY);
			this->Controls->Add(this->dX);
			this->Controls->Add(this->lY);
			this->Controls->Add(this->lX);
			this->FormBorderStyle = System::Windows::Forms::FormBorderStyle::FixedSingle;
			this->MaximizeBox = false;
			this->MinimizeBox = false;
			this->Name = L"MyForm";
			this->ShowInTaskbar = false;
			this->SizeGripStyle = System::Windows::Forms::SizeGripStyle::Hide;
			this->Text = L"Использование мыши";
			this->TopMost = true;
			this->ResumeLayout(false);
			this->PerformLayout();

		}
#pragma endregion

void computingPOS(POINT *p) {
	GetCursorPos(p);
	dX->Text = p->x.ToString();
	dY->Text = p->y.ToString();
}
void printTime(time_t t) {
	struct tm * now = localtime(&t);
	log->AppendText("["+now->tm_mday+"."+now->tm_mon+"."+(now->tm_year+1900)+" "+now->tm_hour+":"+now->tm_min+":"+now->tm_sec+"] ");
}

private: System::Void timer1_Tick(System::Object^  sender, System::EventArgs^  e) {
	computingPOS(pt);
}

private: System::Void keyTimer_Tick(System::Object^  sender, System::EventArgs^  e) {
	if (GetAsyncKeyState(VK_LBUTTON)) {
		printTime(time(0));
		log->AppendText("Левая кнопка мыши\r\n");
	}
	if (GetAsyncKeyState(VK_RBUTTON)) {
		printTime(time(0));
		log->AppendText("Правая кнопка мыши\r\n");
	}
	if (GetAsyncKeyState(VK_MBUTTON)) {
		printTime(time(0));
		log->AppendText("Средняя кнопка мыши\r\n");
	}
}
private: System::Void saveTimer_Tick(System::Object^  sender, System::EventArgs^  e) {
	try {
		System::IO::File::WriteAllText("mouseLog.txt", log->Text);
	}catch(...){}
}
};
}
