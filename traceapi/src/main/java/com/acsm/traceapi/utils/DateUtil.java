package com.acsm.traceapi.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LiYu on 2018/4/13.
 */
public class DateUtil {

    /**
     * 根据模式格式化日期
     * @param pattern
     * @param date
     * @return
     */
    public static String formatDateByPattern(String pattern, Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }

    /**
     * 根据模式格式化日期
     * @param pattern
     * @param timestamp
     * @return
     */
    public static String formatDateByPattern(String pattern, Timestamp timestamp){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateStr = simpleDateFormat.format(new Date(timestamp.getTime()));
        return dateStr;
    }

    /**
     * 根据字符串转换日期格式
     * @param pattern
     * @param oldPattern
     * @param dateStr
     * @return
     * @throws ParseException
     */
    public static String formatDateStrByPattern(String pattern, String oldPattern, String dateStr) throws ParseException {
        Date date = new SimpleDateFormat(oldPattern).parse(dateStr);
        return new SimpleDateFormat(pattern).format(date);
    }

}
