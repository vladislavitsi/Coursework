strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Volume",,48)
Dim i
i=1
For Each objItem in colItems
    Wscript.Echo "" & i
    i = i+1
    Wscript.Echo "" & objItem.Caption
    Wscript.Echo "" & objItem.Automount
    Wscript.Echo "" & objItem.BlockSize
    Wscript.Echo "" & objItem.BootVolume
    Wscript.Echo "" & objItem.Capacity
    Wscript.Echo "" & objItem.FreeSpace
    Wscript.Echo "" & objItem.Compressed
    Wscript.Echo "" & objItem.DeviceID
    Wscript.Echo "" & objItem.DriveType
    Wscript.Echo "" & objItem.FileSystem
    Wscript.Echo "" & objItem.IndexingEnabled
    If isNull(objItem.Label) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.Label
        End If
    Wscript.Echo "" & objItem.MaximumFileNameLength
    Wscript.Echo "" & objItem.PageFilePresent
    Wscript.Echo "" & objItem.SerialNumber
    Wscript.Echo "" & objItem.SupportsDiskQuotas
    Wscript.Echo "" & objItem.SupportsFileBasedCompression
Next

