(ns org.nd4j.nativeblas.Nd4jCpu$double_split_list
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_split_list]))

(defn ->double-split-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_split_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_split_list p))
  (^Nd4jCpu$double_split_list []
    (new Nd4jCpu$double_split_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_split_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_split_list [^Nd4jCpu$double_split_list this ^Long position]
    (-> this (.position position))))

