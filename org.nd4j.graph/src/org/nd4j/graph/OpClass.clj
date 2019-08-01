(ns org.nd4j.graph.OpClass
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph OpClass]))

(def *-transform
  "Static Constant.

  type: byte"
  OpClass/TRANSFORM)

(def *-reduction
  "Static Constant.

  type: byte"
  OpClass/REDUCTION)

(def *-multiplicator
  "Static Constant.

  type: byte"
  OpClass/MULTIPLICATOR)

(def *-graph
  "Static Constant.

  type: byte"
  OpClass/GRAPH)

(def *-conditional
  "Static Constant.

  type: byte"
  OpClass/CONDITIONAL)

(def *-loop
  "Static Constant.

  type: byte"
  OpClass/LOOP)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  OpClass/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (OpClass/name e)))

