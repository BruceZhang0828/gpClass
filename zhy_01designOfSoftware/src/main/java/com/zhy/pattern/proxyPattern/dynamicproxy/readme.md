## 代理模式

### 静态代理

### 动态代理

    JDK Proxy动态生成实现
       1.拿到被代理对象的引用,并且获取到它的所有接口,反射获取。
       2.JDK Proxy类重新生成一个新类，同时新的类要实现被代理类所有实现的所有接口。
       3.动态生成Java代码，把新业务逻辑方法由一定的逻辑代码去调用（在代码中体现）。
       4.编译生成新的java代码.class。
       5.在重新加载到JVM中运行。

    Cglib Proxy动态生成实现:
        1.实现CGLib相关接口:MethodInterceptor;
        2.在intercept方法中,进行增强操作
        3.CGLib代理不需要进实现接口,通过动态继承目标实现的动态代理.

        详细整理:
            代理类会互获取所有父类继承来的方法,并且会有MethodProxy与之对应.
            代理对象执行findLove方法->调用拦截器->methodProxy.invokSuper->CGLIB$findLove$0->被代理对象findLove方法。
            重点理解 MethodProxy类中 invokSuper->init方法->生成两个FastClass:一个是代理类的FastClass,
            一个是被代理类FastClass;这个 Class 会为代理类或被代理类的方法分配一个 index(int 类型)。
            这个 index 当做一个入参，FastClass就可以直接定位要调用的方法直接进行调用，这样省去了反射调用，
            所以调用效率比 JDK动态代理通过反射调用高。

    Jdk与Cglib的对比:
        1.Jdk实现了被代理对象的接口,Cglib是继承了被代理对象。
        2.Jdk和Cglib都是运行期生成字节码，Jdk是直接写Class字节码，Cglib使用ASM框架写Class字节码，
        Cglib代理实现更复杂，生成代理类比Jdk效率低。
        3.Jdk调用代理,是通过反射机制调用,Cglib是通过FastClass机制直接调用方法,Cglib执行效率更高。

