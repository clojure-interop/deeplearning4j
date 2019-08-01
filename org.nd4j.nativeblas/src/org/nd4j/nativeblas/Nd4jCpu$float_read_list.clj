(ns org.nd4j.nativeblas.Nd4jCpu$float_read_list
  "This operations selects specified index fron NDArrayList and returns it as NDArray
 Expected arguments:
 x: non-empty list
 indices: optional, scalar with index
 Int args:
 optional, index"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_read_list]))

(defn ->float-read-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_read_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_read_list p))
  (^Nd4jCpu$float_read_list []
    (new Nd4jCpu$float_read_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_read_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_read_list [^Nd4jCpu$float_read_list this ^Long position]
    (-> this (.position position))))

