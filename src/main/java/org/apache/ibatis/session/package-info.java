/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Base package. Contains the SqlSession.
 *
 * 核心：
 *  @see org.apache.ibatis.session.Configuration mybatis配置中心
 *  @see org.apache.ibatis.session.Configuration#newExecutor(org.apache.ibatis.transaction.Transaction, org.apache.ibatis.session.ExecutorType)
 *
 *  @see org.apache.ibatis.session.SqlSessionManager
 *  @see org.apache.ibatis.session.SqlSessionFactoryBuilder 创建工厂
 *  @see org.apache.ibatis.session.SqlSessionFactory#getConfiguration()  session工厂
 *  @see org.apache.ibatis.session.SqlSession#getConfiguration()  session 每个session持有一个Excutor
 *
 *  @see org.apache.ibatis.session.defaults.DefaultSqlSession 默认sqlSession实现
 *  数据库操作实际三个方法
 *  @see org.apache.ibatis.session.defaults.DefaultSqlSession#selectList(java.lang.String, java.lang.Object, org.apache.ibatis.session.RowBounds)
 *  @see org.apache.ibatis.session.defaults.DefaultSqlSession#select(java.lang.String, java.lang.Object, org.apache.ibatis.session.RowBounds, org.apache.ibatis.session.ResultHandler)
 *  @see org.apache.ibatis.session.defaults.DefaultSqlSession#update(java.lang.String, java.lang.Object)
 *
 *  @see org.apache.ibatis.executor.Executor 执行器接口，定义了数据库操作具体方法，参照实现
 */
package org.apache.ibatis.session;
