strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_UserAccount",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.Caption
    Wscript.Echo "" & objItem.Disabled
    Wscript.Echo "" & objItem.SID
Next