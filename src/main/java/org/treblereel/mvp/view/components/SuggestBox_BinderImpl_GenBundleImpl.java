package org.treblereel.mvp.view.components;

import org.gwtproject.resources.client.ResourcePrototype;

public class SuggestBox_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.components.SuggestBox_BinderImpl_GenBundle {
  private static SuggestBox_BinderImpl_GenBundleImpl _instance0 = new SuggestBox_BinderImpl_GenBundleImpl();
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
