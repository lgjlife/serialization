# 序列化和反序列化实现

* [JDK方式]()
* [Fastjson方式]()
* [Protostuff方式]()

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