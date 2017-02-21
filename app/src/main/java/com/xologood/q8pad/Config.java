package com.xologood.q8pad;

/**
 * Created by wei on 2016/12/22.
 */
public class Config {
    public static final String systemUrl = "http://120.25.102.209:8000";
    public static final String userUrl = "http://120.25.102.209:8002";
    public static final String mustPassParameter = "&recorderBase=2&versionBase=4.0.3.7&projectNameBase=千里码Q8云战略合作平台-PDA&sysKeyBase=150623155902966stlt";
    public static final String COMKEY = "001";   //机构唯一标识
    public static final String COMNAME = "002";   //机构名称
    public static final String SYSKEY= "003";
    public static final String ISUSE = "004";//是否启用
    public static final String RECORDERBASE = "005"; //访问人
    public static final String SYSKEYBASE = "006"; //系统key

    public static final String USERID = "100";     //用户id
    public static final String LOGINNAME = "101";  //登陆名
    public static final String PASSWORD = "102";    //登陆密码
    public static final String USERNAME = "103" ;    //昵称（审核人）



    public static final int REQUESTOK = 601;
    public static final String ISCHECK = "602";
    public static final String ISCONTINOUS = "603"; //是否连续扫描


    /** 获取屏幕尺寸 */
    public final static class SCREEN {
        public static int Width = 0;
        public static int Height = 0;
    }

    /**数据存储 参数配置 */
    public final static class SHARED_PREFERENCES {
        public final static String USER = "user";

        public final static String COOKIE = "cookie";

        public final static String CONFIG = "config";

        public final static String ADDRESS = "address";

        public final static String DEFAULTUSER = "defaultuser";
    }
}
