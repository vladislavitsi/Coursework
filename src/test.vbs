strComputer = "." 
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI") 
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorID",,48) 
For Each objItem in colItems
    Wscript.Echo "Active: " & objItem.Active
    Wscript.Echo "InstanceName: " & objItem.InstanceName
    If isNull(objItem.ManufacturerName) Then
        Wscript.Echo "ManufacturerName: "
    Else
        Wscript.Echo "ManufacturerName: " & Join(objItem.ManufacturerName, ",")
    End If
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
    If isNull(objItem.UserFriendlyName) Then
        Wscript.Echo "UserFriendlyName: "
    Else
        Wscript.Echo "UserFriendlyName: " & Join(objItem.UserFriendlyName, ",")
    End If
    Wscript.Echo "UserFriendlyNameLength: " & objItem.UserFriendlyNameLength
    Wscript.Echo "WeekOfManufacture: " & objItem.WeekOfManufacture
    Wscript.Echo "YearOfManufacture: " & objItem.YearOfManufacture
Next