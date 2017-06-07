strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Processor",,48)
For Each objItem in colItems



    If isNull(objItem.DataWidth) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.DataWidth
    End IF


    If isNull(objItem.AddressWidth) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.AddressWidth
    End IF


    If isNull(objItem.Architecture) Then
        Wscript.Echo "-1"
    Else
    Wscript.Echo "" & objItem.Architecture
    End IF


    If isNull(objItem.Availability) Then
        Wscript.Echo "2"
    Else
    Wscript.Echo "" & objItem.Availability
    End IF


    If isNull(objItem.CpuStatus) Then
        Wscript.Echo "0"
    Else
    Wscript.Echo "" & objItem.CpuStatus
    End IF


    If isNull(objItem.CurrentClockSpeed) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.CurrentClockSpeed
    End IF


    If isNull(objItem.CurrentVoltage) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.CurrentVoltage
    End IF


    If isNull(objItem.Description) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Description
    End IF


    If isNull(objItem.DeviceID) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.DeviceID
    End IF


    If isNull(objItem.L2CacheSize) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.L2CacheSize
    End IF


    If isNull(objItem.L3CacheSize) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.L3CacheSize
    End IF


    If isNull(objItem.Name) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Name
    End IF


    If isNull(objItem.Manufacturer) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Manufacturer
    End IF


    If isNull(objItem.MaxClockSpeed) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.MaxClockSpeed
    End IF


    If isNull(objItem.NumberOfCores) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.NumberOfCores
    End IF


    If isNull(objItem.NumberOfEnabledCore) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.NumberOfEnabledCore
    End IF


    If isNull(objItem.NumberOfLogicalProcessors) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.NumberOfLogicalProcessors
    End IF


    If isNull(objItem.ThreadCount) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.ThreadCount
    End IF


    If isNull(objItem.PowerManagementSupported) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.PowerManagementSupported
    End IF


    If isNull(objItem.ProcessorId) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.ProcessorId
    End IF


    If isNull(objItem.ProcessorType) Then
        Wscript.Echo "2"
    Else
    Wscript.Echo "" & objItem.ProcessorType
    End IF


    If isNull(objItem.Revision) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Revision
    End IF


    If isNull(objItem.Role) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.Role
    End IF


    If isNull(objItem.SecondLevelAddressTranslationExtensions) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SecondLevelAddressTranslationExtensions
    End IF


    If isNull(objItem.SocketDesignation) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SocketDesignation
    End IF


    If isNull(objItem.SystemName) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.SystemName
    End IF


    If isNull(objItem.VirtualizationFirmwareEnabled) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.VirtualizationFirmwareEnabled
    End IF


    If isNull(objItem.VMMonitorModeExtensions) Then
        Wscript.Echo "-"
    Else
    Wscript.Echo "" & objItem.VMMonitorModeExtensions
    End IF



Next