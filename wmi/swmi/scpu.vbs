strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Processor",,48)
For Each objItem in colItems


    If isNull(objItem.DataWidth) Then
        Wscript.Echo "DataWidth: -"
    Else
    Wscript.Echo "DataWidth: " & objItem.DataWidth
    End IF


    If isNull(objItem.AddressWidth) Then
        Wscript.Echo "AddressWidth: -"
    Else
    Wscript.Echo "AddressWidth: " & objItem.AddressWidth
    End IF


    If isNull(objItem.Architecture) Then
        Wscript.Echo "Architecture: -1"
    Else
    Wscript.Echo "Architecture: " & objItem.Architecture
    End IF


    If isNull(objItem.Availability) Then
        Wscript.Echo "Availability: 2"
    Else
    Wscript.Echo "Availability: " & objItem.Availability
    End IF


    If isNull(objItem.CpuStatus) Then
        Wscript.Echo "CpuStatus: 0"
    Else
    Wscript.Echo "CpuStatus: " & objItem.CpuStatus
    End IF


    If isNull(objItem.CurrentClockSpeed) Then
        Wscript.Echo "CurrentClockSpeed: -"
    Else
    Wscript.Echo "CurrentClockSpeed: " & objItem.CurrentClockSpeed
    End IF


    If isNull(objItem.CurrentVoltage) Then
        Wscript.Echo "CurrentVoltage: -"
    Else
    Wscript.Echo "CurrentVoltage: " & objItem.CurrentVoltage
    End IF


    If isNull(objItem.Description) Then
        Wscript.Echo "Description: -"
    Else
    Wscript.Echo "Description: " & objItem.Description
    End IF


    If isNull(objItem.DeviceID) Then
        Wscript.Echo "DeviceID: -"
    Else
    Wscript.Echo "DeviceID: " & objItem.DeviceID
    End IF


    If isNull(objItem.L2CacheSize) Then
        Wscript.Echo "L2CacheSize: -"
    Else
    Wscript.Echo "L2CacheSize: " & objItem.L2CacheSize
    End IF


    If isNull(objItem.L3CacheSize) Then
        Wscript.Echo "L3CacheSize: -"
    Else
    Wscript.Echo "L3CacheSize: " & objItem.L3CacheSize
    End IF


    If isNull(objItem.Name) Then
        Wscript.Echo "Name: -"
    Else
    Wscript.Echo "Name: " & objItem.Name
    End IF


    If isNull(objItem.Manufacturer) Then
        Wscript.Echo "Manufacturer: -"
    Else
    Wscript.Echo "Manufacturer: " & objItem.Manufacturer
    End IF


    If isNull(objItem.MaxClockSpeed) Then
        Wscript.Echo "MaxClockSpeed: -"
    Else
    Wscript.Echo "MaxClockSpeed: " & objItem.MaxClockSpeed
    End IF


    If isNull(objItem.NumberOfCores) Then
        Wscript.Echo "NumberOfCores: -"
    Else
    Wscript.Echo "NumberOfCores: " & objItem.NumberOfCores
    End IF


    If isNull(objItem.NumberOfEnabledCore) Then
        Wscript.Echo "NumberOfEnabledCore: -"
    Else
    Wscript.Echo "NumberOfEnabledCore: " & objItem.NumberOfEnabledCore
    End IF


    If isNull(objItem.NumberOfLogicalProcessors) Then
        Wscript.Echo "NumberOfLogicalProcessors: -"
    Else
    Wscript.Echo "NumberOfLogicalProcessors: " & objItem.NumberOfLogicalProcessors
    End IF


    If isNull(objItem.ThreadCount) Then
        Wscript.Echo "ThreadCount: -"
    Else
    Wscript.Echo "ThreadCount: " & objItem.ThreadCount
    End IF


    If isNull(objItem.PowerManagementSupported) Then
        Wscript.Echo "PowerManagementSupported: -"
    Else
    Wscript.Echo "PowerManagementSupported: " & objItem.PowerManagementSupported
    End IF


    If isNull(objItem.ProcessorId) Then
        Wscript.Echo "ProcessorId: -"
    Else
    Wscript.Echo "ProcessorId: " & objItem.ProcessorId
    End IF


    If isNull(objItem.ProcessorType) Then
        Wscript.Echo "ProcessorType: 2"
    Else
    Wscript.Echo "ProcessorType: " & objItem.ProcessorType
    End IF


    If isNull(objItem.Revision) Then
        Wscript.Echo "Revision: -"
    Else
    Wscript.Echo "Revision: " & objItem.Revision
    End IF


    If isNull(objItem.Role) Then
        Wscript.Echo "Role: -"
    Else
    Wscript.Echo "Role: " & objItem.Role
    End IF


    If isNull(objItem.SecondLevelAddressTranslationExtensions) Then
        Wscript.Echo "SecondLevelAddressTranslationExtensions: -"
    Else
    Wscript.Echo "SecondLevelAddressTranslationExtensions: " & objItem.SecondLevelAddressTranslationExtensions
    End IF


    If isNull(objItem.SerialNumber) Then
        Wscript.Echo "SerialNumber: -"
    Else
    Wscript.Echo "SerialNumber: " & objItem.SerialNumber
    End IF


    If isNull(objItem.SocketDesignation) Then
        Wscript.Echo "SocketDesignation: -"
    Else
    Wscript.Echo "SocketDesignation: " & objItem.SocketDesignation
    End IF


    If isNull(objItem.SystemName) Then
        Wscript.Echo "SystemName: -"
    Else
    Wscript.Echo "SystemName: " & objItem.SystemName
    End IF


    If isNull(objItem.VirtualizationFirmwareEnabled) Then
        Wscript.Echo "VirtualizationFirmwareEnabled: -"
    Else
    Wscript.Echo "VirtualizationFirmwareEnabled: " & objItem.VirtualizationFirmwareEnabled
    End IF


    If isNull(objItem.VMMonitorModeExtensions) Then
        Wscript.Echo "VMMonitorModeExtensions: -"
    Else
    Wscript.Echo "VMMonitorModeExtensions: " & objItem.VMMonitorModeExtensions
    End IF



Next