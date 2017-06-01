strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_NetworkAdapter",,48)
For Each objItem in colItems

If isNull(objItem.Description) Then
            Wscript.Echo "Description: -"
        Else
            Wscript.Echo "Description: " & objItem.Description
        End If
    If isNull(objItem.AdapterType) Then
            Wscript.Echo "AdapterType: -"
        Else
            Wscript.Echo "AdapterType: " & objItem.AdapterType
        End If

    If isNull(objItem.Availability) Then
            Wscript.Echo "Availability: -"
        Else
            Wscript.Echo "Availability: " & objItem.Availability
        End If
If isNull(objItem.Caption) Then
            Wscript.Echo "Caption: -"
        Else
           Wscript.Echo "Caption: " & objItem.Caption
        End If



    If isNull(objItem.DeviceID) Then
            Wscript.Echo "DeviceID: -"
        Else
            Wscript.Echo "DeviceID: " & objItem.DeviceID
        End If
    If isNull(objItem.GUID) Then
            Wscript.Echo "GUID: -"
        Else
            Wscript.Echo "GUID: " & objItem.GUID
        End If

    If isNull(objItem.Index) Then
            Wscript.Echo "Index: -"
        Else
            Wscript.Echo "Index: " & objItem.Index
        End If

    If isNull(objItem.Installed) Then
            Wscript.Echo "Installed: -"
        Else
            Wscript.Echo "Installed: " & objItem.Installed
        End If

    If isNull(objItem.InterfaceIndex) Then
            Wscript.Echo "InterfaceIndex: -"
        Else
            Wscript.Echo "InterfaceIndex: " & objItem.InterfaceIndex
        End If
    If isNull(objItem.MACAddress) Then
            Wscript.Echo "MACAddress: -"
        Else
            Wscript.Echo "MACAddress: " & objItem.MACAddress
        End If

    If isNull(objItem.Manufacturer) Then
            Wscript.Echo "Manufacturer: -"
        Else
            Wscript.Echo "Manufacturer: " & objItem.Manufacturer
        End If

    If isNull(objItem.MaxNumberControlled) Then
            Wscript.Echo "MaxNumberControlled: -"
        Else
            Wscript.Echo "MaxNumberControlled: " & objItem.MaxNumberControlled
        End If

    If isNull(objItem.NetConnectionID) Then
            Wscript.Echo "NetConnectionID: -"
        Else
            Wscript.Echo "NetConnectionID: " & objItem.NetConnectionID
        End If
    If isNull(objItem.NetConnectionStatus) Then
            Wscript.Echo "NetConnectionStatus: -1"
        Else
            Wscript.Echo "NetConnectionStatus: " & objItem.NetConnectionStatus
        End If

    If isNull(objItem.PhysicalAdapter) Then
            Wscript.Echo "PhysicalAdapter: -"
        Else
            Wscript.Echo "PhysicalAdapter: " & objItem.PhysicalAdapter
        End If

    If isNull(objItem.PNPDeviceID) Then
            Wscript.Echo "PNPDeviceID: -"
        Else
            Wscript.Echo "PNPDeviceID: " & objItem.PNPDeviceID
        End If

    If isNull(objItem.ProductName) Then
            Wscript.Echo "ProductName: -"
        Else
            Wscript.Echo "ProductName: " & objItem.ProductName
        End If

    If isNull(objItem.ServiceName) Then
            Wscript.Echo "ServiceName: -"
        Else
            Wscript.Echo "ServiceName: " & objItem.ServiceName
        End If

    If isNull(objItem.Speed) Then
            Wscript.Echo "Speed: -"
        Else
            Wscript.Echo "Speed: " & objItem.Speed & " bps"
        End If
Next