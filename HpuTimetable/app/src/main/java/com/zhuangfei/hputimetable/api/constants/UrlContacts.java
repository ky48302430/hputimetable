package com.zhuangfei.hputimetable.api.constants;

/**
 * Created by Liu ZhuangFei on 2018/2/11.
 */

public class UrlContacts {

    public final static String URL_BASE="http://www.liuzhuangfei.com/timetable/";

    //保存数据
    public final static String URL_PUT_VALUE="index.php?c=Timetable&a=putValue";

    //获取数据
    public final static String URL_GET_VALUE="index.php?c=Timetable&a=getValue";

    //根据专业获取课程
    public final static String URL_GET_BY_MAJOR="index.php?c=Timetable&a=getByMajor";

    //根据专业名称模糊搜索
    public final static String URL_FIND_MAJOR="index.php?c=Timetable&a=findMajor";

    //通过课程名搜索
    public final static String URL_GET_BY_NAME="index.php?c=Timetable&a=getByName";

    public final static String URL_ISSUES="https://github.com/zfman/HpuTimetableClient/issues";

}
