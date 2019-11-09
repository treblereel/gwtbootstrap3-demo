package org.treblereel.mvp.view.generic;

import org.gwtproject.resources.client.ResourcePrototype;

public class MainView_BinderImpl_GenBundleImpl implements org.treblereel.mvp.view.generic.MainView_BinderImpl_GenBundle {
  private static MainView_BinderImpl_GenBundleImpl _instance0 = new MainView_BinderImpl_GenBundleImpl();
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
