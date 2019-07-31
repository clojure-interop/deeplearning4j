(ns org.nd4j.linalg.io.ReflectionUtils$FieldFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ReflectionUtils$FieldFilter]))

(defn matches
  "var-1 - `java.lang.reflect.Field`

  returns: `boolean`"
  (^Boolean [^ReflectionUtils$FieldFilter this ^java.lang.reflect.Field var-1]
    (-> this (.matches var-1))))

