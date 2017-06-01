strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_NetworkLoginProfile",,48) 
For Each objItem in colItems 
    If IsNull(objItem.Description) Then
        Wscript.Echo "Description: -"
    Else
        Wscript.Echo "Description: " & objItem.Description
    End If
    If IsNull(objItem.FullName) Then
        Wscript.Echo "FullName: -"
    Else
        Wscript.Echo "FullName: " & objItem.FullName
    End If
    If IsNull(objItem.LastLogon) Then
        Wscript.Echo "LastLogon: -"
    Else
        Wscript.Echo "LastLogon: " & objItem.LastLogon
    End If
    If IsNull(objItem.Name) Then
        Wscript.Echo "Name: -"
    Else
        Wscript.Echo "Name: " & objItem.Name
    End If
    If IsNull(objItem.NumberOfLogons) Then
        Wscript.Echo "NumberOfLogons: -"
    Else
        Wscript.Echo "NumberOfLogons: " & objItem.NumberOfLogons
    End If
Next