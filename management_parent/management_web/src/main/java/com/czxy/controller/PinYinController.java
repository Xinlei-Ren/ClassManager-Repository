package com.czxy.controller;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.8.1 16:49
 */
public class PinYinController {

    public static String getPinYin(String str) throws BadHanyuPinyinOutputFormatCombination {
        char[] t1 = null;
        t1 = str.toCharArray();
        String[] t2 = new String[t1.length];
        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
        t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        t3.setVCharType(HanyuPinyinVCharType.WITH_V);
        String t4 = "";
        for (int i = 0; i < t1.length; i++) {
            if (java.lang.Character.toString(t1[i]).matches("[\\u4E00-\\u9FA5]+")) {
            }
            t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);
            t4 += t2[0];
        }
        return t4;
    }
}
