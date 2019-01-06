package project;

import java.io.*;
import java.math.BigDecimal;

import static project.charge.twoPoint;

/**
 * 处理文件
 */
public class chargev1 {

    public static String reg = "[\\u4e00-\\u9fa5_a-zA-Z/，；。：]+";

    public static void main(String[] args) throws IOException {

        File file = new File("D://proj.txt");
        InputStreamReader inStream = new InputStreamReader(new FileInputStream(file), "GBK");
        BufferedReader br = new BufferedReader(inStream);
        String str;
        int c = 0;
        //每次读取一行
        while ((str = br.readLine()) != null) {
            String[] split = str.split("：");
            //常规业务应能拆分为3个
            //没有：的为   1、2#楼-采暖：（1）
            if (split.length <= 1) {
                //单独拆分
                String s = str.replaceAll(reg, ",");
                String[] split1 = s.split(",");
                //拆分出3个数，由于序号没有被正则过滤掉，会产生4个长度
                if (split1.length != 4) {
                    System.err.println("-----------该行被舍弃" + str + split1.length);
                    continue;
                } else {
                    int conut = split1.length - 1;
                    double[] doubles = new double[conut];
                    for (int i = 1; i < split1.length; i++) {
                        doubles[i - 1] = Double.parseDouble(split1[i]);
                    }
                    double num1 = doubles[0] - doubles[1];
                    double f1 = twoPoint(num1);
                    if (f1 != doubles[2]) {
                        System.err.println("审减金额核算错误" + f1 + " : " + doubles[2]);
                    }
                    continue;
                }
            }
            String title = split[0];//title为冒号前部分 4、第22项导线BV-2.5
            String content = split[1];//content为原报工程量2710.5m，单价631.2元/100m，合价17108.68元；审后工程量1906.53m，单价631.2元/100m，合价12034.02元；审减造价5074.66元，审减原因
            c++;//处理数+1
            boolean deal = deal(content);
            if (deal == false) {
                System.out.println(split[0]);//输出错误的标题
                System.out.println("------------------------");
            }
        }
        System.out.println("文件完毕，处理的消息数：" + c);
    }


    /**
     * @param content 冒号后面的文字
     * @return 核减正确返回true，计算错误返回false
     */
    private static boolean deal(String content) {
        String s = content.replaceAll(reg, ",");
        String[] split = s.split(",");
        //第一个是空，并且结尾空字符串将被丢弃
        //有效个数count
        int conut = split.length - 1;
        if (conut == 9) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
            }
            double num1 = doubles[0] * doubles[1] / doubles[2];
            double f1 = twoPoint(num1);
            if (f1 != doubles[3]) {
                System.err.println("核算错误" + f1 + " : " + doubles[3]);
                return false;
            }
            double num2 = doubles[4] * doubles[5] / doubles[6];
            double f2 = twoPoint(num2);
            if (f2 != doubles[7]) {
                System.err.println("核算错误" + f2 + " : " + doubles[7]);
                return false;
            }
            if (twoPoint(f1 - f2) != doubles[8]) {
                double f3 = twoPoint(f1 - f2);
                System.err.println("核算总价错误" + f3 + " : " + doubles[8]);
                return false;
            }
        }
        if (conut == 7) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
            }
            double num1 = doubles[0] * doubles[1];
            double f1 = twoPoint(num1);
            if (f1 != doubles[2]) {
                System.err.println("核算错误" + f1 + " : " + doubles[2]);
                return false;
            }
            double num2 = doubles[3] * doubles[4];
            double f2 = twoPoint(num2);
            if (f2 != doubles[5]) {
                System.err.println("核算错误" + f2 + " : " + doubles[5]);
                return false;
            }
            if (twoPoint(f1 - f2) != doubles[6]) {
                double v = twoPoint(f1 - f2);
                System.err.println("核算总价错误" + v + " : " + doubles[6]);
                return false;
            }
        }
        if (conut == 3) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
            }
            double num1 = doubles[0];
            double f1 = twoPoint(num1);

            double num2 = doubles[1];
            double f2 = twoPoint(num2);

            if (twoPoint(f1 - f2) != doubles[2]) {
                double v = twoPoint(f1 - f2);
                System.err.println("核算总价错误" + v + " : " + doubles[2]);
                return false;
            }
        }
        if (conut == 11) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
            }
            double num1 = doubles[0] * doubles[2];
            double f1 = twoPoint(num1);
            if (f1 != doubles[4]) {
                System.err.println("核算错误" + f1 + " : " + doubles[4]);
                return false;
            }
            double num2 = doubles[5] * doubles[7];
            double f2 = twoPoint(num2);
            if (f2 != doubles[9]) {
                System.err.println("核算错误" + f2 + " : " + doubles[9]);
                return false;
            }
            if (twoPoint(f1 - f2) != doubles[10]) {
                double f3 = twoPoint(f1 - f2);
                System.err.println("核算总价错误" + f3 + " : " + doubles[10]);
                return false;
            }
        }
        if (conut == 13) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
            }
            double num1 = doubles[0] * doubles[2] / doubles[3];
            double f1 = twoPoint(num1);
            if (f1 != doubles[5]) {
                System.err.println("核算错误" + f1 + doubles[5]);
                return false;
            }
            double num2 = doubles[6] * doubles[8] / doubles[9];
            double f2 = twoPoint(num2);
            if (f2 != doubles[11]) {
                System.err.println("核算错误" + f2 + " : " + doubles[11]);
                return false;
            }
            if (twoPoint(f1 - f2) != doubles[12]) {
                System.err.println("核算总价错误" + doubles[12]);
                return false;
            }
        }
        if (conut == 4) {

            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
            }
            double num1 = doubles[0] - doubles[1];
            double f1 = twoPoint(num1);
            if (f1 != doubles[2]) {
                System.err.println("核算错误" + f1 + doubles[2]);
                return false;
            }
            double num2 = doubles[2] / doubles[0];
            double f2 = twoPoint(num2);
            double f3 = twoPoint(doubles[3] * 0.01);
            if (f2 != f3) {
                System.err.println("审减率错误" + f2 + f3);
                return false;
            }

        }
        return true;
    }

    /**
     * 让double保留两位小数并四舍五入
     *
     * @param num double数
     * @return 有两位小数的数字
     */
    public static double twoPoint(Double num) {
        BigDecimal b = new BigDecimal(num.toString());
        double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }
}
