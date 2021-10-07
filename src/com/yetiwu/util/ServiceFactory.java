package com.yetiwu.util;

import com.yetiwu.service.StudentService;
import com.yetiwu.service.impl.StudentServiceImpl;

public class ServiceFactory {
    public static Object getService(Object service){
        return new TransactionInvocationHandler(service).getProxy();
    }
}
