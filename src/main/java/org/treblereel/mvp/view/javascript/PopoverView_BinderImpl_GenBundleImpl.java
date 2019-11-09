package org.treblereel.mvp.view.javascript;

import org.gwtproject.resources.client.ResourcePrototype;

public class PopoverView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenBundle {
  private static PopoverView_BinderImpl_GenBundleImpl _instance0 = new PopoverView_BinderImpl_GenBundleImpl();
  private void styleInitializer() {
    style = new org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style() {
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
        return org.gwtproject.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".MHI0I5-z-a{margin-left:10px}.MHI0I5-z-b{display:inline}") : (".MHI0I5-z-a{margin-right:10px}.MHI0I5-z-b{display:inline}");
      }
      public java.lang.String margin() {
        return "MHI0I5-z-a";
      }
      public java.lang.String inline() {
        return "MHI0I5-z-b";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style style;
  
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
