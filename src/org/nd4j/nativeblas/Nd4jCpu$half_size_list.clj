(ns org.nd4j.nativeblas.Nd4jCpu$half_size_list
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_size_list]))

(defn ->half-size-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_size_list [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_size_list p))
  (^Nd4jCpu$half_size_list []
    (new Nd4jCpu$half_size_list )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_size_list`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_size_list [^Nd4jCpu$half_size_list this ^Long position]
    (-> this (.position position))))

