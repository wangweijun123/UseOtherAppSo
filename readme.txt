1 如何copy别的app中的so直接使用
反编译后提取so，找到使用so的 java class,定义一个
一模一样的java class

2 如何防止别人copy自己的so

在so中验证包名与签名信息(c/c++ 通过jni获取(api类似java中的反射))

3 如何正常使用第三方开源的c/c++项目
1 导入源码(xxx.c/c++  xxx.h), 配置
2 直接使用编译好的so