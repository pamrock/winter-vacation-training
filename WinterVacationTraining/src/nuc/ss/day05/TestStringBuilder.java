package nuc.ss.day05;

/**
 * @ClassName TestStringBuilder
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/26 17:31
 **/
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Test");
        System.out.println(builder);

        System.out.println(builder.append("builder"));//可以拼接几乎所有能看到的东西,并返回自身

        System.out.println(builder.insert(5, "String"));//在指定位置追加字符串
        System.out.println(builder.append(new Text()));//拼接啥玩意都能放进去

        System.out.println(builder.charAt(2));//获取指定字符
        builder.setCharAt(2,'神');//设置某个字符
        System.out.println(builder);
        builder.deleteCharAt(2);//删除指定的字符
        System.out.println(builder);

        System.out.println(builder.replace(20,30,"飘柔就是你油"));//替换指定位置的字符串
        System.out.println(builder.delete(20,30));//删除这个区间里的字符串

        System.out.println(builder.reverse());//倒转串

        String string = builder.toString();//StringBuilder转String
        System.out.println(string);
        StringBuilder builder1 = new StringBuilder(string);//String转StringBuilder
        System.out.println(builder1);


    }
}
class Text{
    StringBuilder builder = new StringBuilder("Test");
    Text(){

    }
}

