package org.jeecg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhujg
 * @date 2023年01月03日 18:55
 */
public class PatternTest {
    public static void main(String[] args) {
        //需要验证的手机号
//        String tel = "18631721765";
        String tel = "16602080720";
        //正则表达式
//        String reg = "^[1]+[3,8]+\\d{9}$";
        String reg = "^1[3|4|5|6|7|8|9][0-9]\\d{8}$";
        //编译正则表达式
        Pattern pattern = Pattern.compile(reg);

        Matcher matcher = pattern.matcher(tel);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);

    }
}
