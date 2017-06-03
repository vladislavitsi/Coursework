strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BIOS",,48)
For Each objItem in colItems


    If isNull(objItem.Caption) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Caption
    End IF


    If isNull(objItem.CurrentLanguage) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.CurrentLanguage
    End IF


    If isNull(objItem.EmbeddedControllerMajorVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.EmbeddedControllerMajorVersion
    End IF


    If isNull(objItem.EmbeddedControllerMinorVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.EmbeddedControllerMinorVersion
    End IF


    If isNull(objItem.InstallableLanguages) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.InstallableLanguages
    End IF


    If isNull(objItem.ListOfLanguages) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & Join(objItem.ListOfLanguages, ",")
    End IF


    If isNull(objItem.Manufacturer) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Manufacturer
    End IF


    If isNull(objItem.PrimaryBIOS) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.PrimaryBIOS
    End IF


    If isNull(objItem.ReleaseDate) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.ReleaseDate
    End IF


    If isNull(objItem.SerialNumber) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SerialNumber
    End IF


    If isNull(objItem.SMBIOSMajorVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SMBIOSMajorVersion
    End IF


    If isNull(objItem.SMBIOSMinorVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SMBIOSMinorVersion
    End IF


    If isNull(objItem.SMBIOSPresent) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SMBIOSPresent
    End IF


    If isNull(objItem.Status) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Status
    End IF


    If isNull(objItem.SystemBiosMajorVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SystemBiosMajorVersion
    End IF


    If isNull(objItem.SystemBiosMinorVersion) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SystemBiosMinorVersion
    End IF


    If isNull(objItem.TargetOperatingSystem) Then
        Wscript.Echo "0"
    Else
    Wscript.Echo "" & objItem.TargetOperatingSystem
    End IF


    If isNull(objItem.Version) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Version
    End IF


    Wscript.Echo "" & Join(objItem.BiosCharacteristics, ",")

Next
