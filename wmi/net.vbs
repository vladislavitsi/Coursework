strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_NetworkAdapter",,48)
For Each objItem in colItems

If isNull(objItem.Description) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Description
        End If
    If isNull(objItem.AdapterType) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.AdapterType
        End If

    If isNull(objItem.Availability) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Availability
        End If
If isNull(objItem.Caption) Then
            Wscript.Echo " -"
        Else
           Wscript.Echo " " & objItem.Caption
        End If



    If isNull(objItem.DeviceID) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.DeviceID
        End If
    If isNull(objItem.GUID) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.GUID
        End If

    If isNull(objItem.Index) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Index
        End If

    If isNull(objItem.Installed) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Installed
        End If

    If isNull(objItem.InterfaceIndex) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.InterfaceIndex
        End If
    If isNull(objItem.MACAddress) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.MACAddress
        End If

    If isNull(objItem.Manufacturer) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Manufacturer
        End If

    If isNull(objItem.MaxNumberControlled) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.MaxNumberControlled
        End If

    If isNull(objItem.NetConnectionID) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.NetConnectionID
        End If
    If isNull(objItem.NetConnectionStatus) Then
            Wscript.Echo "-1"
        Else
            Wscript.Echo "" & objItem.NetConnectionStatus
        End If

    If isNull(objItem.PhysicalAdapter) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.PhysicalAdapter
        End If

    If isNull(objItem.PNPDeviceID) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.PNPDeviceID
        End If

    If isNull(objItem.ProductName) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.ProductName
        End If

    If isNull(objItem.ServiceName) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.ServiceName
        End If

    If isNull(objItem.Speed) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Speed & " bps"
        End If
Next