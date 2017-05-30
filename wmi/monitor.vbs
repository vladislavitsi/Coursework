strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorID",,48)
For Each objItem in colItems
    Wscript.Echo objItem.InstanceName
    Wscript.Echo "" & objItem.Active
    Wscript.Echo Join(objItem.ProductCodeID, ",")
    Wscript.Echo Join(objItem.SerialNumberID, ",")
    Wscript.Echo objItem.YearOfManufacture
Next
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorBasicDisplayParams",,48)
For Each objItem in colItems
    Wscript.Echo objItem.MaxHorizontalImageSize
    Wscript.Echo objItem.MaxVerticalImageSize
    Wscript.Echo objItem.VideoInputType
Next