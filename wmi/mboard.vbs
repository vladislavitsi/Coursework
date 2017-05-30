strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_MotherboardDevice",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.Caption
    Wscript.Echo "" & objItem.Availability
    Wscript.Echo "" & objItem.DeviceID
    Wscript.Echo "" & objItem.PrimaryBusType
    Wscript.Echo "" & objItem.SecondaryBusType
    Wscript.Echo "" & objItem.Status
Next

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BaseBoard",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.HostingBoard
    Wscript.Echo "" & objItem.Manufacturer
    Wscript.Echo "" & objItem.Product
    Wscript.Echo "" & objItem.SerialNumber
    Wscript.Echo "" & objItem.Version
Next

Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_SystemSlot",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.Tag
    Wscript.Echo "" & objItem.CurrentUsage
    Wscript.Echo "" & objItem.MaxDataWidth
    Wscript.Echo "" & objItem.SlotDesignation
    Wscript.Echo "" & objItem.Status
    Wscript.Echo "" & objItem.SupportsHotPlug
    Wscript.Echo "" & objItem.BusNumber
Next
