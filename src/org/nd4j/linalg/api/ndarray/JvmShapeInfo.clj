(ns org.nd4j.linalg.api.ndarray.JvmShapeInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray JvmShapeInfo]))

(defn ->jvm-shape-info
  "Constructor.

  java-shape-information - `long[]`"
  (^JvmShapeInfo [java-shape-information]
    (new JvmShapeInfo java-shape-information)))

