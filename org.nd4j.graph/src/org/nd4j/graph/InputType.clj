(ns org.nd4j.graph.InputType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph InputType]))

(def *-undefined
  "Static Constant.

  type: byte"
  InputType/UNDEFINED)

(def *-numeric
  "Static Constant.

  type: byte"
  InputType/NUMERIC)

(def *-stringular
  "Static Constant.

  type: byte"
  InputType/STRINGULAR)

(def *-numeric-set
  "Static Constant.

  type: byte"
  InputType/NUMERIC_SET)

(def *-stringular-set
  "Static Constant.

  type: byte"
  InputType/STRINGULAR_SET)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  InputType/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (InputType/name e)))

