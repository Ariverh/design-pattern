package com.ariverh.creational.abstractFactory;

import com.ariverh.creational.abstractFactory.produce.*;
import com.ariverh.creational.abstractFactory.produce.impl.HuaWeiPhone;
import com.ariverh.creational.abstractFactory.produce.impl.IPhone;
import com.ariverh.creational.abstractFactory.produce.impl.XiaoMiPhone;

public class PhoneFactory extends AbstractFactory{
    @Override
    public Phone getPhone(String type) {
        if (type.equals("xiaomi")){
            return new XiaoMiPhone();
        }else if (type.equals("apple")){
            return new IPhone();
        }else if (type.equals("huawei")){
            return new HuaWeiPhone();
        }else {
            return null;
        }
    }

    @Override
    public Pad getPad(String type) {
        return null;
    }
}
