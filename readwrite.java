
package shiyanwu;

import java.util.Scanner;
import java.io.*;

public class readwrite {
    public static void main(String args[]) {
        students xuesheng = new students();
        System.out.println("输入性别 姓名 年龄 学号");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        String sex = a.nextLine();
        int age = a.nextInt();
        int number = a.nextInt();
        xuesheng.setGraduate(name, sex, age, number);
        
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

            a:
            while (true) {
                System.out.println("输入1或者2选择查询字和词或者退出");
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                switch (n) {
                    case 1:
                        Scanner Nesity = new Scanner(System.in);
                        System.out.println("请输入想要查询的字:");
                        String b = Nesity.nextLine();
                        int count = (str.length() - str.replace(b, "").length()) / b.length(); //使用replace方法将字符串替换为空，然后求长度
                        System.out.println(count);
                        break;
                    case 2:
                        System.out.println("退出");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出现错误!");
        }
    }
}










