package org.treblereel.mvp.view.javascript;

import org.gwtproject.resources.client.ResourcePrototype;

public class TooltipView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenBundle {
  private static TooltipView_BinderImpl_GenBundleImpl _instance0 = new TooltipView_BinderImpl_GenBundleImpl();
  private void styleInitializer() {
    style = new org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style() {
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
        return org.gwtproject.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".MHI0I5-G-b{margin-left:10px}.MHI0I5-G-c{display:inline}.MHI0I5-G-a{max-width:400px}") : (".MHI0I5-G-b{margin-right:10px}.MHI0I5-G-c{display:inline}.MHI0I5-G-a{max-width:400px}");
      }
      public java.lang.String wider() {
        return "MHI0I5-G-a";
      }
      public java.lang.String margin() {
        return "MHI0I5-G-b";
      }
      public java.lang.String inline() {
        return "MHI0I5-G-c";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style style;
  
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
