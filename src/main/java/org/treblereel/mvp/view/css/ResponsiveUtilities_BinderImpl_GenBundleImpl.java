package org.treblereel.mvp.view.css;

import org.gwtproject.resources.client.ResourcePrototype;

public class ResponsiveUtilities_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.css.ResponsiveUtilities_BinderImpl_GenBundle {
  private static ResponsiveUtilities_BinderImpl_GenBundleImpl _instance0 = new ResponsiveUtilities_BinderImpl_GenBundleImpl();
  private void styleInitializer() {
    style = new org.treblereel.mvp.view.css.ResponsiveUtilities_BinderImpl_GenCss_style() {
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
        return (".MHI0I5-F-a{color:#468847;background-color:#dff0d8;border:1px solid #d6e9c6}.MHI0I5-F-b{margin-bottom:10px}.MHI0I5-F-b>span{border-radius:4px;border:1px solid #ccc;padding:10px;text-align:center}");
      }
      public java.lang.String visible() {
        return "MHI0I5-F-a";
      }
      public java.lang.String column() {
        return "MHI0I5-F-b";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.treblereel.mvp.view.css.ResponsiveUtilities_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.treblereel.mvp.view.css.ResponsiveUtilities_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.treblereel.mvp.view.css.ResponsiveUtilities_BinderImpl_GenCss_style style;
  
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
