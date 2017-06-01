strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_MotherboardDevice",,48)
For Each objItem in colItems

If IsNull(objItem.Caption) Then
        Wscript.Echo "Caption: -"
    Else
        Wscript.Echo "Caption: " & objItem.Caption
    End If
    
If IsNull(objItem.Availability) Then
        Wscript.Echo "Availability: 2"
    Else
        Wscript.Echo "Availability: " & objItem.Availability
    End If
    
    
If IsNull(objItem.DeviceID) Then
        Wscript.Echo "DeviceID: -"
    Else
        Wscript.Echo "DeviceID: " & objItem.DeviceID
    End If
       
If IsNull(objItem.PrimaryBusType) Then
        Wscript.Echo "PrimaryBusType: -"
    Else
        Wscript.Echo "PrimaryBusType: " & objItem.PrimaryBusType
    End If

If IsNull(objItem.SecondaryBusType) Then
        Wscript.Echo "SecondaryBusType: -"
    Else
        Wscript.Echo "SecondaryBusType: " & objItem.SecondaryBusType
    End If
    
If IsNull(objItem.Status) Then
        Wscript.Echo "Status: -"
    Else
        Wscript.Echo "Status: " & objItem.Status
    End If
Next

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BaseBoard",,48)
For Each objItem in colItems

If IsNull(objItem.HostingBoard) Then
        Wscript.Echo "HostingBoard: -"
    Else
        Wscript.Echo "HostingBoard: " & objItem.HostingBoard
    End If

If IsNull(objItem.Manufacturer) Then
        Wscript.Echo "Manufacturer: -"
    Else
        Wscript.Echo "Manufacturer: " & objItem.Manufacturer
    End If

If IsNull(objItem.Product) Then
        Wscript.Echo "Product: -"
    Else
        Wscript.Echo "Product: " & objItem.Product
    End If

If IsNull(objItem.SerialNumber) Then
        Wscript.Echo "SerialNumber: -"
    Else
        Wscript.Echo "SerialNumber: " & objItem.SerialNumber
    End If

If IsNull(objItem.Version) Then
        Wscript.Echo "Version: -"
    Else
        Wscript.Echo "Version: " & objItem.Version
    End If
Next

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_SystemSlot",,48)
For Each objItem in colItems

If IsNull(objItem.Tag) Then
        Wscript.Echo "Tag: -"
    Else
        Wscript.Echo "Tag: " & objItem.Tag
    End If
  
If IsNull(objItem.CurrentUsage) Then
        Wscript.Echo "CurrentUsage: 2"
    Else
        Wscript.Echo "CurrentUsage: " & objItem.CurrentUsage
    End If

If IsNull(objItem.MaxDataWidth) Then
        Wscript.Echo "MaxDataWidth: -"
    Else
        Wscript.Echo "MaxDataWidth: " & objItem.MaxDataWidth
    End If

If IsNull(objItem.SlotDesignation) Then
        Wscript.Echo "SlotDesignation: -"
    Else
        Wscript.Echo "SlotDesignation: " & objItem.SlotDesignation
    End If

If IsNull(objItem.Status) Then
        Wscript.Echo "Status: -"
    Else
        Wscript.Echo "Status: " & objItem.Status
    End If
    
If IsNull(objItem.SupportsHotPlug) Then
        Wscript.Echo "SupportsHotPlug: -"
    Else
        Wscript.Echo "SupportsHotPlug: " & objItem.SupportsHotPlug
    End If

If IsNull(objItem.BusNumber) Then
        Wscript.Echo "BusNumber: -"
    Else
        Wscript.Echo "BusNumber: " & objItem.BusNumber
    End If
Next