(ns org.datavec.local.transforms.sequence.LocalSequenceTransformFunction
  "Function for transforming sequences using a Transform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.sequence LocalSequenceTransformFunction]))

(defn ->local-sequence-transform-function
  "Constructor."
  (^LocalSequenceTransformFunction []
    (new LocalSequenceTransformFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `java.util.List`

  returns: Result - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^LocalSequenceTransformFunction this ^java.util.List v-1]
    (-> this (.apply v-1))))

