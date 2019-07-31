(ns org.datavec.local.transforms.transform.LocalTransformFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.transform LocalTransformFunction]))

(defn ->local-transform-function
  "Constructor."
  (^LocalTransformFunction []
    (new LocalTransformFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^LocalTransformFunction this ^java.util.List v-1]
    (-> this (.apply v-1))))

