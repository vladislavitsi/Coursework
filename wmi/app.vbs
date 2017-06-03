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


    If isNull(objItem.ProcessId) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.ProcessId
    End IF


    If isNull(objItem.Priority) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Priority
    End IF


    If isNull(objItem.ThreadCount) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.ThreadCount
    End IF
Next