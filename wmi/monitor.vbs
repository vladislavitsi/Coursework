strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorID",,48)
For Each objItem in colItems

If isNull(objItem.InstanceName) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.InstanceName
        End If

If isNull(objItem.Active) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Active
        End If

If isNull(objItem.ProductCodeID) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & Join(objItem.ProductCodeID, ",")
        End If

If isNull(objItem.SerialNumberID) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & Join(objItem.SerialNumberID, ",")
        End If

If isNull(objItem.YearOfManufacture) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.YearOfManufacture
        End If

Next
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\WMI")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM WmiMonitorBasicDisplayParams",,48)
For Each objItem in colItems

If isNull(objItem.MaxHorizontalImageSize) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.MaxHorizontalImageSize
        End If

If isNull(objItem.MaxVerticalImageSize) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.MaxVerticalImageSize
        End If

'-1 -
If isNull(objItem.VideoInputType) Then       
            Wscript.Echo "-1"
        Else
            Wscript.Echo "" & objItem.VideoInputType
        End If
Next