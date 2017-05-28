strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_DiskDrive",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.Caption
    Wscript.Echo "" & objItem.BytesPerSector
    Wscript.Echo "" & Join(objItem.Capabilities, ",")
    Wscript.Echo "" & objItem.DeviceID
    Wscript.Echo "" & objItem.FirmwareRevision
    Wscript.Echo "" & objItem.InterfaceType
    Wscript.Echo "" & objItem.Manufacturer
    Wscript.Echo "" & objItem.Partitions
    Wscript.Echo "" & objItem.SectorsPerTrack
    Wscript.Echo "" & objItem.SerialNumber
    Wscript.Echo "" & objItem.Size
    Wscript.Echo "" & objItem.TotalCylinders
    Wscript.Echo "" & objItem.TotalSectors
    Wscript.Echo "" & objItem.TotalTracks
    Wscript.Echo "" & objItem.TracksPerCylinder
Next
