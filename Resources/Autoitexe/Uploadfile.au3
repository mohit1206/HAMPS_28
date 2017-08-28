#include <Constants.au3>


Example()

Func Example()

WinWaitActive($CmdLine[1])
ControlSend($CmdLine[1],"",$CmdLine[2],$CmdLine[3])
ControlClick($CmdLine[1],"",$CmdLine[4])

EndFunc



