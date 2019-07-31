(ns org.nd4j.graph.OutputMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph OutputMode]))

(def *-implicit
  "Static Constant.

  type: byte"
  OutputMode/IMPLICIT)

(def *-explicit
  "Static Constant.

  type: byte"
  OutputMode/EXPLICIT)

(def *-explicit-and-implicit
  "Static Constant.

  type: byte"
  OutputMode/EXPLICIT_AND_IMPLICIT)

(def *-variable-space
  "Static Constant.

  type: byte"
  OutputMode/VARIABLE_SPACE)

(def *-optimized
  "Static Constant.

  type: byte"
  OutputMode/OPTIMIZED)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  OutputMode/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (OutputMode/name e)))

