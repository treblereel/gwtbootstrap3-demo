package org.treblereel.mvp.view.extras;

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

import java.util.ArrayList;
import java.util.List;

import org.gwtbootstrap3.extras.typeahead.client.base.CollectionDataset;
import org.gwtbootstrap3.extras.typeahead.client.base.Dataset;
import org.gwtbootstrap3.extras.typeahead.client.base.StringDataset;
import org.gwtbootstrap3.extras.typeahead.client.base.Suggestion;
import org.gwtbootstrap3.extras.typeahead.client.base.SuggestionCallback;
import org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Florian Kremser <florian.kremser@sage.com>
 */
public class TypeaheadView extends Composite {

    private final List<Person> persons = new ArrayList<>();
    private final String placeholder = "Enter a name";

    @UiField(provided = true)
    Typeahead<String> staticTypeahead;

    @UiField(provided = true)
    Typeahead<Person> asyncTypeahead;

    @UiField(provided = true)
    Typeahead<Person> highlightTypeahead;

    @UiField(provided = true)
    Typeahead<Person> templateTypeahead;

    public TypeaheadView() {
        persons.add(new Person("Bill Happernan", 50));
        persons.add(new Person("Bob Wondersteen", 38));
        persons.add(new Person("Bobak Longfield", 24));
        persons.add(new Person("Dawton Kernigham", 27));
        persons.add(new Person("Eumon Wonderburgh", 39));
        persons.add(new Person("Frank Dinkelstein", 66));
        persons.add(new Person("Gene Razelhaze", 42));
        persons.add(new Person("Gus Peppermint", 31));
        persons.add(new Person("Jebediah Franklin", 57));
        persons.add(new Person("Kirrim Proplov", 73));
        persons.add(new Person("Linus Weenkol", 103));
        persons.add(new Person("Mortimer Jackendale", 24));
        persons.add(new Person("Walt Crinistool", 43));
        persons.add(new Person("Wernher Agusto", 52));
        persons.add(new Person("Julia Sarah Sandy Margret Johanna Cathrin Jenkins", 34));

        createStaticTypeahead();
        createAsyncTypeahead();
        createHighlightTypeahead();
        createTemplateTypeahead();

        initWidget(Binder.INSTANCE.createAndBindUi(this));
    }

    private void createStaticTypeahead() {
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            names.add(person.name);
        }

        StringDataset dataset = new StringDataset(names);
        staticTypeahead = new Typeahead<>(dataset);
        staticTypeahead.setPlaceholder(placeholder);
    }

    private void createAsyncTypeahead() {
        asyncTypeahead = new Typeahead<>(new Dataset<Person>() {
            @Override
            public Object findMatches(String query, SuggestionCallback<Person> callback) {
                List<Suggestion<Person>> suggestions = new ArrayList<>();

                String queryLower = query.toLowerCase();
                for (Person person : persons) {
                    if (person.name.toLowerCase().contains(queryLower)) {
                        Suggestion<Person> s = Suggestion.create(person.name, person, this);
                        suggestions.add(s);
                    }
                }

                callback.execute(suggestions);
                return null;
            }
        });
        asyncTypeahead.setPlaceholder(placeholder);
    }

    private void createHighlightTypeahead() {
        CollectionDataset<Person> dataset = new CollectionDataset<>(persons);
        highlightTypeahead = new Typeahead<>(dataset);
        highlightTypeahead.setPlaceholder(placeholder);
        highlightTypeahead.setHighlight(true);
    }

    private void createTemplateTypeahead() {
        CollectionDataset<Person> dataset = new CollectionDataset<>(persons);
        dataset.setSuggestionTemplate(suggestion -> {
            Person person = suggestion.getData();
            return "<strong>" + person.name + "</strong>&nbsp; - " + person.age + " years";
        });
        dataset.setEmptyTemplate(() -> "<div style=\"color:red;padding:6px 12px\"><strong>Empty, no matches!</strong></div>");
        dataset.setHeaderTemplate(() -> "<span style=\"padding:6px 12px\"><i>Header</i></div>");
        dataset.setFooterTemplate(() -> "<span style=\"padding:6px 12px\"><i>Footer</i></div>");
        templateTypeahead = new Typeahead<>(dataset);
        templateTypeahead.setPlaceholder(placeholder);
        templateTypeahead.setWidth("360px");
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, TypeaheadView> {

        TypeaheadView.Binder INSTANCE = new TypeaheadView_BinderImpl();
    }

    private class Person {

        final String name;
        final int age;

        Person(final String name, final int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}