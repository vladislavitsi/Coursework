strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_NetworkLoginProfile",,48) 
For Each objItem in colItems 
    If IsNull(objItem.Description) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Description
    End If
    If IsNull(objItem.FullName) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.FullName
    End If
    If IsNull(objItem.LastLogon) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.LastLogon
    End If
    If IsNull(objItem.Name) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Name
    End If
    If IsNull(objItem.NumberOfLogons) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.NumberOfLogons
    End If
Next
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_UserAccount",,48)
For Each objItem in colItems
    Wscript.Echo "Caption: " & objItem.Caption
    Wscript.Echo "Disabled: " & objItem.Disabled
    Wscript.Echo "SID: " & objItem.SID
Next