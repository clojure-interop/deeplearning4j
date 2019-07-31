(ns org.nd4j.linalg.io.ReflectionUtils$MethodFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ReflectionUtils$MethodFilter]))

(defn matches
  "var-1 - `java.lang.reflect.Method`

  returns: `boolean`"
  (^Boolean [^ReflectionUtils$MethodFilter this ^java.lang.reflect.Method var-1]
    (-> this (.matches var-1))))

