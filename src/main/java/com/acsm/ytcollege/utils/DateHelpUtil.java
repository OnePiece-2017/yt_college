package com.acsm.ytcollege.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:56 2017/12/18
 */
public class DateHelpUtil {

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String DEFAULT_DATE_TIME_FORMATE = "yyyy-MM-dd HH:mm:ss";

    /**
     * yyyy-MM-dd
     */
    public static final String DEFAULT_DATE_FORMATE = "yyyy-MM-dd";

    /**
     * yyyy年MM月dd日
     */
    public static final String DEFAULT_CN_DATE_FORMATE = "yyyy年MM月dd日";

    /**
     * yyyy-MM
     */
    public static final String DEFAULT_DATE_YM_FORMATE = "yyyy-MM";

    /**
     * yyyy年MM月
     */
    public static final String DEFAULT_CN_DATE_YM_FORMATE = "yyyy年MM月";

    /**
     * yyyy-ww
     */
    public static final String DEFAULT_DATE_YW_FORMATE = "yyyy-ww";

    /**
     * yyyy年第ww周
     */
    public static final String DEFAULT_CN_DATE_YW_FORMATE = "yyyy年第ww周";

    /**
     * yyyy
     */
    public static final String DEFAULT_DATE_Y_FORMATE = "yyyy";

    /**
     * yyyy年
     */
    public static final String DEFAULT_CN_DATE_Y_FORMATE = "yyyy年";

    /**
     * yyyy-01-01
     */
    public static final String DEFAULT_DATE_Y0101_FORMATE = "yyyy-01-01";

    /**
     * yyyy-MM-dd 00:00:00
     */
    public static final String DEFAULT_DATE_STAR_FORMATE = "yyyy-MM-dd 00:00:00";

    /**
     * yyyy-MM-dd 23:59:59
     */
    public static final String DEFAULT_DATE_END_FORMATE = "yyyy-MM-dd 23:59:59";

    /**
     * yyyy-MM-dd HH:mm
     */
    public static final String DEFAULT_DATE_HM_FORMATE = "yyyy-MM-dd HH:mm";

    /**
     * yyyy-MM-dd HH:00:00
     */
    public static final String DEFAULT_DATE_HM0_FORMATE = "yyyy-MM-dd HH:mm:00";

    /**
     * yyyy-MM-DD
     */
    public static final String DEFAULT_DATE_MD_FORMATE = "yyyy-MM-DD";

    /**
     * yyyyMMdd
     */
    public static final String DEFAULT_DATE_QD_FORMATE = "yyyyMMdd";

    /**
     * yyyyMMDDHHmmss
     */
    public static final String DEFAULT_DATE_MDS_FORMATE = "yyyyMMDDHHmmss";
    /**
     * yyyy/mm/dd
     */
    public static final String DEFAULT_DATE_YMD_OBLIQUE_FORMATE = "yyyy/MM/dd";

    /**
     * Date exchange String
     *
     * @param source
     *            日期
     * @param format
     *            格式
     * @return String
     */
    public static String dateTimeToStr(Date source, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(source);
    }

    /**
     * String exchange Date
     *
     * @param source
     *            日期
     * @param format
     *            格式
     * @return Date
     */
    public static Date strToDatetime(String source, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            return dateFormat.parse(source);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 日期格式替换 String exchange Date
     *
     * @param source
     *            日期
     * @param format
     *            格式
     * @return String
     */
    public static String dateTimeFormatReplace(String source, String format) {
        StringBuffer sb = new StringBuffer();

        if (DEFAULT_CN_DATE_FORMATE.equals(format)) {
            sb.append(source.substring(0, 4)).append("年").append(source.substring(5, 7)).append("月")
                    .append(source.subSequence(8, 10)).append("日");
        } else if (DEFAULT_CN_DATE_YW_FORMATE.equals(format)) {
            sb.append(source.substring(0, 4)).append("年第").append(source.substring(5, 7)).append("周");
        } else if (DEFAULT_CN_DATE_YM_FORMATE.equals(format)) {
            sb.append(source.substring(0, 4)).append("年").append(source.substring(5, 7)).append("月");
        } else if (DEFAULT_CN_DATE_Y_FORMATE.equals(format)) {
            sb.append(source.substring(0, 4)).append("年");
        }

        return sb.toString();
    }

    /**
     * 月份差值
     *
     * @param beginTime
     *            开始时间
     * @param endTime
     *            结束时间
     * @return int
     */
    public static int getMonthDiff(Date beginTime, Date endTime) {
        Calendar beginCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        beginCalendar.setTime(beginTime);
        endCalendar.setTime(endTime);

        int years = endCalendar.get(Calendar.YEAR) - beginCalendar.get(Calendar.YEAR);
        int months = endCalendar.get(Calendar.MONTH) - beginCalendar.get(Calendar.MONTH);

        return 12 * years + months;
    }

    /**
     * 日期差值
     *
     * @param beginTime
     *            开始时间
     * @param endTime
     *            结束时间
     * @return long
     */
    public static long getDateDiff(Date beginTime, Date endTime) {
        return (beginTime.getTime() - endTime.getTime()) / 1000 * 60 * 60 * 24;
    }
    /**
     * 获取未来 第 past 天的日期
     * @param past
     * @return
     */
    public static Date getFetureDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
        Date today = calendar.getTime();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String result = format.format(today);
        return today;
    }
}
