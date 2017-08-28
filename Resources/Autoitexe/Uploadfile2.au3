#include <Constants.au3>


Example()

Func Example()

WinWaitActive($CmdLine[1])
ControlClick($CmdLine[1],"",$CmdLine[2]])
ControlSend($CmdLine[1],"",$CmdLine[2],$CmdLine[3])
WinWait(3)
ControlSend($CmdLine[1],"",$CmdLine[4],$CmdLine[5])
WinWait(3)
ControlClick($CmdLine[1],"",$CmdLine[6])

EndFunc



