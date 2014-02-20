/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.classlib.impl;

import org.teavm.javascript.JavascriptBuilderHost;
import org.teavm.javascript.JavascriptBuilderPlugin;

/**
 *
 * @author Alexey Andreev
 */
public class JCLPlugin implements JavascriptBuilderPlugin {
    @Override
    public void install(JavascriptBuilderHost host) {
        host.add(new EnumDependencySupport());
        host.add(new EnumTransformer());
    }
}
