This is the Android source code of RichToast

Author: Enrique López Mañas (eenriquelopez@gmail.com)

Source code is under GPL3 (see LICENSE)
Graphics are under CC-SA (see res/LICENSE)


Instructions
==============

1.- Clone the library (git clone https://github.com/kikoso/AndroidRichToast.git)
2.- Include into your project as a library
3.- Call RichToast with the following:
   
	 RichToast.makeText(this, "My text", Toast.LENGH_SHORT, RichToast.RICHTOAST_BUDGET).show();

4.- There are 4 constants included within the library as images:

* RICHTOAST_ADMIN
* RICHTOAST_BUDGET
* RICHTOAST_HEART
* RICHTOAST_SPEAKERS

You can add your own resources too.

The library includes RobotO-light as Typography. This is a test on how it looks:

![Screenshot](https://raw.github.com/kikoso/AndroidRichToast/master/assets/screenshot.png)
