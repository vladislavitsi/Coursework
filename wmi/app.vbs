strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Process",,48) 
For Each objItem in colItems 
    Wscript.Echo "" & objItem.Caption
    Wscript.Echo "" & objItem.ProcessId
    Wscript.Echo "" & objItem.Priority
    Wscript.Echo "" & objItem.ThreadCount
Next