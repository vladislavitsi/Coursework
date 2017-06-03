strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_DiskDrive",,48)
For Each objItem in colItems

    If isNull(objItem.Caption) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Caption
    End IF

    If isNull(objItem.BytesPerSector) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.BytesPerSector
    End IF

    If isNull(objItem.Capabilities) Then
        Wscript.Echo "0"
    Else
    Wscript.Echo "" & Join(objItem.Capabilities, ",")
    End IF

    If isNull(objItem.DeviceID) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.DeviceID
    End IF

    If isNull(objItem.FirmwareRevision) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.FirmwareRevision
    End IF

    If isNull(objItem.InterfaceType) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.InterfaceType
    End IF

    If isNull(objItem.Manufacturer) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Manufacturer
    End IF

    If isNull(objItem.Partitions) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Partitions
    End IF

    If isNull(objItem.SectorsPerTrack) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SectorsPerTrack
    End IF

    If isNull(objItem.SerialNumber) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SerialNumber
    End IF

    If isNull(objItem.Size) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Size
    End IF

    If isNull(objItem.TotalCylinders) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.TotalCylinders
    End IF

    If isNull(objItem.TotalSectors) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.TotalSectors
    End IF

    If isNull(objItem.TotalTracks) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.TotalTracks
    End IF

    If isNull(objItem.TracksPerCylinder) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.TracksPerCylinder
    End IF

Next
