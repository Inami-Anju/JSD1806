package project;



import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;


public class charge {
    @Test
    public void test() throws IOException {
        File file = new File("D://【青牛软件呼叫中心-安装】审计报告（广建版） (1).doc");
        InputStreamReader inStream = new InputStreamReader(new FileInputStream(file), "GBK");
        BufferedReader br = new BufferedReader(inStream);
        String str;
        int count=0;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
            count++;
            }
        //System.out.println(count);
    }

    @Test
    public void test1() throws IOException {
        double v = twoPoint(87.65 * 170.7);
        System.out.println(v);
    }
    @Test
    public void test2() throws IOException {
        String str="原报工程量168.9m，单价126.05元/10m，合价2128.98元；审后工程量31m，单价126.05元/10m，合价390.76元；审减造价1738.22元，审减原因：工程量调整。";   //并且结尾空字符串将被丢弃
        String s=str.replaceAll("[\\u4e00-\\u9fa5_a-zA-Z/，；。：]+", ",");

        System.out.println(s);
        String[] split1 = s.split(",");
        System.out.println(split1.length);
        for (int i=0;i<split1.length;i++){
            System.out.println(split1[i]);
        }
    }
    @Test
    public void test3() throws IOException {
        String str="1、2#楼-采暖：";//空格能拆出来，但并没有空格
        // 2、原报税金金额为77.95元，审后税金金额为75.77元，审减金额2.18元。没有也为1
        String[] split = str.split("：");
        System.out.println(split.length);
    }


    public static void main(String[] args) throws IOException {
        File file = new File("D://proj.txt");
        InputStreamReader inStream = new InputStreamReader(new FileInputStream(file), "GBK");
        BufferedReader br = new BufferedReader(inStream);
        String str;
        int c=0;
        while ((str = br.readLine()) != null) {
            //System.out.println(str);
            String[] split = str.split("：");
            if (split.length <= 1) {
                //单独拆分
                String s=str.replaceAll("[\\u4e00-\\u9fa5_a-zA-Z/，；。]+", ",");
                //System.out.println(s);
                String[] split1 = s.split(",");
                if (split1.length!=4){
                System.err.println("-----------该行被舍弃"+str+split1.length);
                    continue;}else {
                    int conut = split1.length - 1;
                    double[] doubles = new double[conut];
                    for (int i = 1; i < split1.length; i++) {
                        //System.out.println( split1[i-1]);
                        doubles[i - 1] = Double.parseDouble(split1[i]);
                      //  System.out.println( doubles[i-1] );
                    }
                    double num1 = doubles[0]-doubles[1];
                    double f1 = twoPoint(num1);
                    if (f1==doubles[2]){
                    }else {
                        System.err.println("审减金额核算错误"+f1+" : "+doubles[2]);
                    }
                    continue;
                }


            }
            ;
            String title = split[0];
            String content = split[1];
            c++;
            boolean deal = deal(content);
            if (deal==false){
                System.out.println(split[0]);
                System.out.println("------------------------");
            }
        }
        System.out.println("处理的消息树"+c);
    }

    private static boolean deal(String str) {
        String s = str.replaceAll("[\\u4e00-\\u9fa5_a-zA-Z/，；]+", ",");
        //System.out.println(s);
        String[] split = s.split(",");
      /*  for (int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }*/
        int conut = split.length - 1;
       // System.out.println("count"+conut);
        if (conut == 9) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
                //System.out.println( doubles[i-1] );
            }
            double num1 = doubles[0] * doubles[1] / doubles[2];
            double f1 = twoPoint(num1);
            // System.out.println(f1);
            if (f1==doubles[3]){
            }else {
                System.err.println("核算错误"+f1+" : "+doubles[3]);
                return false;
            }
            double num2=doubles[4] * doubles[5] / doubles[6];
            double f2 = twoPoint(num2);
            if (f2==doubles[7]){
            }else {
                System.err.println("核算错误"+f2+" : "+doubles[7]);
                return false;
            }
            if (twoPoint(f1-f2)==doubles[8]){}else {
                double f3=twoPoint(f1-f2);
                System.err.println("核算总价错误"+f3+" : "+doubles[8]);
                return false;
            }
        }


        if (conut == 7) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
                //System.out.println( doubles[i-1] );
            }
            double num1 = doubles[0] * doubles[1];
            double f1 = twoPoint(num1);
            // System.out.println(f1);
            if (f1==doubles[2]){
            }else {
                System.err.println("核算错误"+f1+" : "+doubles[2]);
                return false;
            }
            double num2=doubles[3] * doubles[4];
            double f2 = twoPoint(num2);
              if (f2==doubles[5]){
            }else {
                System.err.println("核算错误"+f2+" : "+doubles[5]);
                return false;
            }
            if (twoPoint(f1-f2)==doubles[6]){}else {
                double v = twoPoint(f1 - f2);
                System.err.println("核算总价错误"+v+" : "+doubles[6]);
                return false;
            }
        }

        if (conut == 3) {
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
                //System.out.println( doubles[i-1] );
            }
            double num1 = doubles[0];
            double f1 = twoPoint(num1);

            double num2=doubles[1];
            double f2 = twoPoint(num2);

            if (twoPoint(f1-f2)==doubles[2]){}else {
                double v = twoPoint(f1 - f2);
                System.err.println("核算总价错误"+v+" : "+doubles[2]);
                return false;
            }
        }

        if (conut == 11) {
            //ystem.out.println("11de");
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
                //System.out.println( doubles[i-1] );
            }
            double num1 = doubles[0] * doubles[2];
            double f1 = twoPoint(num1);
            // System.out.println(f1);
            if (f1==doubles[4]){
            }else {
                System.err.println("核算错误"+f1+" : "+doubles[4]);

                return false;
            }
            double num2=doubles[5] * doubles[7];
            double f2 = twoPoint(num2);
            if (f2==doubles[9]){
            }else {
                System.err.println("核算错误"+f2+" : "+doubles[9]);
                return false;
            }
            if (twoPoint(f1-f2)==doubles[10]){}else {
                double f3 = twoPoint(f1-f2);
                System.err.println("核算总价错误"+f3+" : "+doubles[10]);
                return false;
            }
        }


        if (conut == 13) {
            //System.out.println("13de");
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
                //System.out.println( doubles[i-1] );
            }
            double num1 = doubles[0] * doubles[2] / doubles[3];
            double f1 = twoPoint(num1);
            // System.out.println(f1);
            if (f1==doubles[5]){
            }else {
                System.err.println("核算错误"+f1+doubles[5]);
                return false;
            }
            double num2=doubles[6] * doubles[8] / doubles[9];
            double f2 = twoPoint(num2);
            if (f2==doubles[11]){
            }else {
                System.err.println("核算错误"+f2+" : "+doubles[11]);
                return false;
            }
            if (twoPoint(f1-f2)==doubles[12]){}else {

                System.err.println("核算总价错误"+doubles[12]);
                return false;
            }
        }

        if (conut == 4) {
            //System.out.println("4de");
            double[] doubles = new double[conut];
            for (int i = 1; i < split.length; i++) {
                doubles[i - 1] = Double.parseDouble(split[i]);
                //System.out.println( doubles[i-1] );
            }
            double num1 = doubles[0]-doubles[1];
            double f1 = twoPoint(num1);
            // System.out.println(f1);
            if (f1==doubles[2]){
            }else {
                System.err.println("核算错误"+f1+doubles[2]);
                return false;
            }
            double num2=doubles[2] / doubles[0];
            double f2 = twoPoint(num2);
            double f3=twoPoint(doubles[3]*0.01);
            if (f2==f3){
            }else {
                System.err.println("审减率错误"+f2+f3);
                return false;
            }

        }

        return true;
    }


    public static double twoPoint(Double num){
        BigDecimal b = new BigDecimal(num.toString());
        double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return f1;
    }
}
