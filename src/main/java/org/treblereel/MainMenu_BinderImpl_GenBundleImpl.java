package org.treblereel;

import org.gwtproject.resources.client.ResourcePrototype;

public class MainMenu_BinderImpl_GenBundleImpl implements org.treblereel.MainMenu_BinderImpl_GenBundle {
  private static MainMenu_BinderImpl_GenBundleImpl _instance0 = new MainMenu_BinderImpl_GenBundleImpl();
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
