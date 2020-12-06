# 实验五

##一.实验目的

掌握字符串String及其方法的使用

掌握文件的读取/写入方法

掌握异常处理结构

##二.实验内容

在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。

文件A包括两部分内容：

一是学生的基本信息；

二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”

2.允许提供输入参数，统计古诗中某个字或词出现的次数

3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A

4.考虑操作中可能出现的异常，在程序中设计异常处理程序

##三.实验要求

设计学生类（可利用之前的）；

采用交互式方式实例化某学生；

设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。

##四.实验步骤

1.首先创建Student类和Test类两个类

2.在Student类里完成学生所需信息

3.Test类里利用scanner函数首先输入学生信息，然后读取文本文件长恨歌，存到缓存区，但后再读取

4.在其中加入try-catch函数来处理异常输入

5.使用readLine方法，一次读一行，然后在每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”之后写入到A文本里面，用replace方法将字符串替换为空，然后计算出现次数

6.利用switch函数来循环选择进行查字或词语出现的次数或者选择退出程序

##五.核心代码

下面是读取文件和写入文件的部分，以及加标点符号的循环
```
try {
            FileReader fileReader = new FileReader("D:\\chg.txt");//读取D盘文件
            BufferedReader bufferedReader = new BufferedReader(fileReader);//把文件存到缓冲区
            Writer writer = new FileWriter(new File("D:\\Nesity.txt"));//将缓冲区文件写到A中
            String str = bufferedReader.readLine();
            String regex = "(.{7})";//每隔七个字加一个逗号
            str = str.replaceAll(regex, "$1，");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "。\n");//加句号
            }
            System.out.println(x);
            writer.write(String.valueOf(xuesheng));
            writer.write("\n");
            writer.write(String.valueOf(x));//把x写的东西写进文本
            bufferedReader.close();//关闭缓冲区
            fileReader.close();//关闭读写文件
            writer.close();//关闭写入
```
##六.实验截图

![a](https://github.com/gengtong-191/shiyanwu/blob/main/6946facf7053d6e0c96c316b08de884.png)

##七.实验感想

