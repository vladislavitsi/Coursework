strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Volume",,48)
Dim i
i=1
For Each objItem in colItems
    Wscript.Echo "" & i
    i = i+1
If IsNull(objItem.Caption) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Caption
    End If

If IsNull(objItem.Automount) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Automount
    End If

If IsNull(objItem.BlockSize) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.BlockSize
    End If

If IsNull(objItem.BootVolume) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.BootVolume
    End If

If IsNull(objItem.Capacity) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Capacity
    End If

If IsNull(objItem.FreeSpace) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.FreeSpace
    End If

If IsNull(objItem.Compressed) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Compressed
    End If

If IsNull(objItem.DeviceID) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.DeviceID
    End If
  
If IsNull(objItem.DriveType) Then
        Wscript.Echo "0"
    Else
        Wscript.Echo "" & objItem.DriveType
    End If

If IsNull(objItem.FileSystem) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.FileSystem
    End If

If IsNull(objItem.IndexingEnabled) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.IndexingEnabled
    End If

If isNull(objItem.Label) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.Label
    End If

If isNull(objItem.MaximumFileNameLength) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.MaximumFileNameLength
    End If

If isNull(objItem.PageFilePresent) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.PageFilePresent
    End If

If isNull(objItem.SerialNumber) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SerialNumber
    End If
  
If isNull(objItem.SupportsDiskQuotas) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SupportsDiskQuotas
    End If
 
If isNull(objItem.SupportsFileBasedCompression) Then
        Wscript.Echo "-"
    Else
        Wscript.Echo "" & objItem.SupportsFileBasedCompression
    End If
Next

