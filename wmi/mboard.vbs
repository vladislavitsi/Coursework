strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_MotherboardDevice",,48)
For Each objItem in colItems

If IsNull(objItem.Caption) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Caption
    End If
    
If IsNull(objItem.Availability) Then
        Wscript.Echo "2"
    Else
        Wscript.Echo "" & objItem.Availability
    End If
    
    
If IsNull(objItem.DeviceID) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.DeviceID
    End If
       
If IsNull(objItem.PrimaryBusType) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.PrimaryBusType
    End If

If IsNull(objItem.SecondaryBusType) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SecondaryBusType
    End If
    
If IsNull(objItem.Status) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Status
    End If
Next

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BaseBoard",,48)
For Each objItem in colItems

If IsNull(objItem.HostingBoard) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.HostingBoard
    End If

If IsNull(objItem.Manufacturer) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Manufacturer
    End If

If IsNull(objItem.Product) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Product
    End If

If IsNull(objItem.SerialNumber) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SerialNumber
    End If

If IsNull(objItem.Version) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Version
    End If
Next

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_SystemSlot",,48)
For Each objItem in colItems

If IsNull(objItem.Tag) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Tag
    End If
  
If IsNull(objItem.CurrentUsage) Then
        Wscript.Echo "2"
    Else
        Wscript.Echo "" & objItem.CurrentUsage
    End If

If IsNull(objItem.MaxDataWidth) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.MaxDataWidth
    End If

If IsNull(objItem.SlotDesignation) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SlotDesignation
    End If

If IsNull(objItem.Status) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Status
    End If
    
If IsNull(objItem.SupportsHotPlug) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SupportsHotPlug
    End If

If IsNull(objItem.BusNumber) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.BusNumber
    End If
Next
