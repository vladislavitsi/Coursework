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
        Wscript.Echo "Caption: -"
    Else
        Wscript.Echo "Caption: " & objItem.Caption
    End If

If IsNull(objItem.Automount) Then
        Wscript.Echo "Automount: -"
    Else
        Wscript.Echo "Automount: " & objItem.Automount
    End If

If IsNull(objItem.BlockSize) Then
        Wscript.Echo "BlockSize: -"
    Else
        Wscript.Echo "BlockSize: " & objItem.BlockSize
    End If

If IsNull(objItem.BootVolume) Then
        Wscript.Echo "BootVolume: -"
    Else
        Wscript.Echo "BootVolume: " & objItem.BootVolume
    End If

If IsNull(objItem.Capacity) Then
        Wscript.Echo "Capacity: -"
    Else
        Wscript.Echo "Capacity: " & objItem.Capacity
    End If

If IsNull(objItem.FreeSpace) Then
        Wscript.Echo "FreeSpace: -"
    Else
        Wscript.Echo "FreeSpace: " & objItem.FreeSpace
    End If

If IsNull(objItem.Compressed) Then
        Wscript.Echo "Compressed: -"
    Else
        Wscript.Echo "Compressed: " & objItem.Compressed
    End If

If IsNull(objItem.DeviceID) Then
        Wscript.Echo "DeviceID: -"
    Else
        Wscript.Echo "DeviceID: " & objItem.DeviceID
    End If
  
If IsNull(objItem.DriveType) Then
        Wscript.Echo "DriveType: 0"
    Else
        Wscript.Echo "DriveType: " & objItem.DriveType
    End If

If IsNull(objItem.FileSystem) Then
        Wscript.Echo "FileSystem: -"
    Else
        Wscript.Echo "FileSystem: " & objItem.FileSystem
    End If

If IsNull(objItem.IndexingEnabled) Then
        Wscript.Echo "IndexingEnabled: -"
    Else
        Wscript.Echo "IndexingEnabled: " & objItem.IndexingEnabled
    End If

If isNull(objItem.Label) Then
        Wscript.Echo "Label: -"
    Else
        Wscript.Echo "Label: " & objItem.Label
    End If

If isNull(objItem.MaximumFileNameLength) Then
        Wscript.Echo "MaximumFileNameLength: -"
    Else
        Wscript.Echo "MaximumFileNameLength: " & objItem.MaximumFileNameLength
    End If

If isNull(objItem.PageFilePresent) Then
        Wscript.Echo "PageFilePresent: -"
    Else
        Wscript.Echo "PageFilePresent: " & objItem.PageFilePresent
    End If

If isNull(objItem.SerialNumber) Then
        Wscript.Echo "SerialNumber: -"
    Else
        Wscript.Echo "SerialNumber: " & objItem.SerialNumber
    End If
  
If isNull(objItem.SupportsDiskQuotas) Then
        Wscript.Echo "SupportsDiskQuotas: -"
    Else
        Wscript.Echo "SupportsDiskQuotas: " & objItem.SupportsDiskQuotas
    End If
 
If isNull(objItem.SupportsFileBasedCompression) Then
        Wscript.Echo "SupportsFileBasedCompression: -"
    Else
        Wscript.Echo "SupportsFileBasedCompression: " & objItem.SupportsFileBasedCompression
    End If
Next
