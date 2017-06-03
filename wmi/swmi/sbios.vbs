strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BIOS",,48)
For Each objItem in colItems


    If isNull(objItem.Caption) Then
        Wscript.Echo "Caption: -"
    Else
    Wscript.Echo "Caption: " & objItem.Caption
    End IF


    If isNull(objItem.CurrentLanguage) Then
        Wscript.Echo "CurrentLanguage: -"
    Else
    Wscript.Echo "CurrentLanguage: " & objItem.CurrentLanguage
    End IF


    If isNull(objItem.EmbeddedControllerMajorVersion) Then
        Wscript.Echo "EmbeddedControllerMajorVersion: -"
    Else
    Wscript.Echo "EmbeddedControllerMajorVersion: " & objItem.EmbeddedControllerMajorVersion
    End IF


    If isNull(objItem.EmbeddedControllerMinorVersion) Then
        Wscript.Echo "EmbeddedControllerMinorVersion: -"
    Else
    Wscript.Echo "EmbeddedControllerMinorVersion: " & objItem.EmbeddedControllerMinorVersion
    End IF


    If isNull(objItem.InstallableLanguages) Then
        Wscript.Echo "InstallableLanguages: -"
    Else
    Wscript.Echo "InstallableLanguages: " & objItem.InstallableLanguages
    End IF


    If isNull(objItem.ListOfLanguages) Then
        Wscript.Echo "ListOfLanguages: -"
    Else
    Wscript.Echo "ListOfLanguages: " & Join(objItem.ListOfLanguages, ",")
    End IF


    If isNull(objItem.Manufacturer) Then
        Wscript.Echo "Manufacturer: -"
    Else
    Wscript.Echo "Manufacturer: " & objItem.Manufacturer
    End IF


    If isNull(objItem.PrimaryBIOS) Then
        Wscript.Echo "PrimaryBIOS: -"
    Else
    Wscript.Echo "PrimaryBIOS: " & objItem.PrimaryBIOS
    End IF


    If isNull(objItem.ReleaseDate) Then
        Wscript.Echo "ReleaseDate: -"
    Else
    Wscript.Echo "ReleaseDate: " & objItem.ReleaseDate
    End IF


    If isNull(objItem.SerialNumber) Then
        Wscript.Echo "SerialNumber: -"
    Else
    Wscript.Echo "SerialNumber: " & objItem.SerialNumber
    End IF


    If isNull(objItem.SMBIOSMajorVersion) Then
        Wscript.Echo "SMBIOSMajorVersion: -"
    Else
    Wscript.Echo "SMBIOSMajorVersion: " & objItem.SMBIOSMajorVersion
    End IF


    If isNull(objItem.SMBIOSMinorVersion) Then
        Wscript.Echo "SMBIOSMinorVersion: -"
    Else
    Wscript.Echo "SMBIOSMinorVersion: " & objItem.SMBIOSMinorVersion
    End IF


    If isNull(objItem.SMBIOSPresent) Then
        Wscript.Echo "SMBIOSPresent: -"
    Else
    Wscript.Echo "SMBIOSPresent: " & objItem.SMBIOSPresent
    End IF


    If isNull(objItem.Status) Then
        Wscript.Echo "Status: -"
    Else
    Wscript.Echo "Status: " & objItem.Status
    End IF


    If isNull(objItem.SystemBiosMajorVersion) Then
        Wscript.Echo "SystemBiosMajorVersion: -"
    Else
    Wscript.Echo "SystemBiosMajorVersion: " & objItem.SystemBiosMajorVersion
    End IF


    If isNull(objItem.SystemBiosMinorVersion) Then
        Wscript.Echo "SystemBiosMinorVersion: -"
    Else
    Wscript.Echo "SystemBiosMinorVersion: " & objItem.SystemBiosMinorVersion
    End IF


    If isNull(objItem.TargetOperatingSystem) Then
        Wscript.Echo "TargetOperatingSystem: 0"
    Else
    Wscript.Echo "TargetOperatingSystem: " & objItem.TargetOperatingSystem
    End IF


    If isNull(objItem.Version) Then
        Wscript.Echo "Version: -"
    Else
    Wscript.Echo "Version: " & objItem.Version
    End IF


    Wscript.Echo "BiosCharacteristics: " & Join(objItem.BiosCharacteristics, ",")

Next
