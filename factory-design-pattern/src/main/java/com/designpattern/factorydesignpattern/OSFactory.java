package com.designpattern.factorydesignpattern;

import com.designpattern.factorydesignpattern.phone.Andriod;
import com.designpattern.factorydesignpattern.phone.IOS;
import com.designpattern.factorydesignpattern.phone.OS;
import com.designpattern.factorydesignpattern.phone.Windows;

public class OSFactory {
    public OS getInstance(String str)
    {
        if(str.equals("Open"))
        {
            return new Andriod();
        }
        else if(str.equals("closed"))
        {
            return new IOS();
        }
        else {
            return new Windows();
        }
    }

}
