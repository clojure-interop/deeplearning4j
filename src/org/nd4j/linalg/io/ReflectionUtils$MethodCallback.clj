(ns org.nd4j.linalg.io.ReflectionUtils$MethodCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ReflectionUtils$MethodCallback]))

(defn do-with
  "var-1 - `java.lang.reflect.Method`

  throws: java.lang.IllegalArgumentException"
  ([^ReflectionUtils$MethodCallback this ^java.lang.reflect.Method var-1]
    (-> this (.doWith var-1))))

