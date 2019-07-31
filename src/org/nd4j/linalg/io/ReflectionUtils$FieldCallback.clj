(ns org.nd4j.linalg.io.ReflectionUtils$FieldCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ReflectionUtils$FieldCallback]))

(defn do-with
  "var-1 - `java.lang.reflect.Field`

  throws: java.lang.IllegalArgumentException"
  ([^ReflectionUtils$FieldCallback this ^java.lang.reflect.Field var-1]
    (-> this (.doWith var-1))))

