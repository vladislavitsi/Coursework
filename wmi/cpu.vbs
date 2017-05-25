strComputer = "."
Set objWMIService = GetObject("winmgmts:\\" & strComputer & "\root\CIMV2")
Set colItems = objWMIService.ExecQuery( _
    "SELECT * FROM Win32_Processor",,48)
For Each objItem in colItems
    Wscript.Echo "" & objItem.DataWidth
    Wscript.Echo "" & objItem.AddressWidth
    Wscript.Echo "" & objItem.Architecture
    Wscript.Echo "" & objItem.Availability
    Wscript.Echo "" & objItem.CpuStatus
    Wscript.Echo "" & objItem.CurrentClockSpeed
    Wscript.Echo "" & objItem.CurrentVoltage
    Wscript.Echo "" & objItem.Description
    Wscript.Echo "" & objItem.DeviceID
    Wscript.Echo "" & objItem.L2CacheSize
    Wscript.Echo "" & objItem.L3CacheSize
    Wscript.Echo "" & objItem.Name
    Wscript.Echo "" & objItem.Manufacturer
    Wscript.Echo "" & objItem.MaxClockSpeed
    Wscript.Echo "" & objItem.NumberOfCores
    Wscript.Echo "" & objItem.NumberOfEnabledCore
    Wscript.Echo "" & objItem.NumberOfLogicalProcessors
    Wscript.Echo "" & objItem.ThreadCount
    Wscript.Echo "" & objItem.PowerManagementSupported
    Wscript.Echo "" & objItem.ProcessorId
    Wscript.Echo "" & objItem.ProcessorType
    Wscript.Echo "" & objItem.Revision
    Wscript.Echo "" & objItem.Role
    Wscript.Echo "" & objItem.SecondLevelAddressTranslationExtensions
    Wscript.Echo "" & objItem.SerialNumber
    Wscript.Echo "" & objItem.SocketDesignation
    Wscript.Echo "" & objItem.SystemName
    Wscript.Echo "" & objItem.VirtualizationFirmwareEnabled
    Wscript.Echo "" & objItem.VMMonitorModeExtensions
Next