Dim oWMI : Set oWMI = GetObject("winmgmts:")
Dim classComponent : Set classComponent = oWMI.ExecQuery("SELECT Name, Description FROM win32_BIOS")
Dim obj, strData
For Each obj in classComponent
 strData = strData & obj.Name & VBCrLf
 strData = strData & obj.Description & VBCrLf
 'strData = strData & obj.CurrentLanguage & VBCrLf
' strData = strData & obj.Manufacturer & VBCrLf
Next
wscript.echo strData