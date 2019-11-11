package org.treblereel.mvp.view.extras;

import org.gwtproject.resources.client.ResourcePrototype;

public class BootstrapSelectView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenBundle {
  private static BootstrapSelectView_BinderImpl_GenBundleImpl _instance0 = new BootstrapSelectView_BinderImpl_GenBundleImpl();
  private void styleInitializer() {
    style = new org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style() {
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
        return org.gwtproject.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".MHI0I5-l-f{background-color:#fcf2f2;border-color:#dfb5b4}.MHI0I5-l-b{border:1px solid #888;padding:5px;min-height:200px}.MHI0I5-l-c{margin-left:10px}.MHI0I5-l-g{margin-top:0!important}.MHI0I5-l-a{font-weight:bold!important;color:#fff!important;background:#bc0000!important;text-transform:uppercase}.MHI0I5-l-d{margin-right:5px}.MHI0I5-l-e{margin-bottom:20px}") : (".MHI0I5-l-f{background-color:#fcf2f2;border-color:#dfb5b4}.MHI0I5-l-b{border:1px solid #888;padding:5px;min-height:200px}.MHI0I5-l-c{margin-right:10px}.MHI0I5-l-g{margin-top:0!important}.MHI0I5-l-a{font-weight:bold!important;color:#fff!important;background:#bc0000!important;text-transform:uppercase}.MHI0I5-l-d{margin-left:5px}.MHI0I5-l-e{margin-bottom:20px}");
      }
      public java.lang.String special() {
        return "MHI0I5-l-a";
      }
      public java.lang.String logRow() {
        return "MHI0I5-l-b";
      }
      public java.lang.String logTitle() {
        return "MHI0I5-l-c";
      }
      public java.lang.String spacing() {
        return "MHI0I5-l-d";
      }
      public java.lang.String bottom() {
        return "MHI0I5-l-e";
      }
      public java.lang.String danger() {
        return "MHI0I5-l-f";
      }
      public java.lang.String marginFix() {
        return "MHI0I5-l-g";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  private static org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style style;
  
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
