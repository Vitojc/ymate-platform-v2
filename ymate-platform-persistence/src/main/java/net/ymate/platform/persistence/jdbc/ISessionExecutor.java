/*
 * Copyright 2007-2107 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.persistence.jdbc;

/**
 * 会话执行器接口
 *
 * @author 刘镇 (suninformation@163.com) on 2014年5月19日 上午12:36:25
 * @version 1.0
 */
public interface ISessionExecutor<T> {

    /**
     * @param session 会话对象
     * @return 执行会话处理过程，返回执行结果
     * @throws Exception
     */
    public T execute(ISession session) throws Exception;
}
