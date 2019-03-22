package com.utils.serialization;

import com.alibaba.fastjson.JSON;

public class FastjsonSerializeUtil  extends  AbstractSerialize {

    private static  FastjsonSerializeUtil serializeUtil = new FastjsonSerializeUtil();

    public static FastjsonSerializeUtil getSingleton(){
        return  serializeUtil;
    }


    public <T> byte[] serialize(T obj) {
        String json = JSON.toJSONString(obj);
        byte[] data = json.getBytes();
        System.out.println("json = " + json);


        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        T obj = JSON.parseObject(new String(data),clazz);
        return obj;
    }
}
