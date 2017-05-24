strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorID",,48)
For Each objItem in colItems
    Wscript.Echo "Active: " & objItem.Active
    Wscript.Echo "InstanceName: " & objItem.InstanceName
    If isNull(objItem.ProductCodeID) Then
        Wscript.Echo "ProductCodeID: "
    Else
        Wscript.Echo "ProductCodeID: " & Join(objItem.ProductCodeID, ",")
    End If
    If isNull(objItem.SerialNumberID) Then
        Wscript.Echo "SerialNumberID: "
    Else
        Wscript.Echo "SerialNumberID: " & Join(objItem.SerialNumberID, ",")
    End If
    Wscript.Echo "YearOfManufacture: " & objItem.YearOfManufacture
Next
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorBasicDisplayParams",,48)
For Each objItem in colItems
    Wscript.Echo "MaxHorizontalImageSize: " & objItem.MaxHorizontalImageSize
    Wscript.Echo "MaxVerticalImageSize: " & objItem.MaxVerticalImageSize
    Wscript.Echo "VideoInputType: " & objItem.VideoInputType
Next