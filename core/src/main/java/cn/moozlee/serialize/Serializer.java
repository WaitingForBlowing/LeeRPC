package cn.moozlee.serialize;

import cn.moozlee.extension.SPI;

@SPI
public interface Serializer {
    byte[] serialize(Object obj);
    <T> T deserialize(byte[] bytes, Class<T> clazz);
}
