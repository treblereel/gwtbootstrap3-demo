package org.treblereel.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
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

import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import org.gwtbootstrap3.client.ui.Pre;
import org.treblereel.ui.constants.Styles;

/**
 * @author Sven Jacobs
 */
public class PrettyPre extends Pre {

    public PrettyPre() {
        addStyleName(Styles.PRETTYPRINT);
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        // When the widget loads, force the styling of pretty print
        prettyPrint();
    }

    private void prettyPrint() {
        ((Fn) Js.uncheckedCast(Js.global().get("prettyPrint"))).invoke();
    }

    @JsFunction
    @FunctionalInterface
    private interface Fn {
        void invoke();
    }
}
