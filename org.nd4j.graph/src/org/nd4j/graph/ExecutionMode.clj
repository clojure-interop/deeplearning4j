(ns org.nd4j.graph.ExecutionMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph ExecutionMode]))

(def *-sequential
  "Static Constant.

  type: byte"
  ExecutionMode/SEQUENTIAL)

(def *-strict
  "Static Constant.

  type: byte"
  ExecutionMode/STRICT)

(def *-auto
  "Static Constant.

  type: byte"
  ExecutionMode/AUTO)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  ExecutionMode/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (ExecutionMode/name e)))

