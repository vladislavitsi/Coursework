strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Process",,48) 
For Each objItem in colItems 

    If isNull(objItem.Caption) Then
        Wscript.Echo "Caption: -"
    Else
        Wscript.Echo "Caption: " & objItem.Caption
    End IF


    If isNull(objItem.ProcessId) Then
        Wscript.Echo "ProcessId: -"
    Else
        Wscript.Echo "ProcessId: " & objItem.ProcessId
    End IF


    If isNull(objItem.Priority) Then
        Wscript.Echo "Priority: -"
    Else
        Wscript.Echo "Priority: " & objItem.Priority
    End IF


    If isNull(objItem.ThreadCount) Then
        Wscript.Echo "ThreadCount: -"
    Else
        Wscript.Echo "ThreadCount: " & objItem.ThreadCount
    End IF
Next