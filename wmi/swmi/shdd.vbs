strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_DiskDrive",,48)
For Each objItem in colItems

    If isNull(objItem.Caption) Then
        Wscript.Echo "Caption: -"
    Else
        Wscript.Echo "Caption: " & objItem.Caption
    End IF

    If isNull(objItem.BytesPerSector) Then
        Wscript.Echo "BytesPerSector: -"
    Else
    Wscript.Echo "BytesPerSector: " & objItem.BytesPerSector
    End IF

    If isNull(objItem.Capabilities) Then
        Wscript.Echo "Capabilities: 0"
    Else
    Wscript.Echo "Capabilities: " & Join(objItem.Capabilities, ",")
    End IF

    If isNull(objItem.DeviceID) Then
        Wscript.Echo "DeviceID: -"
    Else
    Wscript.Echo "DeviceID: " & objItem.DeviceID
    End IF

    If isNull(objItem.FirmwareRevision) Then
        Wscript.Echo "FirmwareRevision: -"
    Else
    Wscript.Echo "FirmwareRevision: " & objItem.FirmwareRevision
    End IF

    If isNull(objItem.InterfaceType) Then
        Wscript.Echo "InterfaceType: -"
    Else
    Wscript.Echo "InterfaceType: " & objItem.InterfaceType
    End IF

    If isNull(objItem.Manufacturer) Then
        Wscript.Echo "Manufacturer: -"
    Else
    Wscript.Echo "Manufacturer: " & objItem.Manufacturer
    End IF

    If isNull(objItem.Partitions) Then
        Wscript.Echo "Partitions: -"
    Else
    Wscript.Echo "Partitions: " & objItem.Partitions
    End IF

    If isNull(objItem.SectorsPerTrack) Then
        Wscript.Echo "SectorsPerTrack: -"
    Else
    Wscript.Echo "SectorsPerTrack: " & objItem.SectorsPerTrack
    End IF

    If isNull(objItem.SerialNumber) Then
        Wscript.Echo "SerialNumber: -"
    Else
    Wscript.Echo "SerialNumber: " & objItem.SerialNumber
    End IF

    If isNull(objItem.Size) Then
        Wscript.Echo "Size: -"
    Else
    Wscript.Echo "Size: " & objItem.Size
    End IF

    If isNull(objItem.TotalCylinders) Then
        Wscript.Echo "TotalCylinders: -"
    Else
    Wscript.Echo "TotalCylinders: " & objItem.TotalCylinders
    End IF

    If isNull(objItem.TotalSectors) Then
        Wscript.Echo "TotalSectors: -"
    Else
    Wscript.Echo "TotalSectors: " & objItem.TotalSectors
    End IF

    If isNull(objItem.TotalTracks) Then
        Wscript.Echo "TotalTracks: -"
    Else
    Wscript.Echo "TotalTracks: " & objItem.TotalTracks
    End IF

    If isNull(objItem.TracksPerCylinder) Then
        Wscript.Echo "TracksPerCylinder: -"
    Else
    Wscript.Echo "TracksPerCylinder: " & objItem.TracksPerCylinder
    End IF

Next
