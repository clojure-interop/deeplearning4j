(ns org.nd4j.linalg.env.impl.WorkspacesSpillAction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.env.impl WorkspacesSpillAction]))

(defn ->workspaces-spill-action
  "Constructor."
  (^WorkspacesSpillAction []
    (new WorkspacesSpillAction )))

(defn target-variable
  "Description copied from interface: EnvironmentalAction

  returns: `java.lang.String`"
  (^java.lang.String [^WorkspacesSpillAction this]
    (-> this (.targetVariable))))

(defn process
  "Description copied from interface: EnvironmentalAction

  value - `java.lang.String`"
  ([^WorkspacesSpillAction this ^java.lang.String value]
    (-> this (.process value))))

