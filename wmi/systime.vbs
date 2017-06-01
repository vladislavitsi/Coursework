strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_OperatingSystem",,48) 
For Each objItem in colItems 

If isNull(objItem.LastBootUpTime) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.LastBootUpTime
        End If

If isNull(objItem.InstallDate) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.InstallDate
        End If
Next