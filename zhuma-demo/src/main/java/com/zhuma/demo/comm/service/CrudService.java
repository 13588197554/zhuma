/*
 *
 *  * Copyright 2016 http://www.hswebframework.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.zhuma.demo.comm.service;

/**
 * @desc 通用服务类
 *
 * @author zhuamer
 * @since 10/18/2017 18:31 PM
 */
public interface CrudService<E, PK> extends
		InsertService<E, PK>,
        UpdateService<E,PK>,
        DeleteService<PK>,
		SelectService<E, PK> {
}
