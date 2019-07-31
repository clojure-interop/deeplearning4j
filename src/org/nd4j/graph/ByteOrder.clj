(ns org.nd4j.graph.ByteOrder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph ByteOrder]))

(def *-le
  "Static Constant.

  type: byte"
  ByteOrder/LE)

(def *-be
  "Static Constant.

  type: byte"
  ByteOrder/BE)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  ByteOrder/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (ByteOrder/name e)))

