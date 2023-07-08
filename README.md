# CircleDraw
view绘制圆
效果图
![Screenshot_20230708_170113_com example drawcircle](https://github.com/liasazhang/CircleDraw/assets/87653158/605f24a0-4e34-4948-8f8c-1ad452e4c14d)
### 绘制小点提醒：
注意三个构造函数都要写,涉及不同构造方法，xml布局反射构造java、style参数属性传参构造。
onMeasure onLayout这里直接调用父类的方法，没做改动。
onDraw绘制这里
### 代码相关
paint1.setAntiAlias(true);//是否锯齿状，true是非锯齿
paint1.setColor(Color.RED);//这里的颜色要全大写的颜色参数
### 疑问
为什么有的函数不亮呢
![image](https://github.com/liasazhang/CircleDraw/assets/87653158/0eb02833-eda7-4532-865a-d240a7bc7b9e)
