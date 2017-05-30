strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_VideoController",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.Name
    Wscript.Echo "" & objItem.AdapterCompatibility
    Wscript.Echo "" & objItem.AdapterDACType
    Wscript.Echo "" & objItem.AdapterRAM
    Wscript.Echo "" & objItem.Availability
    Wscript.Echo "" & objItem.ConfigManagerUserConfig
    If isNull(objItem.CurrentBitsPerPixel) Then
                        Wscript.Echo "-"
                    Else
                        Wscript.Echo "" & objItem.CurrentBitsPerPixel
                    End If
    If isNull(objItem.CurrentRefreshRate) Then
                    Wscript.Echo "-"
                Else
                    Wscript.Echo "" & objItem.CurrentRefreshRate
                End If
    If isNull(objItem.CurrentScanMode) Then
                Wscript.Echo "0"
            Else
                Wscript.Echo "" & objItem.CurrentScanMode
            End If
    Wscript.Echo "" & objItem.DriverDate
    Wscript.Echo "" & objItem.DriverVersion
    Wscript.Echo "" & objItem.InfFilename
    Wscript.Echo "" & objItem.InfSection
    Wscript.Echo "" & objItem.InstalledDisplayDrivers
    If isNull(objItem.MaxRefreshRate) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.MaxRefreshRate
        End If
    If isNull(objItem.MinRefreshRate) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.MinRefreshRate
        End If
    Wscript.Echo "" & objItem.Monochrome
    Wscript.Echo "" & objItem.Status
    Wscript.Echo "" & objItem.VideoArchitecture
    Wscript.Echo "" & objItem.VideoMemoryType
    If isNull(objItem.VideoModeDescription) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.VideoModeDescription
        End If
    Wscript.Echo "" & objItem.VideoProcessor
Next
