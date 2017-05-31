strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_OperatingSystem",,48) 
For Each objItem in colItems 
    Wscript.Echo "" & objItem.LastBootUpTime
    Wscript.Echo "" & objItem.InstallDate
Next