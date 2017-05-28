strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_MotherboardDevice",,48)
For Each objItem in colItems
    Wscript.Echo "Availability: " & objItem.Availability
    Wscript.Echo "Caption: " & objItem.Caption
    Wscript.Echo "DeviceID: " & objItem.DeviceID
    Wscript.Echo "PrimaryBusType: " & objItem.PrimaryBusType
    Wscript.Echo "RevisionNumber: " & objItem.RevisionNumber
    Wscript.Echo "Status: " & objItem.Status
    Wscript.Echo "SystemName: " & objItem.SystemName
Next
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BaseBoard",,48)
For Each objItem in colItems
    Wscript.Echo "HostingBoard: " & objItem.HostingBoard
    Wscript.Echo "Manufacturer: " & objItem.Manufacturer
    Wscript.Echo "Product: " & objItem.Product
    Wscript.Echo "RequiresDaughterBoard: " & objItem.RequiresDaughterBoard
    Wscript.Echo "SerialNumber: " & objItem.SerialNumber
    Wscript.Echo "Version: " & objItem.Version
Next
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_SystemSlot",,48)
For Each objItem in colItems

    Wscript.Echo "Caption: " & objItem.Caption
    If isNull(objItem.ConnectorType) Then
        Wscript.Echo "ConnectorType: "
    Else
        Wscript.Echo "ConnectorType: " & Join(objItem.ConnectorType, ",")
    End If
    Wscript.Echo "CurrentUsage: " & objItem.CurrentUsage
    Wscript.Echo "MaxDataWidth: " & objItem.MaxDataWidth
    Wscript.Echo "Shared: " & objItem.Shared
    Wscript.Echo "SlotDesignation: " & objItem.SlotDesignation
    Wscript.Echo "Status: " & objItem.Status
    Wscript.Echo "SupportsHotPlug: " & objItem.SupportsHotPlug
    Wscript.Echo "Tag: " & objItem.Tag
    If isNull(objItem.VccMixedVoltageSupport) Then
        Wscript.Echo "VccMixedVoltageSupport: "
    Else
        Wscript.Echo "VccMixedVoltageSupport: " & Join(objItem.VccMixedVoltageSupport, ",")
    End If
    Wscript.Echo "---------------------------------------------------"
Next
