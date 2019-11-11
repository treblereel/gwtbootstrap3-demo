package org.treblereel.mvp.view.extras;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap3
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
import java.util.Arrays;
import java.util.List;

import elemental2.core.JsArray;
import elemental2.dom.DomGlobal;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.ListBox;
import org.gwtbootstrap3.client.ui.html.Paragraph;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteBlurEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteChangeEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteEnterEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteFocusEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteImageUploadEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteImageUploadEvent.ImageFile;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteInitEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyDownEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyUpEvent;
import org.gwtbootstrap3.extras.summernote.client.event.SummernotePasteEvent;
import org.gwtbootstrap3.extras.summernote.client.ui.Summernote;
import org.gwtbootstrap3.extras.summernote.client.ui.base.DefaultHintHandler;
import org.gwtbootstrap3.extras.summernote.client.ui.base.SummernoteFontName;
import org.gwtbootstrap3.extras.summernote.client.ui.base.SummernoteLanguage;
import org.gwtbootstrap3.extras.summernote.client.ui.base.Toolbar;
import org.gwtbootstrap3.extras.summernote.client.ui.base.ToolbarButton;
import org.gwtproject.dom.client.Document;
import org.gwtproject.dom.client.ImageElement;
import org.gwtproject.dom.client.Node;
import org.gwtproject.dom.style.shared.Unit;
import org.gwtproject.event.dom.client.ChangeEvent;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.http.client.Request;
import org.gwtproject.http.client.RequestBuilder;
import org.gwtproject.http.client.RequestCallback;
import org.gwtproject.http.client.RequestException;
import org.gwtproject.http.client.Response;
import org.gwtproject.resources.client.JSON;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiHandler;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;
import org.gwtproject.user.window.client.Window;

/**
 * @author godi
 * @author Xiaodong Sun
 */
public class SummernoteView extends Composite {

    @UiField
    Summernote customToolbar;
    @UiField
    Summernote apiTest;
    @UiField
    ListBox languageBox;
    @UiField
    Summernote languageNote;
    @UiField
    Summernote hintWords;
    @UiField
    Summernote hintEmoji;
    @UiField
    Summernote events;
    @UiField
    Button clearLogButton;
    @UiField
    FlowPanel logRow;

    public SummernoteView() {

        initWidget(Binder.INSTANCE.createAndBindUi(this));
    }

    @UiHandler("setCode")
    void setCode(final ClickEvent event) {
        apiTest.setCode("<b>This is custom code. </b><u>OH YA</u>");
    }

    @UiHandler("getCode")
    void getCode(final ClickEvent event) {
        Window.alert(apiTest.getCode());
    }

    @UiHandler("clear")
    void clear(final ClickEvent event) {
        apiTest.clear();
    }

    @UiHandler("isEmpty")
    void isEmpty(final ClickEvent event) {
        Window.alert("" + apiTest.isEmpty());
    }

    @UiHandler("enable")
    void enable(final ClickEvent event) {
        apiTest.setEnabled(true);
    }

    @UiHandler("disable")
    void disable(final ClickEvent event) {
        apiTest.setEnabled(false);
    }

    @UiHandler("reset")
    void reset(final ClickEvent event) {
        apiTest.reset();
    }

    @UiHandler("clearLogButton")
    public void handleClearLog(final ClickEvent event) {
        logRow.clear();
    }

    @UiHandler("languageBox")
    void onChangeLanguage(final ChangeEvent event) {
        String language = languageBox.getSelectedValue();
        languageNote.setLanguage(SummernoteLanguage.valueOf(language));
        languageNote.reconfigure();
    }

    @UiHandler("events")
    void onSummernoteInit(final SummernoteInitEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Init Event Fired!");
        logRow.add(logEntry);
    }

    @UiHandler("events")
    void onSummernoteEnter(final SummernoteEnterEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Enter Event Fired!");
        logRow.add(logEntry);
    }

    @UiHandler("events")
    void onSummernoteFocus(final SummernoteFocusEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Focus Event Fired!");
        logRow.add(logEntry);
    }

    @UiHandler("events")
    void onSummernoteBlur(final SummernoteBlurEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Blur Event Fired!");
        logRow.add(logEntry);
    }

    @UiHandler("events")
    void onSummernoteKeyUp(final SummernoteKeyUpEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Key Up Event Fired. The key code is:" + event.getNativeEvent().getKeyCode());
        logRow.add(logEntry);
    }

    @UiHandler("events")
    void onSummernoteKeyDown(final SummernoteKeyDownEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Key Down Event Fired. The key code is:" + event.getNativeEvent().getKeyCode());
        logRow.add(logEntry);
    }

    @UiHandler("events")
    public void onSummernotePaste(final SummernotePasteEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Paste Event Fired!");
        logRow.add(logEntry);
    }

    @UiHandler("events")
    public void onSummernoteImageUpload(final SummernoteImageUploadEvent event) {
        final Paragraph logEntry = new Paragraph();
        StringBuilder sb = new StringBuilder("Image Upload Event Fired:");
        JsArray<ImageFile> images = event.getImages();
        for (int i = 0; i < images.length; i++) {
            sb.append("<br>").append(images.getAt(i).getMetadata());
        }
        logEntry.setHTML(sb.toString());
        logRow.add(logEntry);
        events.insertImages(images);
    }

    @UiHandler("events")
    public void onSummernoteChange(final SummernoteChangeEvent event) {
        final Paragraph logEntry = new Paragraph();
        logEntry.setText("Change Event Fired!");
        logRow.add(logEntry);
    }

    public void init() {
        // Hint for words
        hintWords.setHint("\\b(\\w{1,})$", new DefaultHintHandler() {

            List<String> words = new ArrayList<>(
                    Arrays.asList("apple", "orange", "watermelon", "lemon"));

            @Override
            public String[] onSearch(String keyword) {
                List<String> result = new ArrayList<>(0);
                for (String word : words) {
                    if (word.indexOf(keyword) == 0) {
                        result.add(word);
                    }
                }
                return result.toArray(new String[0]);
            }
        });

        // Hint for emoji
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, "https://api.github.com/emojis");
        requestBuilder.setCallback(new RequestCallback() {

            @Override
            public void onResponseReceived(Request request, Response response) {
                String text = response.getText();
                final JsPropertyMap emojiUrls = Js.uncheckedCast(JSON.parse(text));
                hintEmoji.setHint(":([\\-+\\w]+)$", new DefaultHintHandler() {

                    @Override
                    public String[] onSearch(String keyword) {
                        List<String> result = new ArrayList<>(0);
                        emojiUrls.forEach(key -> {
                            if (key.indexOf(keyword) == 0) {
                                result.add(key);
                            }

                        });
                        return result.toArray(new String[0]);
                    }

                    @Override
                    public String getTemplate(String item) {
                        String url = emojiUrls.get(item).toString();
                        return "<img src=\"" + url + "\" style=\"width:20px\"/> :" + item + ":";
                    }

                    @Override
                    public Node getContent(String item) {
                        String url = emojiUrls.get(item).toString();
                        ImageElement img = Document.get().createImageElement();
                        img.setSrc(url);
                        img.getStyle().setWidth(20, Unit.PX);
                        return img;
                    }
                });
                hintEmoji.reconfigure();
            }

            @Override
            public void onError(Request request, Throwable exception) {
                DomGlobal.console.log("Error while requesting emojis", exception);
            }
        });
        try {
            requestBuilder.send();
        } catch (RequestException e) {
            DomGlobal.console.log("Error while sending request for emojis", e);
        }

        // Customize toolbar
        customToolbar.setFontNames(SummernoteFontName.HELVETICA_NEUE, SummernoteFontName.VERDANA, SummernoteFontName.ARIAL);
        customToolbar.setToolbar(new Toolbar()
                                         .addGroup(ToolbarButton.FONT_NAME, ToolbarButton.FONT_SIZE)
                                         .addGroup(ToolbarButton.UNDO, ToolbarButton.REDO)
                                         .addGroup(ToolbarButton.CODE_VIEW)
                                         .addGroup(ToolbarButton.TABLE));

        // Language
        SummernoteLanguage defaultLanguage = languageNote.getLanguage();
        for (SummernoteLanguage language : SummernoteLanguage.values()) {
            languageBox.addItem(language.getCode(), language.name());
        }
        languageBox.setSelectedIndex(defaultLanguage.ordinal());
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, SummernoteView> {

        SummernoteView.Binder INSTANCE = new SummernoteView_BinderImpl();
    }
}