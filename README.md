# mumu-Neo4J 图数据库
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/mumucache/mumu-riak/blob/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/com.weibo/motan.svg?label=Maven%20Central)](https://github.com/mumustorage/mumu-Neo4J)
[![Build Status](https://travis-ci.org/mumustorage/mumu-Neo4J.svg?branch=master)](https://travis-ci.org/mumustorage/mumu-Neo4J)
[![codecov](https://codecov.io/gh/mumustorage/mumu-Neo4J/branch/master/graph/badge.svg)](https://codecov.io/gh/mumustorage/mumu-Neo4J)
[![OpenTracing-1.0 Badge](https://img.shields.io/badge/OpenTracing--1.0-enabled-blue.svg)](http://opentracing.io)  
***Neo4j 是一个高性能的 NoSQL 图形数据库。Neo4j 使用图（graph）相关的概念来描述数据模型，把数据保存为图中的节点以及节点之间的关系。很多应用中数据之间的关系，可以很直接地使用图中节点和关系 的概念来建模。对于这样的应用，使用   Neo4j 来存储数据会非常的自然，要优于使用关系数据库***

## Neo4j简介
Neo4j 是一个高性能的 NoSQL 图形数据库。Neo4j 使用图（graph）相关的概念来描述数据模型，把数据保存为图中的节点以及节点之间的关系。很多应用中数据之间的关系，可以很直接地使用图中节点和关系 的概念来建模。对于这样的应用，使用 Neo4j 来存储数据会非常的自然，要优于使用关系数据库。本文对 Neo4j 进行了深入的介绍，并结合具体的实例来进行详细的说明，可以让您对 Neo4j 有深入的了解，从而可以在应用开发中恰当地选择 Neo4j 来作为存储方式。Neo4j是一个高性能的,NOSQL图形数据库，它将结构化数据存储在网络上而不是表中。它是一个嵌入式的、基于磁盘的、具备完全的事务特性的Java持久化引擎，但是它将结构化数据存储在网络(从数学角度叫做图)上而不是表中。Neo4j也可以被看作是一个高性能的图引擎，该引擎具有成熟数据库的所有特性。程序员工作在一个面向对象的、灵活的网络结构下而不是严格、静态的表中——但是他们可以享受到具备完全的事务特性、企业级的数据库的所有好处。Neo4j因其嵌入式、高性能、轻量级等优势，越来越受到关注.

你可以把Neo看作是一个高性能的图引擎，该引擎具有成熟和健壮的数据库的所有特性。程序员工作在一个面向对象的、灵活的网络结构下而不是严格、静态的表中——但是他们可以享受到具备完全的事务特性、企业级的数据库的所有好处。 [1]
Neo是一个网络——面向网络的数据库——也就是说，它是一个嵌入式的、基于磁盘的、具备完全的事务特性的Java持久化引擎，但是它将结构化数据存储在网络上而不是表中。网络（从数学角度叫做图）是一个灵活的数据结构，可以应用更加敏捷和快速的开发模式。

## Neo4J 架构  
![](https://www.2cto.com/uploadfile/2015/1207/20151207034325408.png)

## Neo4j特点
- 对象关系的不匹配使得把面向对象的“圆的对象”挤到面向关系的“方的表”中是那么的困难和费劲，而这一切是可以避免的。
- 关系模型静态、刚性、不灵活的本质使得改变schemas以满足不断变化的业务需求是非常困难的。由于同样的原因，当开发小组想应用敏捷软件开发时，数据库经常拖后腿。
- 关系模型很不适合表达半结构化的数据——而业界的分析家和研究者都认为半结构化数据是信息管理中的下一个重头戏。
- 网络是一种非常高效的数据存储结构。人脑是一个巨大的网络，万维网也同样构造成网状，这些都不是巧合。关系模型可以表达面向网络的数据，但是在遍历网络并抽取信息的能力上关系模型是非常弱的。

    虽然Neo是一个比较新的开源项目，但它已经在具有1亿多个节点、关系和属性的产品中得到了应用，并且能满足企业的健壮性和性能的需求：
完全支持JTA和JTS、2PC分布式ACID事务、可配置的隔离级别和大规模、可测试的事务恢复。这些不仅仅是口头上的承诺：Neo已经应用在高请求的24/7环境下超过3年了。它是成熟、健壮的，完全达到了部署的门槛。  
![](http://pic.yupoo.com/ljhero/BXYqXA4M/oyN6W.png)    

## 相关阅读  
[Neo4J官网文档](https://neo4j.com/)  
[Neo4J源码](https://github.com/neo4j/neo4j)  
[图形数据库 Neo4j 开发](http://blog.csdn.net/bluejoe2000/article/details/72978115)

## 联系方式
**以上观点纯属个人看法，如有不同，欢迎指正。  
email:<babymm@aliyun.com>  
github:[https://github.com/babymm](https://github.com/babymm)**