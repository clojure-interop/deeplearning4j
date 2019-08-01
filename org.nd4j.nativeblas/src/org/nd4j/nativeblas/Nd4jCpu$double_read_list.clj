(ns org.nd4j.nativeblas.Nd4jCpu$double_read_list
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_read_list]))

(defn ->double-read-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_read_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_read_list p))
  (^Nd4jCpu$double_read_list []
    (new Nd4jCpu$double_read_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_read_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_read_list [^Nd4jCpu$double_read_list this ^Long position]
    (-> this (.position position))))

