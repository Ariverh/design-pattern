package com.ariverh.creational.factory;

public class PhoneFactory {

    public Phone getPhone(String type){
        if (type.equals("xiaomi")){
            return new XiaoMiPhone();
        }else if(type.equals("huawei")){
            return new HuaWeiPhone();
        }else if (type.equals("apple")){
            return new ApplePhone();
        }else {
            return null;
        }
    }
    public static class PhoneType{
        public final static String XIAOMI = "xiaomi";
        public final static String HUAWEI = "huawei";
        public final static String APPLE = "apple";
    }
}
