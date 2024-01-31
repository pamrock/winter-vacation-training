package nuc.ss.day05;

/**
 * @ClassName TestString
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/26 10:16
 **/
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.UUID;

public class TestString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String test="testString";//存放在常量区
        String test1="testString";//这两个的地址是一样的,并没有重新生成一个字符串
        //下面就会重新生成
        String test2= new String("testString");//放在堆区
        String test3= new String("testString");//这两个是两个单独的字符串

        System.out.println(test.length());//返回字符串长度,不带结束符
        System.out.println(test.isEmpty());//判断字符串是否为空//false
        System.out.println(test.startsWith("te"));//判断字符串以XX开头
        System.out.println(test.endsWith("ing"));//判断字符串以XX结尾
        System.out.println(test.toUpperCase());//将字符串英文全部改为大写并返回 ,不改变原有的值
        System.out.println(test.toLowerCase());//将字符串英文全部改为小写并返回

        System.out.println(test.charAt(1));//获得字符串的第1个字符e;java的数是从0开始的

        System.out.println(test.indexOf("S"));//查找字符串第一次出现的位置
        System.out.println(test.indexOf("S",2));//从指定位置查找字符串第一次出现的位置
        System.out.println(test.lastIndexOf("S"));//从后往前查找字符串第一次出现的位置

        System.out.println(test.substring(2));//从指定位置截取字符串
        System.out.println(test.substring(2,5));//截取中间某处的字符串

        String id=UUID.randomUUID().toString();//生成随机ID
        String file = "1.2.3.4.jpg";
        System.out.println(id+file.substring(file.lastIndexOf('.')));//截取并生成新的文件名

        System.out.println("---------------字符串转化方法------------------------");
        String test4 = "zhong国";
        byte[] bytes = test4.getBytes();//将字符串转化为字节
        //将字符串转化为字节后再转换字符编码,各平台支持的中文编码可能不一样,所以要进行转换
        System.out.println(new String(bytes,"GBK"));
        System.out.println(new String(test4.getBytes(),"UTF_16"));//给指定字符串重新编码

        System.out.println("---------------字符串拼接、替换、是否含有    ------------------------");
        String test5 = "a-b--cd-da";
        System.out.println(test5.contains("c"));//查看是否含有指定字符串
        System.out.println(test5.concat("cd"));//拼接字符串到结尾

        System.out.println(test5.replace('c','神'));//替换指定字符为指定字符

        String[] split = test5.split("-");//按指定字符串分割字符串
        System.out.println(Arrays.toString(split));

        String test6 = " a b v  ";
        System.out.println(test6.trim());//去字符串开头和结尾的空格




        System.out.println("---------------字符串比较 ------------------------");
        String test7="test";
        String test8="Test";
        System.out.println(test7.equals(test8));//判断字符串是否相等
        System.out.println(test7.compareTo(test8));//判断字符串是否相等,区分大小写
        System.out.println(test7.compareToIgnoreCase(test8));//判断字符串是否相等;不区分大小写
    }
}
