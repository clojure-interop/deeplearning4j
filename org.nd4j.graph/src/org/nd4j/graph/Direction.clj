(ns org.nd4j.graph.Direction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph Direction]))

(def *-forward-only
  "Static Constant.

  type: byte"
  Direction/FORWARD_ONLY)

(def *-forward-and-backward
  "Static Constant.

  type: byte"
  Direction/FORWARD_AND_BACKWARD)

(def *-backward-only
  "Static Constant.

  type: byte"
  Direction/BACKWARD_ONLY)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  Direction/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (Direction/name e)))

