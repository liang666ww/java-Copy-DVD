import java.io.*;

public class 字节流复制视频 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
       //method1();//25593
        //method2();//37
        //method3();//53
        method4();//32
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\2022暑假后端学习所用\\字节流复制视频.avi");
        FileOutputStream fos = new FileOutputStream("字节流复制视频1.avi");
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
    public static void method2() throws IOException{
        byte[] bys = new byte[1024];
        FileInputStream fis = new FileInputStream("E:\\2022暑假后端学习所用\\字节流复制视频.avi");
        FileOutputStream fos = new FileOutputStream("字节流复制视频2.avi");
        int len ;
        while ((len= fis.read(bys))!=-1){
            fos.write(bys);
        }
        fis.close();
        fos.close();
    }
    public static void method3() throws IOException{
        FileInputStream fis = new FileInputStream("E:\\2022暑假后端学习所用\\字节流复制视频.avi");
        FileOutputStream fos = new FileOutputStream("字节流复制视频3.avi");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int by;
        while ((by = bis.read())!=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();
    }
    public static void method4() throws IOException{
        FileInputStream fis = new FileInputStream("E:\\2022暑假后端学习所用\\字节流复制视频.avi");
        FileOutputStream fos = new FileOutputStream("字节流复制视频4.avi");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){//括号里有bys
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }

}
