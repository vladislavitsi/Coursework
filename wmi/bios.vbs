strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_BIOS",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.Caption
    Wscript.Echo "" & objItem.CurrentLanguage
    Wscript.Echo "" & objItem.EmbeddedControllerMajorVersion
    Wscript.Echo "" & objItem.EmbeddedControllerMinorVersion
    Wscript.Echo "" & objItem.InstallableLanguages
    Wscript.Echo "" & Join(objItem.ListOfLanguages, ",")
    Wscript.Echo "" & objItem.Manufacturer
    Wscript.Echo "" & objItem.PrimaryBIOS
    Wscript.Echo "" & objItem.ReleaseDate
    Wscript.Echo "" & objItem.SerialNumber
    Wscript.Echo "" & objItem.SMBIOSMajorVersion
    Wscript.Echo "" & objItem.SMBIOSMinorVersion
    Wscript.Echo "" & objItem.SMBIOSPresent
    Wscript.Echo "" & objItem.Status
    Wscript.Echo "" & objItem.SystemBiosMajorVersion
    Wscript.Echo "" & objItem.SystemBiosMinorVersion
    Wscript.Echo "" & objItem.TargetOperatingSystem
    Wscript.Echo "" & objItem.Version
    Wscript.Echo "" & Join(objItem.BiosCharacteristics, ",")
Next
