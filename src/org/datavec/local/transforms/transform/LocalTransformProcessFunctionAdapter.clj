(ns org.datavec.local.transforms.transform.LocalTransformProcessFunctionAdapter
  "Function for executing a transform process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.transform LocalTransformProcessFunctionAdapter]))

(defn ->local-transform-process-function-adapter
  "Constructor.

  transform-process - `org.datavec.api.transform.TransformProcess`"
  (^LocalTransformProcessFunctionAdapter [^org.datavec.api.transform.TransformProcess transform-process]
    (new LocalTransformProcessFunctionAdapter transform-process)))

(defn call
  "v-1 - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^LocalTransformProcessFunctionAdapter this ^java.util.List v-1]
    (-> this (.call v-1))))

