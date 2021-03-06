/*
 * Copyright 2014 the original author or authors.
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

package com.dynatrace.cf.servicebroker.catalog;

import com.dynatrace.cf.servicebroker.AbstractSerializationTest;

import java.util.Map;

import static org.junit.Assert.assertNull;

public final class CatalogTest extends AbstractSerializationTest<Catalog> {

    @Override
    protected void assertContents(Map m) {
        assertNull(m.get("services"));
    }

    @Override
    protected Catalog getInstance() {
        return new Catalog();
    }

}
