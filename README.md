# 创建型
单例
工厂
建造器
原型
# 行为型
观察者模式、模板模式、策略模式、职责链模式、迭代器模式、状态模式、访问者模式、备忘录模式、命令模式、解释器模式、中介模式
# 结构型
代理
桥接
装饰器
适配器
门面
组合
享元

1.先了解设计模式的通用理念
即设计原则
SOLID、KISS、YAGNI、DRY、LOD

SOLID 原则并非单纯的 1 个原则，而是由 5 个设计原则组成的，它们分别是： 单一职责原则、开闭原则、里式替换原则、接口隔离原则和依赖反转原则，依次对应 SOLID 中的 S、O、L、I、D 这 5 个英文字母



2.具体到每个设计模式
明确它的目的 实现方式 应用场景



## 观察者模式
定义：定义对象之间的一对多依赖关系，当一个对象改变状态时，会通知其所有依赖关系。

如何实现：subject主题 维护一个订阅者的容器，并管理观察者的订阅和取消订阅和通知消息给订阅者
observer观察者 接收subject发送过来的消息，处理具体的业务逻辑


拓展：spring事件机制和EventBus事件总线
上述是通过同步的方式来实现，可以使用线程来异步实现

使用ApplicationEvent 基础
1.创建业务相关的 MyEvent，需要继承 ApplicationEvent，重写有参构造函数
2.定义不同的监听器（观察者）比如 ListenerOne 实现 ApplicationListener<MyEvent> 接口，重写 onApplicationEvent 方法
3.通过 ApplicationContext#publishEvent 方法发布具体事件

