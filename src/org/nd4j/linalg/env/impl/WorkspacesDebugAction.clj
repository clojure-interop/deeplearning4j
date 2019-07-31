(ns org.nd4j.linalg.env.impl.WorkspacesDebugAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl WorkspacesDebugAction]))

(defn ->workspaces-debug-action
  "Constructor."
  (^WorkspacesDebugAction []
    (new WorkspacesDebugAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^WorkspacesDebugAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^WorkspacesDebugAction this ^java.lang.String value]
    (-> this (.process value))))

