package org.treblereel.mvp.view.extras;

import org.gwtproject.resources.client.ResourcePrototype;

public class NotifyView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenBundle {
  private static NotifyView_BinderImpl_GenBundleImpl _instance0 = new NotifyView_BinderImpl_GenBundleImpl();
  private void styleInitializer() {
    style = new org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style() {
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
        return org.gwtproject.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".MHI0I5-H-b{background-color:#fcf2f2;border-color:#dfb5b4}.MHI0I5-H-c{margin-top:0!important}.MHI0I5-H-a{margin-right:5px}") : (".MHI0I5-H-b{background-color:#fcf2f2;border-color:#dfb5b4}.MHI0I5-H-c{margin-top:0!important}.MHI0I5-H-a{margin-left:5px}");
      }
      public java.lang.String spacing() {
        return "MHI0I5-H-a";
      }
      public java.lang.String danger() {
        return "MHI0I5-H-b";
      }
      public java.lang.String marginFix() {
        return "MHI0I5-H-c";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style style;
  
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