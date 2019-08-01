(ns org.nd4j.graph.ProfilingMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.graph ProfilingMode]))

(def *-none
  "Static Constant.

  type: byte"
  ProfilingMode/NONE)

(def *-nan-panic
  "Static Constant.

  type: byte"
  ProfilingMode/NAN_PANIC)

(def *-inf-panic
  "Static Constant.

  type: byte"
  ProfilingMode/INF_PANIC)

(def *-any-panic
  "Static Constant.

  type: byte"
  ProfilingMode/ANY_PANIC)

(def *-names
  "Static Constant.

  type: java.lang.String[]"
  ProfilingMode/names)

(defn *name
  "e - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer e]
    (ProfilingMode/name e)))

