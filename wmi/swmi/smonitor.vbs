strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorID",,48)
For Each objItem in colItems

If isNull(objItem.InstanceName) Then
            Wscript.Echo "InstanceName: -"
        Else
            Wscript.Echo "InstanceName: " & objItem.InstanceName
        End If

If isNull(objItem.Active) Then
            Wscript.Echo "Active: -"
        Else
            Wscript.Echo "Active: " & objItem.Active
        End If

If isNull(objItem.ProductCodeID) Then
            Wscript.Echo "ProductCodeID: -"
        Else
            Wscript.Echo "ProductCodeID: " & Join(objItem.ProductCodeID, ",")
        End If

If isNull(objItem.SerialNumberID) Then
            Wscript.Echo "SerialNumberID: -"
        Else
            Wscript.Echo "SerialNumberID: " & Join(objItem.SerialNumberID, ",")
        End If

If isNull(objItem.YearOfManufacture) Then
            Wscript.Echo "YearOfManufacture: -"
        Else
            Wscript.Echo "YearOfManufacture: " & objItem.YearOfManufacture
        End If

Next
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorBasicDisplayParams",,48)
For Each objItem in colItems

If isNull(objItem.MaxHorizontalImageSize) Then
            Wscript.Echo "MaxHorizontalImageSize: -"
        Else
            Wscript.Echo "MaxHorizontalImageSize: " & objItem.MaxHorizontalImageSize
        End If

If isNull(objItem.MaxVerticalImageSize) Then
            Wscript.Echo "MaxVerticalImageSize: -"
        Else
            Wscript.Echo "MaxVerticalImageSize: " & objItem.MaxVerticalImageSize
        End If

'-1
If isNull(objItem.VideoInputType) Then       
            Wscript.Echo "VideoInputType: -1"
        Else
            Wscript.Echo "VideoInputType: " & objItem.VideoInputType
        End If
Next