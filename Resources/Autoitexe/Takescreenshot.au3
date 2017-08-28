#include <ScreenCapture.au3>
#include <Constants.au3>

Example()

Func Example()
    Local $hBmp

    ; Capture full screen
    $hBmp = _ScreenCapture_Capture("")

    ; Save bitmap to file
    _ScreenCapture_SaveImage($CmdLine[1] & ".jpg", $hBmp)


EndFunc