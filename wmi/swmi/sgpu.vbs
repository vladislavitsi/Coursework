strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_VideoController",,48)
For Each objItem in colItems


    If isNull(objItem.Name) Then
        Wscript.Echo "Name: -"
    Else
    Wscript.Echo "Name: " & objItem.Name
    End IF


    If isNull(objItem.AdapterCompatibility) Then
        Wscript.Echo "AdapterCompatibility: -"
    Else
    Wscript.Echo "AdapterCompatibility: " & objItem.AdapterCompatibility
    End IF


    If isNull(objItem.AdapterDACType) Then
        Wscript.Echo "AdapterDACType: -"
    Else
    Wscript.Echo "AdapterDACType: " & objItem.AdapterDACType
    End IF    


    If isNull(objItem.AdapterRAM) Then
        Wscript.Echo "AdapterRAM: -"
    Else
    Wscript.Echo "AdapterRAM: " & objItem.AdapterRAM
    End IF


    If isNull(objItem.Availability) Then
        Wscript.Echo "Availability: 2"
    Else
    Wscript.Echo "Availability: " & objItem.Availability
    End IF


    If isNull(objItem.ConfigManagerUserConfig) Then
        Wscript.Echo "ConfigManagerUserConfig: -"
    Else
    Wscript.Echo "ConfigManagerUserConfig: " & objItem.ConfigManagerUserConfig
    End IF


    If isNull(objItem.CurrentBitsPerPixel) Then
                        Wscript.Echo "CurrentBitsPerPixel: -"
                    Else
                        Wscript.Echo "CurrentBitsPerPixel: " & objItem.CurrentBitsPerPixel
                    End If

    If isNull(objItem.CurrentRefreshRate) Then
                    Wscript.Echo "CurrentRefreshRate: -"
                Else
                    Wscript.Echo "CurrentRefreshRate: " & objItem.CurrentRefreshRate
                End If

    If isNull(objItem.CurrentScanMode) Then
                Wscript.Echo "CurrentScanMode: 0"
            Else
                Wscript.Echo "CurrentScanMode: " & objItem.CurrentScanMode
            End If


    If isNull(objItem.DriverDate) Then
        Wscript.Echo "DriverDate: -"
    Else
    Wscript.Echo "DriverDate: " & objItem.DriverDate
    End IF


    If isNull(objItem.DriverVersion) Then
        Wscript.Echo "DriverVersion: -"
    Else
    Wscript.Echo "DriverVersion: " & objItem.DriverVersion
    End IF


    If isNull(objItem.InfFilename) Then
        Wscript.Echo "InfFilename: -"
    Else
    Wscript.Echo "InfFilename: " & objItem.InfFilename
    End IF


    If isNull(objItem.InfSection) Then
        Wscript.Echo "InfSection: -"
    Else
    Wscript.Echo "InfSection: " & objItem.InfSection
    End IF


    If isNull(objItem.InstalledDisplayDrivers) Then
        Wscript.Echo "InstalledDisplayDrivers: -"
    Else
    Wscript.Echo "InstalledDisplayDrivers: " & objItem.InstalledDisplayDrivers
    End IF


    If isNull(objItem.MaxRefreshRate) Then
            Wscript.Echo "MaxRefreshRate: -"
        Else
            Wscript.Echo "MaxRefreshRate: " & objItem.MaxRefreshRate
        End If


    If isNull(objItem.MinRefreshRate) Then
            Wscript.Echo "MinRefreshRate: -"
        Else
            Wscript.Echo "MinRefreshRate: " & objItem.MinRefreshRate
        End If


    If isNull(objItem.Monochrome) Then
        Wscript.Echo "Monochrome: -"
    Else
    Wscript.Echo "Monochrome: " & objItem.Monochrome
    End IF


    If isNull(objItem.Status) Then
        Wscript.Echo "Status: -"
    Else
    Wscript.Echo "Status: " & objItem.Status
    End IF


    If isNull(objItem.VideoArchitecture) Then
        Wscript.Echo "VideoArchitecture: 2"
    Else
    Wscript.Echo "VideoArchitecture: " & objItem.VideoArchitecture
    End IF


    If isNull(objItem.VideoMemoryType) Then
        Wscript.Echo "VideoMemoryType: 2"
    Else
    Wscript.Echo "VideoMemoryType: " & objItem.VideoMemoryType
    End IF


    If isNull(objItem.VideoModeDescription) Then
            Wscript.Echo "VideoModeDescription: -"
        Else
            Wscript.Echo "VideoModeDescription: " & objItem.VideoModeDescription
        End If


    If isNull(objItem.VideoProcessor) Then
        Wscript.Echo "VideoProcessor: -"
    Else
    Wscript.Echo VideoProcessor": " & objItem.VideoProcessor
    End IF

Next
