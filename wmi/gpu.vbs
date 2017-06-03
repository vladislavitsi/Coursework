strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_VideoController",,48)
For Each objItem in colItems


    If isNull(objItem.Name) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Name
    End IF


    If isNull(objItem.AdapterCompatibility) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.AdapterCompatibility
    End IF


    If isNull(objItem.AdapterDACType) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.AdapterDACType
    End IF    


    If isNull(objItem.AdapterRAM) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.AdapterRAM
    End IF


    If isNull(objItem.Availability) Then
        Wscript.Echo "2"
    Else
    Wscript.Echo "" & objItem.Availability
    End IF


    If isNull(objItem.ConfigManagerUserConfig) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.ConfigManagerUserConfig
    End IF


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


    If isNull(objItem.DriverDate) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.DriverDate
    End IF


    If isNull(objItem.DriverVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.DriverVersion
    End IF


    If isNull(objItem.InfFilename) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.InfFilename
    End IF


    If isNull(objItem.InfSection) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.InfSection
    End IF


    If isNull(objItem.InstalledDisplayDrivers) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.InstalledDisplayDrivers
    End IF


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


    If isNull(objItem.Monochrome) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Monochrome
    End IF


    If isNull(objItem.Status) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Status
    End IF


    If isNull(objItem.VideoArchitecture) Then
        Wscript.Echo "2"
    Else
    Wscript.Echo "" & objItem.VideoArchitecture
    End IF


    If isNull(objItem.VideoMemoryType) Then
        Wscript.Echo "2"
    Else
    Wscript.Echo "" & objItem.VideoMemoryType
    End IF


    If isNull(objItem.VideoModeDescription) Then
            Wscript.Echo "-"
        Else
            Wscript.Echo "" & objItem.VideoModeDescription
        End If


    If isNull(objItem.VideoProcessor) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.VideoProcessor
    End IF

Next
