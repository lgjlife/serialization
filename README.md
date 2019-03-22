# 序列化和反序列化实现

* [JDK方式](https://github.com/lgjlife/serialization/blob/master/src%2Fmain%2Fjava%2Fcom%2Futils%2Fserialization%2FJdkSerializeUtil.java)
* [Fastjson方式](https://github.com/lgjlife/serialization/blob/master/src%2Fmain%2Fjava%2Fcom%2Futils%2Fserialization%2FFastjsonSerializeUtil.java)
* [Protostuff方式](https://github.com/lgjlife/serialization/blob/master/src%2Fmain%2Fjava%2Fcom%2Futils%2Fserialization%2FProtostuffSerializeUtil.java)

# 使用事例

* 定义pojo
如果使用JDK方式，还需要实现Serializable接口
```java

@Data
@Builder
public class User implements Serializable {

    private  String  name;
    private  int age;
}

```

```java
User user = User.builder().name("用户"+i).age(i).build();
private AbstractSerialize  serialize = new ProtostuffSerializeUtil();
byte[] body = serialize.serialize(msg);
User user1 = serialize.deserialize(body,User.class);



```