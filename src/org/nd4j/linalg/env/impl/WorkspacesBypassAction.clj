(ns org.nd4j.linalg.env.impl.WorkspacesBypassAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl WorkspacesBypassAction]))

(defn ->workspaces-bypass-action
  "Constructor."
  (^WorkspacesBypassAction []
    (new WorkspacesBypassAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^WorkspacesBypassAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^WorkspacesBypassAction this ^java.lang.String value]
    (-> this (.process value))))

