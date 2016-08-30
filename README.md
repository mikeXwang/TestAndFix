# TestAndFix
Hi,I'm WangZhibin,


This is a demo for testing AndFix

You could get apkpatch to generate patch file:

https://github.com/alibaba/AndFix/tree/master/tools


How to use this demo:

1.pull the code TestAndFix
2.compile the code in AndroidStudio
3.generate signed apk with keystore & save it->old.apk
4.change the method "getString" code int TestString  
5.regenerate signed apk with keystore & save it->new.apk
6.used apkpatch to make patch between old.apk & new.apk
7.install old.apk & click the button,see the old string;
8.change patch name & use adb push to push patch to /scard/
9.kill testapk & restart it(indeed it dose't need to restart.we restart it here,cause we put the loadPatch operation in application class)

