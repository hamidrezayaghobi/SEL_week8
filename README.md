# آزمایش هشتم -  آزمایشگاه مهندسی نرم‌افزار
اعضای گروه: علیرضا حیدری 98109731، حمیدرضا یعقوبی 98109786
# گزارش مراحل انجام آزمایش
## بخش اول
ابتدا مطابق روش گفته شده در صورت آزمایش، برنامه Yourkit را نصب کرده (ما جدید ترین ورژن رو نصب کردیم و از Trialاش استفاده کردیم) و سپس آن را مطابق روش گفته شده به IntelliJ وصل می کنیم. حال پروژه ProfilingTest را اجرا می کنیم و به کمک این نرم افزار، پروفایل میکنیم. بعد از اجرای کلاس  JavaCup متوجه می شویم که مشکلی وجود دارد. حال تصویر زیر را مشاهده کنید:

![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/e664f974-7984-4743-ac60-7ad6848bfa4b)

همانطور که مشاهده میکنید. مشکلی در تابع Temp وجود دارد( همانطور که از اسمش پیداست :) ). حال به شکل زیر، مشکل را حل می کنیم.
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/c3f350e0-8232-488d-ab13-aa0f2c1faeb1)

حال به کمک ok_emp مشکل رو حل میکنیم و ران میگیریم و دوباره پروفایل میکنیم. حالا نتایح رو مشاهده میکنیم.
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/75faa9b7-06d4-494b-9515-94c6e80dd964)
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/9d0dac58-f7fc-4e07-9ef7-a7c4ed94b3b5)
و هیج مشکلی وجود ندارد.
## بخش دوم
برای این بخش، الگوریتمی که در نظر گرفتیم، الگوریتم فیبوناچی است. ابتدا به روش نامناسبی این الگورتیم را پیاده سازی می کنیم. به شکل زیر (ورودی الگوریتم در تمامی عکس های ۱۰۰۰ است):
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/5283bbcc-f290-4a2d-9694-bee7049281d8)
پروفایل میکنیم تا اوضاع بد را بررسی کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/3c874a60-2ea2-4152-b832-2322e14dd75a)

حال راه مناسب را پیاده سازی میکنیم.
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/6407b448-1ae2-483a-b16a-ee4fbc10fe29)
سپس مانیتور میکنیم.
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/1c046591-5ee5-4c9f-beb1-8609106483c8)
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/0296d67d-7c59-4d4f-85f1-17aebefeffde)


و مشکلی وجود ندارد. اگر هم با حالت قبل مقایسه کنیم(در تصویر زیر تازه الگوریتم هنوز پایان نیافته است)
![image](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/b1d798b8-f700-4b0e-a983-5bf6fa703947)
![Screenshot from 2024-01-12 21-37-31](https://github.com/hamidrezayaghobi/SEL_week8/assets/59170724/3e2ffdb9-1595-4616-ad9f-f165528b2ff6)

 متوجه تفاوت خواهیم شدش.
