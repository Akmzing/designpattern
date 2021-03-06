# designpattern
## 设计模式
### 1. 六大设计原则 ( Principle )
* 单一指责原则（Single Responsibility Principle，SRP）
* 里氏替换原则（Liskov Substitution Principle LSP，LSP）  
 1. 子类必须完全实现父类的方法  
 2. 子类可以有自己的个性  
 3. 覆盖或实现父类的方法时输入参数可以被放大  
 4. 覆盖或实现父类的方法时输出结果可以被缩小 
* 依赖倒置原则（Dependence Inversion Principle，DIP）  
 1. 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依
赖关系是通过接口或抽象类产生的  
 2. 接口或抽象类不依赖于实现类  
 3. 实现类依赖接口或抽象类  
 ＊依赖的三种写法  
  1.构造函数传递依赖对象  
  2.Setter方法传递依赖对象  
  3.接口声明依赖对象  
* 接口隔离原则（Interface Segregation Principle）  
 1. 客户端不依赖它不需要的接口  
 2. 类间的依赖关系应该建立在最小的接口上  
 ＊接口的纯洁性  
   1.接口要尽量小  
   2.接口要高内聚  
   3.定制服务  
   4.接口设计是有限度的  
* 迪米特法原则（Law of Demeter，LoD）  
   一个类应该对自己需要耦合或调用的类知道最少  
* 开闭法则（Open Closed Principle）  
   软件实体应该对扩展开放，对修改关闭

### 2. 设计模式分类
* 创建模式：  
 1. 工厂模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类  
 2. 抽象工厂模式：为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类  
 3. 单例模式：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 4. 亨元模式：使用共享对象可有效地支持大量的细粒度的对象
 5. 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
  
* 结构模式  
 1. 代理模式：为其他对象提供一种代理以控制这个对象的访问  
 2. 装饰模式：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式相比生成子类更为灵活  
 3. 适配器模式：将一个类的接口换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作  
 4. 组合设计模式：将对象组合成树形结构以表示'部分-整体'的层次结构，使得用户对单个对象和组合对象的使用具有一致性  
优点：高层模块调用简单，结点自由增加  
缺点：直接使用实现类，与依赖倒置原则冲突

* 行为模式  
 1. 观察者模式：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新  
 2. 策略模式：定义一组算法，将每个算法都封装起来，并且使得它们之间可以互换
 3. 命令模式：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能
 
## 持续更新
