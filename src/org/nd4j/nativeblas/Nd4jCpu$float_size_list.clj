(ns org.nd4j.nativeblas.Nd4jCpu$float_size_list
  "This operations returns scalar, with number of existing arrays within given NDArrayList
 Expected arguments:
 x: list"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_size_list]))

(defn ->float-size-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_size_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_size_list p))
  (^Nd4jCpu$float_size_list []
    (new Nd4jCpu$float_size_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_size_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_size_list [^Nd4jCpu$float_size_list this ^Long position]
    (-> this (.position position))))

