# designpattern
## 设计模式
### 1. 六大设计原则 ( Principle )
* 单一指责原则（Single Responsibility Principle，SRP）
* 里氏替换原则（Liskov Substitution Principle LSP，LSP）  
1.子类必须完全实现父类的方法  2.子类可以有自己的个性  3.覆盖或实现父类的方法时输入参数可以被放大  4.覆盖或实现父类的方法时输出结果可以被缩小 
* 依赖倒置原则（Dependence Inversion Principle，DIP）  1.模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的  2.接口或抽象类不依赖于实现类  3.实现类依赖接口或抽象类   ＊依赖的三种写法    1.构造函数传递依赖对象    2.Setter方法传递依赖对象    3.接口声明依赖对象  * 接口隔离原则（Interface Segregation Principle）  1.客户端不依赖它不需要的接口  2.类间的依赖关系应该建立在最小的接口上   ＊接口的纯洁性     1.接口要尽量小     2.接口要高内聚     3.定制服务     4.接口设计是有限度的  * 迪米特法原则（Law of Demeter，LoD）     一个类应该对自己需要耦合或调用的类知道最少  * 开闭法则（Open Closed Principle）     软件实体应该对扩展开放，对修改关闭
 
## 持续更新
