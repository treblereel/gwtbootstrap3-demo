package org.treblereel.mvp.view.extras;

import org.gwtproject.resources.client.ResourcePrototype;

public class DatePickerView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.extras.DatePickerView_BinderImpl_GenBundle {
  private static DatePickerView_BinderImpl_GenBundleImpl _instance0 = new DatePickerView_BinderImpl_GenBundleImpl();
  private void styleInitializer() {
    style = new org.treblereel.mvp.view.extras.DatePickerView_BinderImpl_GenCss_style() {
      public String getName() {
        return "style";
      }
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          org.gwtproject.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getText() {
        return org.gwtproject.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".MHI0I5-b-a{border:1px solid #888;padding:5px;min-height:300px}.MHI0I5-b-b{margin-left:10px}.MHI0I5-b-f{background-color:#fcf2f2;border-color:#dfb5b4}.MHI0I5-b-g{margin-top:0!important}.MHI0I5-b-c{margin-right:3px}.MHI0I5-b-e{margin-top:5px;margin-bottom:5px}.MHI0I5-b-d>button{margin-left:5px;margin-bottom:5px}") : (".MHI0I5-b-a{border:1px solid #888;padding:5px;min-height:300px}.MHI0I5-b-b{margin-right:10px}.MHI0I5-b-f{background-color:#fcf2f2;border-color:#dfb5b4}.MHI0I5-b-g{margin-top:0!important}.MHI0I5-b-c{margin-left:3px}.MHI0I5-b-e{margin-top:5px;margin-bottom:5px}.MHI0I5-b-d>button{margin-right:5px;margin-bottom:5px}");
      }
      public java.lang.String logRow() {
        return "MHI0I5-b-a";
      }
      public java.lang.String logTitle() {
        return "MHI0I5-b-b";
      }
      public java.lang.String spacing() {
        return "MHI0I5-b-c";
      }
      public java.lang.String buttons() {
        return "MHI0I5-b-d";
      }
      public java.lang.String spacing2() {
        return "MHI0I5-b-e";
      }
      public java.lang.String danger() {
        return "MHI0I5-b-f";
      }
      public java.lang.String marginFix() {
        return "MHI0I5-b-g";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.treblereel.mvp.view.extras.DatePickerView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.treblereel.mvp.view.extras.DatePickerView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.treblereel.mvp.view.extras.DatePickerView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
  }
}
