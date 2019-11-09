package org.treblereel.mvp.view.javascript;

import org.gwtproject.resources.client.ResourcePrototype;

public class AffixView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.javascript.AffixView_BinderImpl_GenBundle {
  private static AffixView_BinderImpl_GenBundleImpl _instance0 = new AffixView_BinderImpl_GenBundleImpl();
  private static java.util.HashMap<String, ResourcePrototype> resourceMap;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
    };
  }
  public ResourcePrototype getResource(String name) {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<String, ResourcePrototype>();
      }
      return resourceMap.get(name);
  }
}
