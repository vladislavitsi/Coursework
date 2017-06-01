strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Process",,48) 
For Each objItem in colItems 
    If isNull(objItem.Caption) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Caption
    End IF
    Wscript.Echo "" & objItem.ProcessId
    Wscript.Echo "" & objItem.Priority
    Wscript.Echo "" & objItem.ThreadCount
Next