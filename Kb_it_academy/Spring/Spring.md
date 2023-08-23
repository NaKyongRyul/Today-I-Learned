### Framework

설계도이자 다양한 라이브러리 + 다양한 디자인패턴(가이드라인)의 집합 

개발자는 공통의 기능은 그대로 사용하고 좀더 비즈니스로직에 집중할 수 있도록 하는 반제품 

사용이유 - 재사용성, 확작성, 생산성이 높다.

종류 - Spring



### 라이브러리와 프레임워크 차이

실행흐름의 주체를 누가 가지고 있느냐?

    라이브러리 - 개발자가 실행흐름의 주체로 라이브러리가 필요할때 호출

    프레임워크 - 프레임워크 자체가 실행흐름의 주체가 되어 개발자가 흐름을 변경할 수 없다.



### Spring 특징

+ 가볍다 - 경량의 컨테이너(과거의 무거운 EJB 겨냥해서 만든 프레임워크)

+ SpringContainer = DI Container = IoC Container
  
  + 객체를 생성하고 생성된 객체의 생명주기를 관리한다. 필요한 객체를 적절하게 주입햔댜.(DI)
  
  + 원래 자바는 개발자가 코드안에서 직접 객체를 관리했다면 스프링에서는 외부 컨테이너가 객체를 관리하는 것으로 이것을 Inversion of Control. 이는 제어의 역행 

+ AOP(Aspect Oriented Programming) - 관점지향 프로그래밍 
  
  + OOP 언어를 더욱더 OOP답게 만드는 기술 

+ DI(Dependency Injection)
  
  + 객체와 객체간의 결합도를 더욱더 느슨하게하는 기술 
  
  + 생성자 주입 (value vs ref)
  
  + setter 주입 (value vs ref)

+ 필요한 기술을 Abstract로 기반코드를 제공 



### Spring Container 종류

+ BeanFactory

+ ApplicationContext

+ WebApplicationContext

   

 컨테이너를 사용하기 위해서 어떻게 bean을 생성하고 주입해야하는지 알려주기 위해서 

1) Configration Meta-data인 xml 문서

2) bena scan의 @Annotation



### lombok

+ 라이브러리

+ 자바의 객체(VO = DTO)를 만들 때 반복적으로 만들게 되는 생성자. setter, getter, toString

+ 개발자는 필요한 속성(property)만 작성하고 @Xxx를 선언만 하면 된다. 



xml 문서에서 

<bean: 객체생성

<constructor-arg: 생성자 주입

<property: setter 주입

<context:~~: 객체를 bean으로 등록해주는 태그(여러개의 bean들을 모아서 한번에 생성 + 주입) 



@Autowired - 주입(필수속성) 



### AOP(Aspect Oriented Programming)

+ 관점지향 프로그래밍 - 코드를 관점에 따를 분리를 하면 핵심기능, 공통기능분리



proxy 서버는 인터페이스 기반으로 작성해야한다.



### Annotation 종류

#### 생성관련

- @Component

- @Service

- @Respositroy

- @Controller



#### 주입관련

- @Autowired

- @Qulifier

- @Value

- @Inject




