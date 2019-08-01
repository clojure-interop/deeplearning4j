(ns org.nd4j.nativeblas.Nd4jCpu$float_split_list
  "This operation splits given NDArray into chunks, and stores them into given NDArrayList wert sizes
 Expected arguments:
 list: optional, NDArrayList. if not available - new NDArrayList will be created
 array: array to be split
 sizes: vector with sizes for each chunk"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_split_list]))

(defn ->float-split-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_split_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_split_list p))
  (^Nd4jCpu$float_split_list []
    (new Nd4jCpu$float_split_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_split_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_split_list [^Nd4jCpu$float_split_list this ^Long position]
    (-> this (.position position))))

