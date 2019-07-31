(ns org.deeplearning4j.graph.models.BinaryTree
  "Binary tree interface, used in DeepWalk"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models BinaryTree]))

(defn get-code
  "element - `int`

  returns: `long`"
  (^Long [^BinaryTree this ^Integer element]
    (-> this (.getCode element))))

(defn get-code-length
  "element - `int`

  returns: `int`"
  (^Integer [^BinaryTree this ^Integer element]
    (-> this (.getCodeLength element))))

(defn get-code-string
  "element - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^BinaryTree this ^Integer element]
    (-> this (.getCodeString element))))

(defn get-path-inner-nodes
  "element - `int`

  returns: `int[]`"
  ([^BinaryTree this ^Integer element]
    (-> this (.getPathInnerNodes element))))

