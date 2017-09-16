package com.techempower.act.model;

/*-
 * #%L
 * TEB ActFramework Project
 * %%
 * Copyright (C) 2016 - 2017 ActFramework
 * %%
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
 * #L%
 */

import act.sys.Env;
import act.util.SimpleBean;
import com.techempower.act.AppEntry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "world")
@org.mongodb.morphia.annotations.Entity(value = "world", noClassnameStored = true)
@Env.RequireProfile(value = AppEntry.PROFILE_JSON_PLAINTEXT, except = true)
public class World implements SimpleBean {

    @Id
    @GeneratedValue
    @org.mongodb.morphia.annotations.Id
    public Integer id;

    @Column(name = "randomNumber")
    public Integer randomNumber;

    public World(Integer id, Integer randomNumber) {
        this.id = id;
        this.randomNumber = randomNumber;
    }

}
