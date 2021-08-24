package com.ariverh.creational.abstractFactory;

import com.ariverh.creational.abstractFactory.produce.*;
import com.ariverh.creational.abstractFactory.produce.impl.HuaWeiPad;
import com.ariverh.creational.abstractFactory.produce.impl.IPad;
import com.ariverh.creational.abstractFactory.produce.impl.XIaoMiPad;

public class PadFactory extends AbstractFactory{
    @Override
    public Phone getPhone(String type) {
        return null;
    }

    @Override
    public Pad getPad(String type) {
        if (type.equals("xiaomi")){
            return new XIaoMiPad();
        }else if (type.equals("apple")){
            return new IPad();
        }else if (type.equals("huawei")){
            return new HuaWeiPad();
        }else {
            return null;
        }
    }
}
