(ns org.nd4j.nativeblas.Nd4jCpu$float_write_list
  "This operations puts given NDArray into (optionally) given NDArrayList.
 If no NDArrayList was provided - new one will be created"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_write_list]))

(defn ->float-write-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_write_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_write_list p))
  (^Nd4jCpu$float_write_list []
    (new Nd4jCpu$float_write_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_write_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_write_list [^Nd4jCpu$float_write_list this ^Long position]
    (-> this (.position position))))

